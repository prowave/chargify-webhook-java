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
public class Dunner {

	@JsonProperty("subscription_id")
	private String subscriptionId;

	private String state;

	private Integer attempts;

	@JsonProperty("last_attempted_at")
	private OffsetDateTime lastAttemptedAt;

	@JsonProperty("created_at")
	private OffsetDateTime createdAt;

	@JsonProperty("revenue_at_risk_in_cents")
	private String revenueAtRiskInCents;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getAttempts() {
		return attempts;
	}

	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}

	public OffsetDateTime getLastAttemptedAt() {
		return lastAttemptedAt;
	}

	public void setLastAttemptedAt(OffsetDateTime lastAttemptedAt) {
		this.lastAttemptedAt = lastAttemptedAt;
	}

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getRevenueAtRiskInCents() {
		return revenueAtRiskInCents;
	}

	public void setRevenueAtRiskInCents(String revenueAtRiskInCents) {
		this.revenueAtRiskInCents = revenueAtRiskInCents;
	}



}
