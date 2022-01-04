package com.nsCorps.oneplus.dtos;

public class EarPhoneDTO {
	private String type;
	private String model;
	private byte driver;
	private int price;
	private String color;
	private byte playBack;
	private String chipset;
	private short battery;
	private byte noOfconnection;
	private String waterResistent;
	
	
	
	public EarPhoneDTO() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte getDriver() {
		return driver;
	}

	public void setDriver(byte driver) {
		this.driver = driver;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getPlayBack() {
		return playBack;
	}

	public void setPlayBack(byte playBack) {
		this.playBack = playBack;
	}

	public String getChipset() {
		return chipset;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public byte getNoOfconnection() {
		return noOfconnection;
	}

	public void setNoOfconnection(byte noOfconnection) {
		this.noOfconnection = noOfconnection;
	}

	public String getWaterResistent() {
		return waterResistent;
	}

	public void setWaterResistent(String waterResistent) {
		this.waterResistent = waterResistent;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public short getBattery() {
		return battery;
	}

	public void setBattery(short battery) {
		this.battery = battery;
	}

	public String printAll() {
		return "type=" + type + ", model=" + model + ", driver=" + driver + ", price=" + price + ", color="
				+ color + ", playBack=" + playBack + ", chipset=" + chipset + ", battery=" + battery
				+ ", noOfconnection=" + noOfconnection + ", waterResistent=" + waterResistent ;
	}

	
	
	
}
