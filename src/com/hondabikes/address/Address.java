package com.hondabikes.address;

public class Address {
	
	private String streetName;
	private String landMark;
	private String laneNo;
	private long pin;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public Address(String streetName, String landMark, String laneNo, long pin) {
		super();
		this.streetName = streetName;
		this.landMark = landMark;
		this.laneNo = laneNo;
		this.pin = pin;
	}
	public String toString() {
		return "Address [streetName=" + streetName + ", landMark=" + landMark
				+ ", laneNo=" + laneNo + ", pin=" + pin + "]";
	}
	
	

}
