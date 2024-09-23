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
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ChargifyMessageFactory {

	private static final Logger LOG = LoggerFactory.getLogger(ChargifyMessageFactory.class);

	private static final DateTimeFormatter CHARGIFY_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");

	private static ObjectMapper createObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.registerModule(new JavaTimeModule()
				.addDeserializer(OffsetDateTime.class, new OffsetDateTimeDeserializer(CHARGIFY_DATE_FORMATTER)));

		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

		return objectMapper;
	}

	public static <T> T createChargifyMessage(Map<String, Object> map, Class<T> clazz) {
		ObjectMapper objectMapper = createObjectMapper();
		try {
			return objectMapper.readValue(objectMapper.writeValueAsString(map), clazz);
		} catch (IOException e) {
			LOG.error("Error", e);
			throw new IllegalArgumentException(String.format("Failed to convert map to message type [%s]", clazz.getName()), e);
		}
	}

}
