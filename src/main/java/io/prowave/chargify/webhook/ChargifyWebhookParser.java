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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David Webb
 * @since 1.0.0
 *
 */
public class ChargifyWebhookParser {

	private static final Logger LOG = LoggerFactory.getLogger(ChargifyWebhookParser.class);
	private static final Pattern pattern = Pattern.compile("\\[([^\\]]+)]");

	private static final String ID = "id";
	private static final String EVENT = "event";
	private static final String PAYLOAD = "payload";

	private ChargifyWebhookParser() {
	}

	public static final ChargifyWebhook parse(String webhookBody) throws UnsupportedEncodingException {

		Map<String, String> params = new LinkedHashMap<>();

		String[] pairs = webhookBody.split("&");

		for (String pair : pairs) {
			String[] kv = URLDecoder.decode(pair, "UTF-8").split("=");
			params.put(kv[0], kv.length > 1 ? kv[1] : "");
		}

		return parse(params);

	}

	public static final ChargifyWebhook parse(Map<String, String> webhookParameters) {

		ChargifyWebhook w = new ChargifyWebhook();

		Map<String, Object> genericMap = new HashMap<>();
		Matcher matcher = null;
		List<String> levels = null;

		for (String key : webhookParameters.keySet()) {

			if (key.startsWith(PAYLOAD)) {

				matcher = pattern.matcher(key);
				levels = new ArrayList<>();
				while (matcher.find()) {
					levels.add(matcher.group(1));
				}

				genericMap = nestMap(genericMap, levels.iterator(), webhookParameters.get(key));

			}
		}

		w.setId(webhookParameters.get(ID));
		w.setEvent(webhookParameters.get(EVENT));
		w.setPayload(genericMap);

		return w;

	}

	@SuppressWarnings("unchecked")
	private static final Map<String, Object> nestMap(Map<String, Object> baseMap, Iterator<String> levels, String value) {

		LOG.trace(String.format("Map->Before : %s", baseMap.toString()));

		String key = levels.next();

		LOG.trace(String.format("Level : %s, hasNext : %s", key, levels.hasNext()));

		if (!levels.hasNext()) {
			LOG.trace(String.format("Adding Value to node %s = %s", key, value));
			baseMap.put(key, value);
		} else {

			if (!baseMap.containsKey(key)) {
				LOG.trace(String.format("Adding mapEntry with Key %s", key));
				baseMap.put(key, nestMap(new HashMap<String, Object>(), levels, value));
			} else {
				baseMap.put(key, nestMap((Map<String, Object>) baseMap.get(key), levels, value));
			}
		}

		LOG.trace(String.format("Map->After : %s", baseMap.toString()));

		return baseMap;

	}

}
