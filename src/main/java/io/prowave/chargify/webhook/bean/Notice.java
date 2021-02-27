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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Notice extends Payload {
	
	private Customer customer;
	
	@JsonProperty("email_sent")
	private Boolean emailSent;
	
	@JsonProperty("estimated_renewal_amount_in_cents")
	private Integer estimatedRenewalAmountInCents;
	
	private String message;
	
	@JsonProperty("payment_profile")
	private PaymentProfile paymentProfile;
	
	private Product product;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Boolean isEmailSent() {
		return emailSent;
	}

	public void setEmailSent(Boolean emailSent) {
		this.emailSent = emailSent;
	}

	public Integer getEstimatedRenewalAmountInCents() {
		return estimatedRenewalAmountInCents;
	}

	public void setEstimatedRenewalAmountInCents(Integer estimatedRenewalAmountInCents) {
		this.estimatedRenewalAmountInCents = estimatedRenewalAmountInCents;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PaymentProfile getPaymentProfile() {
		return paymentProfile;
	}

	public void setPaymentProfile(PaymentProfile paymentProfile) {
		this.paymentProfile = paymentProfile;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	

}
