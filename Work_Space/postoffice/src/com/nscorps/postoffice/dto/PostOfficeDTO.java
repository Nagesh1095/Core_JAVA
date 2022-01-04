package com.nscorps.postoffice.dto;

public class PostOfficeDTO {
	private String place;
	private String branch;
	private String name;
	private AddressDTO address;
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	
	public String toString() {
		return "place=" + place + ", branch=" + branch + ", name=" + name + ", address= " + address ;
	}
	
	
	
}
