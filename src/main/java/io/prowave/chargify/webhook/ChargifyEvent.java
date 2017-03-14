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
	DUNNING_STEP_REACHED;

}
