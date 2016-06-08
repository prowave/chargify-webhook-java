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
package com.prowave.chargify.webhook;

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
