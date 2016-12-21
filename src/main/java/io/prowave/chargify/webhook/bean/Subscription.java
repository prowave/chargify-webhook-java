/*
 * Copyright (C) 2016 Prowave Consulting, LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.prowave.chargify.webhook.bean;

import java.util.Date;

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
	private Date activatedAt;

	@JsonProperty("trial_started_at")
	private Date trialStartedAt;

	@JsonProperty("trial_ended_at")
	private Date trialEndedAt;

	@JsonProperty("expires_at")
	private Date expiresAt;

	@JsonProperty("canceled_at")
	private Date cancelledAt;

	@JsonProperty("delayed_cancel_at")
	private Date delayedCancelAt;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("updated_at")
	private Date updatedAt;

	@JsonProperty("next_assessment_at")
	private Date nextAssessmentAt;

	@JsonProperty("current_period_started_at")
	private Date currentPeriodStartedAt;

	@JsonProperty("current_period_ends_at")
	private Date currentPeriodEndsAt;

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

	public Date getActivatedAt() {
		return activatedAt;
	}

	public void setActivatedAt(Date activatedAt) {
		this.activatedAt = activatedAt;
	}

	public Date getTrialStartedAt() {
		return trialStartedAt;
	}

	public void setTrialStartedAt(Date trialStartedAt) {
		this.trialStartedAt = trialStartedAt;
	}

	public Date getTrialEndedAt() {
		return trialEndedAt;
	}

	public void setTrialEndedAt(Date trialEndedAt) {
		this.trialEndedAt = trialEndedAt;
	}

	public Date getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	public Date getCancelledAt() {
		return cancelledAt;
	}

	public void setCancelledAt(Date cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	public Date getDelayedCancelAt() {
		return delayedCancelAt;
	}

	public void setDelayedCancelAt(Date delayedCancelAt) {
		this.delayedCancelAt = delayedCancelAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getNextAssessmentAt() {
		return nextAssessmentAt;
	}

	public void setNextAssessmentAt(Date nextAssessmentAt) {
		this.nextAssessmentAt = nextAssessmentAt;
	}

	public Date getCurrentPeriodStartedAt() {
		return currentPeriodStartedAt;
	}

	public void setCurrentPeriodStartedAt(Date currentPeriodStartedAt) {
		this.currentPeriodStartedAt = currentPeriodStartedAt;
	}

	public Date getCurrentPeriodEndsAt() {
		return currentPeriodEndsAt;
	}

	public void setCurrentPeriodEndsAt(Date currentPeriodEndsAt) {
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

}
