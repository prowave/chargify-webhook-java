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



import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ComponentAllocationChange extends Payload {
	
	private Component component;
	
	private Product product;
	
	private String memo;
	
	//2016-12-21T19:55:55Z
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss'Z'")
	private Date timestamp;
	
	@JsonProperty("previous_allocation")
	private Integer previousAllocation;
	
	@JsonProperty("new_allocation")
	private Integer newAllocation;
	

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getPreviousAllocation() {
		return previousAllocation;
	}

	public void setPreviousAllocation(Integer previousAllocation) {
		this.previousAllocation = previousAllocation;
	}

	public Integer getNewAllocation() {
		return newAllocation;
	}

	public void setNewAllocation(Integer newAllocation) {
		this.newAllocation = newAllocation;
	}

	
	
}
