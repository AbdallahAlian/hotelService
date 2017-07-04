package com.expedia.commands;

import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expedia.JsonObjects.Result;
import com.expedia.utils.UrlReaderUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Class to handle Search Filtration based on the passed query parameters
 * 
 * @author abd
 * @since V1.0
 */
public class SearchCommand implements CommandModel {

	private static final String END_POINT = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	private static final String RESULT_ATTRIBUTE = "RESULT";
	private static final String MSG_ATTRIBUTE = "MSG";

	/**
	 * execute the Search Command and set the Result attribute to the quest
	 * 
	 * @author abd
	 * @since V1.0
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		try {
			String json = UrlReaderUtils.readJsonFromUrl(handleQueryParameters(request));
			Gson gson = new GsonBuilder().create();
			Result result = gson.fromJson(json, Result.class);
			request.setAttribute(RESULT_ATTRIBUTE, result);
			if (result == null || result.getOffers().getHotel() == null) {
				request.setAttribute(MSG_ATTRIBUTE, "No results found...");		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to handle the query parameter and prepare the URL with query
	 * parameters
	 * 
	 * @param req
	 * @return URL
	 */
	private String handleQueryParameters(HttpServletRequest req) {

		StringBuilder uriWithParameters = new StringBuilder(END_POINT);
		for (Entry<String, String[]> parameter : req.getParameterMap().entrySet()) {
			if (!parameter.getKey().equals("cmd") && parameter.getValue() != null
					&& !parameter.getValue()[0].isEmpty()) {
				uriWithParameters.append("&" + parameter.getKey() + "=" + parameter.getValue()[0]);
			}
		}
		return uriWithParameters.toString();
	}
}
