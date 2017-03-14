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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Notice extends Payload {
	
	private Customer customer;
	
	@JsonProperty("email_sent")
	private boolean emailSent;
	
	@JsonProperty("estimated_renewal_amount_in_cents")
	private int estimatedRenewalAmountInCents;
	
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

	public boolean isEmailSent() {
		return emailSent;
	}

	public void setEmailSent(boolean emailSent) {
		this.emailSent = emailSent;
	}

	public int getEstimatedRenewalAmountInCents() {
		return estimatedRenewalAmountInCents;
	}

	public void setEstimatedRenewalAmountInCents(int estimatedRenewalAmountInCents) {
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
