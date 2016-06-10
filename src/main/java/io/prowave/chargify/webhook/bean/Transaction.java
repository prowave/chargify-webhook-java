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

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

	private Long id;
	private String memo;
	private String kind;
	private String type;
	private Boolean success;

	@JsonProperty("created_at")
	private Date createAt;

	@JsonProperty("transaction_type")
	private String transactionType;

	@JsonProperty("tax_id")
	private Long taxId;

	@JsonProperty("gateway_used")
	private String gatewayUsed;

	@JsonProperty("gateway_order_id")
	private Long gatewayOrderId;

	@JsonProperty("gateway_transaction_id")
	private Long gatewayTransactionId;

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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
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

	public Long getGatewayTransactionId() {
		return gatewayTransactionId;
	}

	public void setGatewayTransactionId(Long gatewayTransactionId) {
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
}
