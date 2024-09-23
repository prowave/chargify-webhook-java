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

@JsonIgnoreProperties(value = { "public_signup_pages" }, ignoreUnknown = true)
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
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt;

  @JsonProperty("archived_at")
  private OffsetDateTime archivedAt;

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

  @JsonProperty("return_url")
  private String returnUrl;

  @JsonProperty("product_family_id")
  private String productFamilyId;

  @JsonProperty("product_family_name")
  private String productFamilyName;

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

  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
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

  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public String getProductFamilyId() {
    return productFamilyId;
  }

  public void setProductFamilyId(String productFamilyId) {
    this.productFamilyId = productFamilyId;
  }

  public String getProductFamilyName() {
    return productFamilyName;
  }

  public void setProductFamilyName(String productFamilyName) {
    this.productFamilyName = productFamilyName;
  }

}
