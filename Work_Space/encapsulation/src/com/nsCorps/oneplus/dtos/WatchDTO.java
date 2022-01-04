package com.nsCorps.oneplus.dtos;

public class WatchDTO {
	private String model;
	private String processor;
	private float ram;
	private int price;
	private String color;
	private String oS;
	private String display;
	private short storage;
	private byte noOfCamera;
	private short battery;
	
	
	public WatchDTO() {
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public float getRam() {
		return ram;
	}
	public void setRam(float ram) {
		this.ram = ram;
	}
	public String getoS() {
		return oS;
	}
	public void setoS(String oS) {
		this.oS = oS;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public short getStorage() {
		return storage;
	}
	public void setStorage(short storage) {
		this.storage = storage;
	}
	public byte getNoOfCamera() {
		return noOfCamera;
	}
	public void setNoOfCamera(byte noOfCamera) {
		this.noOfCamera = noOfCamera;
	}
	public short getBattery() {
		return battery;
	}
	public void setBattery(short battery) {
		this.battery = battery;
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
	
	public String printAll() {
		return "model=" + model + ", processor=" + processor + ", ram=" + ram + ", price=" + price
				+ ", color=" + color + ", oS=" + oS + ", display=" + display + ", storage=" + storage + ", noOfCamera="
				+ noOfCamera + ", battery=" + battery ;
	}
	
		
	
}
 