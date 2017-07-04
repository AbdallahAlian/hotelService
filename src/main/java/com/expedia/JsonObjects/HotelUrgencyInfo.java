package com.expedia.JsonObjects;

public class HotelUrgencyInfo {

	private long lastBookedTime;
	private boolean airAttachEnabled;
	private int numberOfPeopleBooked;
	private AlmostSoldStatus almostSoldStatus;
	private int numberOfRoomsLeft;
	private String link;
	private String[] almostSoldOutRoomTypeInfoCollection;
	private int numberOfPeopleViewing;
	private String airAttachRemainingTime;

	public boolean isAirAttachEnabled() {
		return airAttachEnabled;
	}

	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

	public int getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	public AlmostSoldStatus getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	public void setAlmostSoldStatus(AlmostSoldStatus almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	public int getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	public void setNumberOfRoomsLeft(int numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	public String[] getAlmostSoldOutRoomTypeInfoCollection() {
		return almostSoldOutRoomTypeInfoCollection;
	}

	public void setAlmostSoldOutRoomTypeInfoCollection(String[] almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}

	public int getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	public void setNumberOfPeopleViewing(int numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	public String getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	public void setAirAttachRemainingTime(String airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	public long getLastBookedTime() {
		return lastBookedTime;
	}

	public void setLastBookedTime(long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
