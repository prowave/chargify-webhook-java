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

@JsonIgnoreProperties({ "public_signup_pages" })
public class Product {

	private Long id;
	private String name;
	private String description;
	private String handle;
	private Boolean taxable;
	private Integer interval;

	@JsonProperty("expiration_interval")
	private Integer expirationInterval;

	@JsonProperty("interval_unit")
	private String intervalUnit;

	@JsonProperty("trial_interval")
	private Integer trialInterval;

	@JsonProperty("trial_interval_unit")
	private String trialIntervalUnit;

	@JsonProperty("trial_price_in_cents")
	private Long totalPriceInCents;

	@JsonProperty("expiration_interval_unit")
	private String expirationIntervalUnit;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("updated_at")
	private Date updatedAt;

	@JsonProperty("archived_at")
	private Date archivedAt;

	@JsonProperty("return_params")
	private String returnParams;

	@JsonProperty("version_number")
	private Integer versionNumber;

	@JsonProperty("initial_charge_in_cents")
	private Long initialChargeInCents;

	@JsonProperty("price_in_cents")
	private Long priceInCents;

	@JsonProperty("product_family")
	private ProductFamily productFamily;

	@JsonProperty("request_credit_card")
	private Boolean requestCreditCard;

	@JsonProperty("require_credit_card")
	private Boolean requireCreditCard;

	@JsonProperty("initial_charge_after_trial")
	private Boolean initialChargeAfterTrial;

	@JsonProperty("accounting_code")
	private String accountingCode;

	@JsonProperty("update_return_url")
	private String updateReturnUrl;

	@JsonProperty("update_return_params")
	private String updateReturnParams;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public Boolean getTaxable() {
		return taxable;
	}

	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getExpirationInterval() {
		return expirationInterval;
	}

	public void setExpirationInterval(Integer expirationInterval) {
		this.expirationInterval = expirationInterval;
	}

	public String getIntervalUnit() {
		return intervalUnit;
	}

	public void setIntervalUnit(String intervalUnit) {
		this.intervalUnit = intervalUnit;
	}

	public Integer getTrialInterval() {
		return trialInterval;
	}

	public void setTrialInterval(Integer trialInterval) {
		this.trialInterval = trialInterval;
	}

	public String getTrialIntervalUnit() {
		return trialIntervalUnit;
	}

	public void setTrialIntervalUnit(String trialIntervalUnit) {
		this.trialIntervalUnit = trialIntervalUnit;
	}

	public Long getTotalPriceInCents() {
		return totalPriceInCents;
	}

	public void setTotalPriceInCents(Long totalPriceInCents) {
		this.totalPriceInCents = totalPriceInCents;
	}

	public String getExpirationIntervalUnit() {
		return expirationIntervalUnit;
	}

	public void setExpirationIntervalUnit(String expirationIntervalUnit) {
		this.expirationIntervalUnit = expirationIntervalUnit;
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

	public Date getArchivedAt() {
		return archivedAt;
	}

	public void setArchivedAt(Date archivedAt) {
		this.archivedAt = archivedAt;
	}

	public String getReturnParams() {
		return returnParams;
	}

	public void setReturnParams(String returnParams) {
		this.returnParams = returnParams;
	}

	public Integer getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(Integer versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Long getInitialChargeInCents() {
		return initialChargeInCents;
	}

	public void setInitialChargeInCents(Long initialChargeInCents) {
		this.initialChargeInCents = initialChargeInCents;
	}

	public Long getPriceInCents() {
		return priceInCents;
	}

	public void setPriceInCents(Long priceInCents) {
		this.priceInCents = priceInCents;
	}

	public ProductFamily getProductFamily() {
		return productFamily;
	}

	public void setProductFamily(ProductFamily productFamily) {
		this.productFamily = productFamily;
	}

	public Boolean getRequestCreditCard() {
		return requestCreditCard;
	}

	public void setRequestCreditCard(Boolean requestCreditCard) {
		this.requestCreditCard = requestCreditCard;
	}

	public Boolean getRequireCreditCard() {
		return requireCreditCard;
	}

	public void setRequireCreditCard(Boolean requireCreditCard) {
		this.requireCreditCard = requireCreditCard;
	}

	public Boolean getInitialChargeAfterTrial() {
		return initialChargeAfterTrial;
	}

	public void setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) {
		this.initialChargeAfterTrial = initialChargeAfterTrial;
	}

	public String getAccountingCode() {
		return accountingCode;
	}

	public void setAccountingCode(String accountingCode) {
		this.accountingCode = accountingCode;
	}

	public String getUpdateReturnUrl() {
		return updateReturnUrl;
	}

	public void setUpdateReturnUrl(String updateReturnUrl) {
		this.updateReturnUrl = updateReturnUrl;
	}

	public String getUpdateReturnParams() {
		return updateReturnParams;
	}

	public void setUpdateReturnParams(String updateReturnParams) {
		this.updateReturnParams = updateReturnParams;
	}

}

/*
 * Intentionally left out
 * 
   "public_signup_pages": {
	    "return_params": "subscription_id={subscription_id}&customer_id={customer_id}&customer_reference={customer_reference}",
	    "return_url": "",
	    "id": "272069",
	    "url": "http://brightmove-inc-sandbox.chargify.com/subscribe/pphbjwhcrcjr/cm-v1-0-0"
	  },
 */
