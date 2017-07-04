package com.expedia.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Utility class manipulate URL's process
 * 
 * @author abd
 * @since V1.0
 */
public class UrlReaderUtils {

	/**
	 * Method to read Json text from the URL
	 * 
	 * @param urlString
	 *            end point
	 * @return Json Text
	 * @throws Exception
	 * @author abd
	 * @since V1.0
	 */
	public static String readJsonFromUrl(String urlString) throws Exception {

		BufferedReader reader = null;
		StringBuilder builder = new StringBuilder();
		URL url = new URL(urlString);
		int read;
		char[] chars = new char[1024];
		try {
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			while ((read = reader.read(chars)) != -1) {
				builder.append(chars, 0, read);
			}
			return builder.toString();
		} finally {
			if (reader != null)
				reader.close();
		}
	}

}
