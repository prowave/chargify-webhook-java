package io.prowave.chargify.webhook;

import static org.junit.Assert.*;

import java.io.File;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.junit.Test;


import io.prowave.chargify.webhook.bean.BillingDateChange;
import io.prowave.chargify.webhook.bean.ComponentAllocationChange;
import io.prowave.chargify.webhook.bean.CustomerUpdate;
import io.prowave.chargify.webhook.bean.DunningStepReached;
import io.prowave.chargify.webhook.bean.ExpirationDateChange;
import io.prowave.chargify.webhook.bean.ExpiringCard;
import io.prowave.chargify.webhook.bean.Payload;
import io.prowave.chargify.webhook.bean.PaymentFailure;
import io.prowave.chargify.webhook.bean.RenewalFailure;
import io.prowave.chargify.webhook.bean.SignupFailure;
import io.prowave.chargify.webhook.bean.Subscription;
import io.prowave.chargify.webhook.bean.SubscriptionProductChange;
import io.prowave.chargify.webhook.bean.SubscriptionStateChange;
import io.prowave.chargify.webhook.bean.TrialEndNotice;
import io.prowave.chargify.webhook.bean.UpcomingRenewalNotice;
import io.prowave.chargify.webhook.bean.UpgradeDownGradeFailure;
import io.prowave.chargify.webhook.bean.UpgradeDownGradeSuccess;

public class ChargifyConvertProcessorTest {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").withZone(ZoneOffset.UTC);

	@Test
	public void shouldReadBillingDateChange() throws Exception {

		BillingDateChange c = (BillingDateChange) process("./src/test/resources/samples/webhook_billing_date_change.txt", ChargifyEvent.BILLING_DATE_CHANGE);

		assertNotNull(c);
		assertEquals("2012-10-01 03:49:43", c.getSubscription().getPreviousBillingDate().format(formatter));


	}

	@Test
	public void shouldReadCompAllocChanged() throws Exception {

		ComponentAllocationChange c = (ComponentAllocationChange) process("./src/test/resources/samples/webhook_comp_alloc_change.txt", ChargifyEvent.COMPONENT_ALLOCATION_CHANGE);

		assertNotNull(c);
		assertEquals(Integer.valueOf(3), c.getNewAllocation());
		assertEquals(Integer.valueOf(0), c.getPreviousAllocation());

	}

	@Test
	public void shouldReadCustomerUpdate() throws Exception {

		CustomerUpdate c = (CustomerUpdate) process("./src/test/resources/samples/webhook_customer_update.txt", ChargifyEvent.CUSTOMER_UPDATE);

		assertNotNull(c);
		assertEquals("2012-09-09 03:38:32", c.getCustomer().getUpdatedAt().format(formatter));

		try{
			c.setSubscription(new Subscription());
			fail();
		}catch(UnsupportedOperationException ns){

		}

	}

	@Test
	public void shouldReadDunningStepReached() throws Exception {

		DunningStepReached c = (DunningStepReached) process("./src/test/resources/samples/webhook_dunning_step_reached.txt", ChargifyEvent.DUNNING_STEP_REACHED);

		assertNotNull(c);
		assertEquals(Integer.valueOf(1), c.getCurrentStep().getDayThreshold());
		assertEquals(Integer.valueOf(2), c.getNextStep().getDayThreshold());
		assertEquals("2016-12-20 06:55:55", c.getDunner().getLastAttemptedAt().format(formatter));

	}

	@Test
	public void shouldReadExpirationDateChange() throws Exception {

		ExpirationDateChange c = (ExpirationDateChange) process("./src/test/resources/samples/webhook_expiration_date_change.txt", ChargifyEvent.EXPIRATION_DATE_CHANGE);

		assertNotNull(c);
		assertEquals("2022-06-14 03:49:43", c.getSubscription().getPreviousExpiresAt().format(formatter));

		assertNull(c.getSubscription().getExpiresAt());

	}

	@Test
	public void shouldReadExpiringCard() throws Exception {

		ExpiringCard c = (ExpiringCard) process("./src/test/resources/samples/webhook_expiring_card.txt", ChargifyEvent.EXPIRING_CARD);

		assertNotNull(c);
		assertEquals("2016",c.getSubscription().getCreditCard().getExpirationYear());
		assertEquals("4",c.getSubscription().getCreditCard().getExpirationMonth());
	}

	@Test
	public void shouldReadPaymentFailure() throws Exception {

		PaymentFailure c = (PaymentFailure) process("./src/test/resources/samples/webhook_payment_failure.txt", ChargifyEvent.PAYMENT_FAILURE);

		assertNotNull(c);
		assertEquals(false,c.getTransaction().getSuccess());

	}

	@Test
	public void shouldReadRenewalFailure() throws Exception {

		RenewalFailure c = (RenewalFailure) process("./src/test/resources/samples/webhook_renewal_failure.txt", ChargifyEvent.RENEWAL_FAILURE);

		assertNotNull(c);
		assertEquals("active",c.getSubscription().getState());

	}

	@Test
	public void shouldReadSignupFail() throws Exception {

		SignupFailure c = (SignupFailure) process("./src/test/resources/samples/webhook_signup_fail.txt", ChargifyEvent.SIGNUP_FAILURE);

		assertNotNull(c);
		assertEquals("failed_to_create",c.getSubscription().getState());

	}

	@Test
	public void shouldReadSubProductChange() throws Exception {

		SubscriptionProductChange c = (SubscriptionProductChange) process("./src/test/resources/samples/webhook_sub_product_change.txt", ChargifyEvent.SUBSCRIPTION_PRODUCT_CHANGE);

		assertNotNull(c);
		assertEquals("handle_6a9273b8a",c.getPreviousProduct().getHandle());

	}

	@Test
	public void shouldReadSubStateChange() throws Exception {

		SubscriptionStateChange c = (SubscriptionStateChange) process("./src/test/resources/samples/webhook_sub_state_change.txt", ChargifyEvent.SUBSCRIPTION_STATE_CHANGE);

		assertNotNull(c);
		assertEquals("active",c.getSubscription().getPreviousState());
		assertEquals("inactive",c.getSubscription().getState());

	}

	@Test
	public void shouldReadTrialEndNotice() throws Exception {

		TrialEndNotice c = (TrialEndNotice) process("./src/test/resources/samples/webhook_trial_end_notice.txt", ChargifyEvent.TRIAL_END_NOTICE);

		assertNotNull(c);
		assertEquals("john@example.com",c.getCustomer().getEmail());
		assertEquals("Jane",c.getPaymentProfile().getFirstName());
		assertEquals(Integer.valueOf(200),c.getEstimatedRenewalAmountInCents());
		assertEquals("End of trial notice sent",c.getMessage());
		assertEquals("Pro",c.getProduct().getName());
		assertEquals("active",c.getSubscription().getState());
	}

	@Test
	public void shouldReadUpcomingRenewalNotice() throws Exception {

		UpcomingRenewalNotice c = (UpcomingRenewalNotice) process("./src/test/resources/samples/webhook_upcoming_renewal.txt", ChargifyEvent.UPCOMING_RENEWAL_NOTICE);

		assertNotNull(c);
		assertEquals("john@example.com",c.getCustomer().getEmail());
		assertEquals("Jane",c.getPaymentProfile().getFirstName());
		assertEquals(Integer.valueOf(100),c.getEstimatedRenewalAmountInCents());
		assertEquals("Upcoming renewal notice sent",c.getMessage());
		assertEquals("Pro",c.getProduct().getName());
		assertEquals("active",c.getSubscription().getState());
	}

	@Test
	public void shouldReadUpgradeDowngradeFailure() throws Exception {

		UpgradeDownGradeFailure c = (UpgradeDownGradeFailure) process("./src/test/resources/samples/webhook_upgrade_downgrade_failure.txt", ChargifyEvent.UPGRADE_DOWNGRADE_FAILURE);

		assertNotNull(c);
		assertEquals("handle_6a9273b8a",  c.getTargetProduct().getHandle());
		assertEquals("active",c.getSubscription().getState());
	}

	@Test
	public void shouldReadUpgradeDowngradeSuccess() throws Exception {

		UpgradeDownGradeSuccess c = (UpgradeDownGradeSuccess) process("./src/test/resources/samples/webhook_upgrade_downgrade_success.txt", ChargifyEvent.UPGRADE_DOWNGRADE_SUCCESS);

		assertNotNull(c);
		assertEquals("handle_6a9273b8a",  c.getPreviousProduct().getHandle());
		assertEquals("active",c.getSubscription().getState());
	}

	private Payload process(String sample, ChargifyEvent type) throws Exception{

		String body = FileUtils.readFileToString(new File(sample));
		ChargifyWebhook chargifyWebhook = ChargifyWebhookParser.parse(body);
		Class<? extends Payload> clazz = null;

		switch (type) {
		case DUNNING_STEP_REACHED :
			clazz=DunningStepReached.class;
			break;
		case SUBSCRIPTION_STATE_CHANGE :
			clazz=SubscriptionStateChange.class;
			break;
		case SUBSCRIPTION_PRODUCT_CHANGE :
			clazz=SubscriptionProductChange.class;
			break;
		case END_OF_TRIAL_NOTICE :
			clazz=TrialEndNotice.class;
			break;
		case TRIAL_END_NOTICE :
			clazz=TrialEndNotice.class;
			break;
		case UPGRADE_DOWNGRADE_SUCCESS :
			clazz=UpgradeDownGradeSuccess.class;
			break;
		case RENEWAL_FAILURE :
			clazz=RenewalFailure.class;
			break;
		case COMPONENT_ALLOCATION_CHANGE :
			clazz=ComponentAllocationChange.class;
			break;
		case PAYMENT_FAILURE :
			clazz=PaymentFailure.class;
			break;
		case SIGNUP_FAILURE :
			clazz=SignupFailure.class;
			break;
		case BILLING_DATE_CHANGE :
			clazz=BillingDateChange.class;
			break;
		case CUSTOMER_UPDATE :
			clazz=CustomerUpdate.class;
			break;
		case UPGRADE_DOWNGRADE_FAILURE :
			clazz=UpgradeDownGradeFailure.class;
			break;
		case EXPIRING_CARD :
			clazz=ExpiringCard.class;
			break;
		case UPCOMING_RENEWAL_NOTICE :
			clazz=UpcomingRenewalNotice.class;
			break;
		case EXPIRATION_DATE_CHANGE :
			clazz=ExpirationDateChange.class;
			break;

		default:

			break;
		}

		Payload payload = ChargifyMessageFactory.createChargifyMessage(chargifyWebhook.getPayload(), clazz);

		return payload;
	}
}
