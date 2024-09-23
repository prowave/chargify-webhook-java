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

import java.time.OffsetDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

	private Long id;
	private String memo;
	private String kind;
	private String type;
	private Boolean success;

	@JsonProperty("created_at")
	private OffsetDateTime createAt;

	@JsonProperty("transaction_type")
	private String transactionType;

	@JsonProperty("tax_id")
	private Long taxId;

	@JsonProperty("gateway_used")
	private String gatewayUsed;

	@JsonProperty("gateway_order_id")
	private Long gatewayOrderId;

	@JsonProperty("gateway_transaction_id")
	private String gatewayTransactionId;

	@JsonProperty("starting_balance_in_cents")
	private Long startingBalanceInCents;

	@JsonProperty("ending_balance_in_cents")
	private Long endingBalanceInCents;

	@JsonProperty("original_amount_in_cents")
	private Long originalAmountInCents;

	@JsonProperty("discount_amount_in_cents")
	private Long discountAmountInCents;

	@JsonProperty("taxable_amount_in_cents")
	private Long taxableAmountInCents;

	@JsonProperty("amount_in_cents")
	private Long amountInCents;

	@JsonProperty("customer_id")
	private Long customerId;

	@JsonProperty("component_id")
	private Long componentId;

	@JsonProperty("statement_id")
	private Long statementId;

	@JsonProperty("subscription_id")
	private Long subscriptionId;

	@JsonProperty("payment_id")
	private Long paymentId;

	@JsonProperty("product_id")
	private Long productId;

	@JsonProperty("card_number")
	private String cardNumber;

	@JsonProperty("card_expiration")
	private String cardExpiration;

	@JsonProperty("card_type")
	private String cardType;

	@JsonProperty("invoice_id")
	private Long invoiceId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public OffsetDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(OffsetDateTime createAt) {
		this.createAt = createAt;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Long getTaxId() {
		return taxId;
	}

	public void setTaxId(Long taxId) {
		this.taxId = taxId;
	}

	public String getGatewayUsed() {
		return gatewayUsed;
	}

	public void setGatewayUsed(String gatewayUsed) {
		this.gatewayUsed = gatewayUsed;
	}

	public Long getGatewayOrderId() {
		return gatewayOrderId;
	}

	public void setGatewayOrderId(Long gatewayOrderId) {
		this.gatewayOrderId = gatewayOrderId;
	}

	public String getGatewayTransactionId() {
		return gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}

	public Long getStartingBalanceInCents() {
		return startingBalanceInCents;
	}

	public void setStartingBalanceInCents(Long startingBalanceInCents) {
		this.startingBalanceInCents = startingBalanceInCents;
	}

	public Long getEndingBalanceInCents() {
		return endingBalanceInCents;
	}

	public void setEndingBalanceInCents(Long endingBalanceInCents) {
		this.endingBalanceInCents = endingBalanceInCents;
	}

	public Long getOriginalAmountInCents() {
		return originalAmountInCents;
	}

	public void setOriginalAmountInCents(Long originalAmountInCents) {
		this.originalAmountInCents = originalAmountInCents;
	}

	public Long getDiscountAmountInCents() {
		return discountAmountInCents;
	}

	public void setDiscountAmountInCents(Long discountAmountInCents) {
		this.discountAmountInCents = discountAmountInCents;
	}

	public Long getTaxableAmountInCents() {
		return taxableAmountInCents;
	}

	public void setTaxableAmountInCents(Long taxableAmountInCents) {
		this.taxableAmountInCents = taxableAmountInCents;
	}

	public Long getAmountInCents() {
		return amountInCents;
	}

	public void setAmountInCents(Long amountInCents) {
		this.amountInCents = amountInCents;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getComponentId() {
		return componentId;
	}

	public void setComponentId(Long componentId) {
		this.componentId = componentId;
	}

	public Long getStatementId() {
		return statementId;
	}

	public void setStatementId(Long statementId) {
		this.statementId = statementId;
	}

	public Long getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardExpiration() {
		return cardExpiration;
	}

	public void setCardExpiration(String cardExpiration) {
		this.cardExpiration = cardExpiration;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
}
