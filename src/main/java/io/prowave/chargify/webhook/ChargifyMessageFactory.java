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

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ChargifyMessageFactory {

	private static final Logger LOG = LoggerFactory.getLogger(ChargifyMessageFactory.class);

	private static final ObjectMapper objectMapper = new ObjectMapper();

	public static final <T> T createChargifyMessage(Map<String, Object> map, Class<T> clazz) {

		DateFormat chargifyDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
		objectMapper.setDateFormat(chargifyDateFormat);

		try {
			return objectMapper.readValue(objectMapper.writeValueAsString(map), clazz);
		} catch (IOException e) {
			LOG.error("Error", e);
			throw new IllegalArgumentException(String.format("Failed to convert map to message type [%s]", clazz.getName()),
					e);
		}

	}

}
