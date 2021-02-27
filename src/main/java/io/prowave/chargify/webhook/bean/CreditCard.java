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
public class CreditCard {

	private Long id;

	@JsonProperty("billing_address")
	private String billingAddress;

	@JsonProperty("billing_address_2")
	private String billingAddress2;

	@JsonProperty("billing_city")
	private String billingCity;

	@JsonProperty("billing_state")
	private String billingState;

	@JsonProperty("billing_zip")
	private String billingZip;

	@JsonProperty("billing_country")
	private String billingCountry;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("vault_token")
	private String vaultToken;

	@JsonProperty("current_vault")
	private String currentVault;

	@JsonProperty("masked_card_number")
	private String maskedCreditCard;

	@JsonProperty("card_type")
	private String cardType;

	@JsonProperty("payment_type")
	private String paymentType;

	@JsonProperty("expiration_year")
	private String expirationYear;

	@JsonProperty("expiration_month")
	private String expirationMonth;

	@JsonProperty("customer_vault_token")
	private String customerVaultToken;

	@JsonProperty("customer_id")
	private Long customerId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBillingAddress2() {
		return billingAddress2;
	}

	public void setBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingZip() {
		return billingZip;
	}

	public void setBillingZip(String billingZip) {
		this.billingZip = billingZip;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getVaultToken() {
		return vaultToken;
	}

	public void setVaultToken(String vaultToken) {
		this.vaultToken = vaultToken;
	}

	public String getCurrentVault() {
		return currentVault;
	}

	public void setCurrentVault(String currentVault) {
		this.currentVault = currentVault;
	}

	public String getMaskedCreditCard() {
		return maskedCreditCard;
	}

	public void setMaskedCreditCard(String maskedCreditCard) {
		this.maskedCreditCard = maskedCreditCard;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public String getCustomerVaultToken() {
		return customerVaultToken;
	}

	public void setCustomerVaultToken(String customerVaultToken) {
		this.customerVaultToken = customerVaultToken;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

}
