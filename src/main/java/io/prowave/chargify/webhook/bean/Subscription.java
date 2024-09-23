/*
 * Copyright 2016 Prowave Consulting, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package io.prowave.chargify.webhook.bean;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription {

	private Long id;
	private String state;
	private Customer customer;
	private Product product;

	@JsonProperty("credit_card")
	private CreditCard creditCard;

	@JsonProperty("balance_in_cents")
	private Long balanceInCents;

	@JsonProperty("activated_at")
	private OffsetDateTime activatedAt;

	@JsonProperty("trial_started_at")
	private OffsetDateTime trialStartedAt;

	@JsonProperty("trial_ended_at")
	private OffsetDateTime trialEndedAt;

	@JsonProperty("expires_at")
	private OffsetDateTime expiresAt;

	@JsonProperty("canceled_at")
	private OffsetDateTime cancelledAt;

	@JsonProperty("delayed_cancel_at")
	private OffsetDateTime delayedCancelAt;

	@JsonProperty("created_at")
	private OffsetDateTime createdAt;

	@JsonProperty("updated_at")
	private OffsetDateTime updatedAt;

	@JsonProperty("next_assessment_at")
	private OffsetDateTime nextAssessmentAt;

	@JsonProperty("current_period_started_at")
	private OffsetDateTime currentPeriodStartedAt;

	@JsonProperty("current_period_ends_at")
	private OffsetDateTime currentPeriodEndsAt;

	@JsonProperty("payment_collection_method")
	private String paymentCollectionMethod;

	@JsonProperty("cancellation_message")
	private String cancellationMessage;

	@JsonProperty("cancel_at_end_of_period")
	private Boolean cancelAtEndOfPeriod;

	@JsonProperty("signup_revenue")
	private Double signupRevenue;

	@JsonProperty("total_revenue_in_cents")
	private Long totalRevenueInCents;

	@JsonProperty("product_price_in_cents")
	private Long productPriceInCents;

	@JsonProperty("signup_payment_id")
	private Long signupPaymentId;

	@JsonProperty("next_product_id")
	private Long nextProductId;

	@JsonProperty("previous_state")
	private String previousState;

	@JsonProperty("coupon_code")
	private String couponCode;

	@JsonProperty("payment_type")
	private String paymentType;

	@JsonProperty("referral_code")
	private String referralCode;

	@JsonProperty("cancellation_method")
	private String cancellationMethod;

	@JsonProperty("snap_day")
	private Integer snapDay;

	@JsonProperty("product_version_number")
	private Integer productVersionNumber;

	@JsonProperty("previous_expires_at")
	private OffsetDateTime previousExpiresAt;

	@JsonProperty("previous_billing_date")
	private OffsetDateTime previousBillingDate;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public Long getBalanceInCents() {
		return balanceInCents;
	}

	public void setBalanceInCents(Long balanceInCents) {
		this.balanceInCents = balanceInCents;
	}

	public OffsetDateTime getActivatedAt() {
		return activatedAt;
	}

	public void setActivatedAt(OffsetDateTime activatedAt) {
		this.activatedAt = activatedAt;
	}

	public OffsetDateTime getTrialStartedAt() {
		return trialStartedAt;
	}

	public void setTrialStartedAt(OffsetDateTime trialStartedAt) {
		this.trialStartedAt = trialStartedAt;
	}

	public OffsetDateTime getTrialEndedAt() {
		return trialEndedAt;
	}

	public void setTrialEndedAt(OffsetDateTime trialEndedAt) {
		this.trialEndedAt = trialEndedAt;
	}

	public OffsetDateTime getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(OffsetDateTime expiresAt) {
		this.expiresAt = expiresAt;
	}

	public OffsetDateTime getCancelledAt() {
		return cancelledAt;
	}

	public void setCancelledAt(OffsetDateTime cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	public OffsetDateTime getDelayedCancelAt() {
		return delayedCancelAt;
	}

	public void setDelayedCancelAt(OffsetDateTime delayedCancelAt) {
		this.delayedCancelAt = delayedCancelAt;
	}

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public OffsetDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(OffsetDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public OffsetDateTime getNextAssessmentAt() {
		return nextAssessmentAt;
	}

	public void setNextAssessmentAt(OffsetDateTime nextAssessmentAt) {
		this.nextAssessmentAt = nextAssessmentAt;
	}

	public OffsetDateTime getCurrentPeriodStartedAt() {
		return currentPeriodStartedAt;
	}

	public void setCurrentPeriodStartedAt(OffsetDateTime currentPeriodStartedAt) {
		this.currentPeriodStartedAt = currentPeriodStartedAt;
	}

	public OffsetDateTime getCurrentPeriodEndsAt() {
		return currentPeriodEndsAt;
	}

	public void setCurrentPeriodEndsAt(OffsetDateTime currentPeriodEndsAt) {
		this.currentPeriodEndsAt = currentPeriodEndsAt;
	}

	public String getPaymentCollectionMethod() {
		return paymentCollectionMethod;
	}

	public void setPaymentCollectionMethod(String paymentCollectionMethod) {
		this.paymentCollectionMethod = paymentCollectionMethod;
	}

	public String getCancellationMessage() {
		return cancellationMessage;
	}

	public void setCancellationMessage(String cancellationMessage) {
		this.cancellationMessage = cancellationMessage;
	}

	public Boolean getCancelAtEndOfPeriod() {
		return cancelAtEndOfPeriod;
	}

	public void setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) {
		this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
	}

	public Double getSignupRevenue() {
		return signupRevenue;
	}

	public void setSignupRevenue(Double signupRevenue) {
		this.signupRevenue = signupRevenue;
	}

	public Long getTotalRevenueInCents() {
		return totalRevenueInCents;
	}

	public void setTotalRevenueInCents(Long totalRevenueInCents) {
		this.totalRevenueInCents = totalRevenueInCents;
	}

	public Long getProductPriceInCents() {
		return productPriceInCents;
	}

	public void setProductPriceInCents(Long productPriceInCents) {
		this.productPriceInCents = productPriceInCents;
	}

	public Long getSignupPaymentId() {
		return signupPaymentId;
	}

	public void setSignupPaymentId(Long signupPaymentId) {
		this.signupPaymentId = signupPaymentId;
	}

	public Long getNextProductId() {
		return nextProductId;
	}

	public void setNextProductId(Long nextProductId) {
		this.nextProductId = nextProductId;
	}

	public String getPreviousState() {
		return previousState;
	}

	public void setPreviousState(String previousState) {
		this.previousState = previousState;
	}

	public OffsetDateTime getPreviousExpiresAt() {
		return previousExpiresAt;
	}

	public void setPreviousExpiresAt(OffsetDateTime previousExpiresAt) {
		this.previousExpiresAt = previousExpiresAt;
	}
	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getCancellationMethod() {
		return cancellationMethod;
	}

	public void setCancellationMethod(String cancellationMethod) {
		this.cancellationMethod = cancellationMethod;
	}

	public Integer getSnapDay() {
		return snapDay;
	}

	public void setSnapDay(Integer snapDay) {
		this.snapDay = snapDay;
	}

	public Integer getProductVersionNumber() {
		return productVersionNumber;
	}

	public void setProductVersionNumber(Integer productVersionNumber) {
		this.productVersionNumber = productVersionNumber;
	}

	public OffsetDateTime getPreviousBillingDate() {
		return previousBillingDate;
	}

	public void setPreviousBillingDate(OffsetDateTime previousBillingDate) {
		this.previousBillingDate = previousBillingDate;
	}

}
