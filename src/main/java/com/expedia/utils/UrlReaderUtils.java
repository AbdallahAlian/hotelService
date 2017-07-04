package com.expedia.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import com.expedia.commands.SearchCommand;

public class UrlReaderUtils {

	public static String readJsonFromUrl(String urlString) throws Exception {

		BufferedReader reader = null;
		try {
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			return buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}
	}

	public static String handleQueryParameters(HttpServletRequest req) {

		StringBuilder uriWithParameters = new StringBuilder(SearchCommand.END_POINT);
		for (Entry<String, String[]> parameter : req.getParameterMap().entrySet()) {
			if (!parameter.getKey().equals("cmd") && parameter.getValue() != null
					&& !parameter.getValue()[0].isEmpty()) {
				uriWithParameters.append("&" + parameter.getKey() + "=" + parameter.getValue()[0]);
			}
		}
		return uriWithParameters.toString();
	}

}
