package com.expedia.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expedia.JsonObjects.Result;
import com.expedia.utils.UrlReaderUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SearchCommand implements CommandModel {

	public static final String END_POINT = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		try {
			String json = UrlReaderUtils.readJsonFromUrl(request.getAttribute("endPoint").toString());
			Gson gson = new GsonBuilder().create();
			Result r = gson.fromJson(json, Result.class);
			r.getOffers().getHotel().get(0).getHotelPricingInfo().getHotelTotalBaseRate();
			request.setAttribute("Result", r);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
