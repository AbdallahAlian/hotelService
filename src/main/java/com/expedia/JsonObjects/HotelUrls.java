package com.expedia.JsonObjects;

import java.io.UnsupportedEncodingException;

public class HotelUrls {

	private String hotelSearchResultUrl;
	private String hotelInfositeUrl;

	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

	public String getHotelInfositeUrl() {
		try {
			return hotelInfositeUrl = java.net.URLDecoder.decode(hotelInfositeUrl, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return hotelInfositeUrl;
	}

	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

}
