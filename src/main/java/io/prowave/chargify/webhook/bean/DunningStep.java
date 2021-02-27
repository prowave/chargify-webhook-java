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
public class DunningStep {

	@JsonProperty("day_threshold")
	private Integer dayThreshold;

	private String action;

	@JsonProperty("email_body")
	private String emailBody;
	
	@JsonProperty("email_subject")
	private String emailSubject;

	@JsonProperty("send_email")
	private Boolean sendEmail;
	
	@JsonProperty("send_bcc_email")
	private Boolean sendBccEmail;
	
	@JsonProperty("send_sms")
	private Boolean sendSms;
	
	@JsonProperty("sms_body")
	private String smsBody;

	public Integer getDayThreshold() {
		return dayThreshold;
	}

	public void setDayThreshold(Integer dayThreshold) {
		this.dayThreshold = dayThreshold;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public Boolean isSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(Boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	public Boolean isSendBccEmail() {
		return sendBccEmail;
	}

	public void setSendBccEmail(Boolean sendBccEmail) {
		this.sendBccEmail = sendBccEmail;
	}

	public Boolean isSendSms() {
		return sendSms;
	}

	public void setSendSms(Boolean sendSms) {
		this.sendSms = sendSms;
	}

	public String getSmsBody() {
		return smsBody;
	}

	public void setSmsBody(String smsBody) {
		this.smsBody = smsBody;
	}

	

}
