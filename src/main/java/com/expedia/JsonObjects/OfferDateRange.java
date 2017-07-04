package com.expedia.JsonObjects;

public class OfferDateRange {

	private Object travelStartDate;
	private Object travelEndDate;
	private int lengthOfStay;

	public int getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public Object getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(Object travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public Object getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(Object travelStartDate) {
		this.travelStartDate = travelStartDate;
	}
}
