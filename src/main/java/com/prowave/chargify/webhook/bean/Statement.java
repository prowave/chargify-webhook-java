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
package com.prowave.chargify.webhook.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Statement {

	private Long id;

	@JsonProperty("subscription_id")
	private Long subscriptionId;

	@JsonProperty("opened_at")
	private Date openedAt;

	@JsonProperty("total_in_cents")
	private Long totalInCents;

	@JsonProperty("closed_at")
	private Date closedAt;

	@JsonProperty("updated_at")
	private Date updatedAt;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("settled_at")
	private Date settledAt;

	private String memo;

	private Transactions transactions;

	@JsonProperty("starting_balance_in_cents")
	private Long startingBalanceInCents;

	@JsonProperty("ending_balance_in_cents")
	private Long endingBalanceInCents;

	public Long getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public Date getOpenedAt() {
		return openedAt;
	}

	public void setOpenedAt(Date openedAt) {
		this.openedAt = openedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTotalInCents() {
		return totalInCents;
	}

	public void setTotalInCents(Long totalInCents) {
		this.totalInCents = totalInCents;
	}

	public Date getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(Date closedAt) {
		this.closedAt = closedAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getSettledAt() {
		return settledAt;
	}

	public void setSettledAt(Date settledAt) {
		this.settledAt = settledAt;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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

	public Transactions getTransactions() {
		return transactions;
	}

	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}

}
