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
