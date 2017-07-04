package com.expedia.JsonObjects;

public class HotelPricingInfo {

	private double hotelTotalBaseRate;
	private double totalPriceValue;
	private double averagePriceValue;
	private double hotelTotalMandatoryTaxesAndFees;
	private double hotelTotalTaxesAndFees;
	private String originalPricePerNight;
	private boolean drr;
	private double percentSavings;
	private String currency;

	public double getHotelTotalBaseRate() {
		return hotelTotalBaseRate;
	}

	public void setHotelTotalBaseRate(double hotelTotalBaseRate) {
		this.hotelTotalBaseRate = hotelTotalBaseRate;
	}

	public double getTotalPriceValue() {
		return totalPriceValue;
	}

	public void setTotalPriceValue(double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	public double getAveragePriceValue() {
		return averagePriceValue;
	}

	public void setAveragePriceValue(double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	public double getHotelTotalMandatoryTaxesAndFees() {
		return hotelTotalMandatoryTaxesAndFees;
	}

	public void setHotelTotalMandatoryTaxesAndFees(double hotelTotalMandatoryTaxesAndFees) {
		this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
	}

	public double getHotelTotalTaxesAndFees() {
		return hotelTotalTaxesAndFees;
	}

	public void setHotelTotalTaxesAndFees(double hotelTotalTaxesAndFees) {
		this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
	}

	public String getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	public void setOriginalPricePerNight(String originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	public boolean isDrr() {
		return drr;
	}

	public void setDrr(boolean drr) {
		this.drr = drr;
	}

	public double getPercentSavings() {
		return percentSavings;
	}

	public void setPercentSavings(double percentSavings) {
		this.percentSavings = percentSavings;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
