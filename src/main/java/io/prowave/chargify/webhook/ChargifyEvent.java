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
package io.prowave.chargify.webhook;

/**
 * Event types from webhook
 * 
 * @author David Webb
 * @since 1.0.2
 *
 */
public enum ChargifyEvent {

	TEST,
	SIGNUP_SUCCESS,
	SIGNUP_FAILURE,
	RENEWAL_SUCCESS,
	RENEWAL_FAILURE,
	PAYMENT_SUCCESS,
	PAYMENT_FAILURE,
	BILLING_DATE_CHANGE,
	SUBSCRIPTION_STATE_CHANGE,
	SUBSCRIPTION_PRODUCT_CHANGE,
	SUBSCRIPTION_CARD_UPDATE,
	EXPIRING_CARD,
	CUSTOMER_UPDATE,
	COMPONENT_ALLOCATION_CHANGE,
	METERED_USAGE,
	UPCOMING_RENEWAL_NOTICE,
	END_OF_TRIAL_NOTICE,
	STATEMENT_CLOSED,
	STATEMENT_SETTLED,
	UPGRADE_DOWNGRADE_SUCCESS,
	UPGRADE_DOWNGRADE_FAILURE,
	REFUND_SUCCESS,
	REFUND_FAILURE,
	EXPIRATION_DATE_CHANGE,
	TRIAL_END_NOTICE,
	DUNNING_STEP_REACHED;

}
