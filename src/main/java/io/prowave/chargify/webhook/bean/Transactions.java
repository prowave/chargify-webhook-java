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

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transactions {

	@JsonProperty("0")
	private Transaction tx0;

	@JsonProperty("1")
	private Transaction tx1;

	@JsonProperty("2")
	private Transaction tx2;

	@JsonProperty("3")
	private Transaction tx3;

	@JsonProperty("4")
	private Transaction tx4;

	@JsonIgnore
	List<Transaction> list = new ArrayList<>();

	public Transaction getTx0() {
		return tx0;
	}

	public void setTx0(Transaction tx0) {
		this.tx0 = tx0;
		list.add(tx0);
	}

	public Transaction getTx1() {
		return tx1;
	}

	public void setTx1(Transaction tx1) {
		this.tx1 = tx1;
		list.add(tx1);
	}

	public Transaction getTx2() {
		return tx2;
	}

	public void setTx2(Transaction tx2) {
		this.tx2 = tx2;
		list.add(tx2);
	}

	public Transaction getTx3() {
		return tx3;
	}

	public void setTx3(Transaction tx3) {
		this.tx3 = tx3;
		list.add(tx3);
	}

	public Transaction getTx4() {
		return tx4;
	}

	public void setTx4(Transaction tx4) {
		this.tx4 = tx4;
		list.add(tx4);
	}

	public List<Transaction> getList() {
		return list;
	}

	public int size() {
		return list.size();
	}
}
