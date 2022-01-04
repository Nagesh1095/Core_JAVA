package com.nscorps.postoffice.dto;

public class AddressDTO {
	private String managerName;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String toString() {
		return "managerName=" + managerName + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode ;
	}
	
	
	
}
