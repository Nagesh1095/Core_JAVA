package com.nscorps.oneplus.dto;

public class MobileDTO {
	String model;
	String processor;
	byte ram;
	int price;
	String color;
	byte mp;
	byte noOfcamera;
	
	public MobileDTO(String model, String processor, byte ram, int price, String color, byte mp, byte noOfcamera) {
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.price = price;
		this.color = color;
		this.mp = mp;
		this.noOfcamera = noOfcamera;
	}

		public String getAll() {
		return "model=" + model +"\t "+ " processor=" + processor +"\t "+" ram=" + ram +"\t "+" price=" + price
				+ "\t"+" color=" + color + "\t"+" mp=" + mp + "\t"+" noOfcamera=" + noOfcamera;
	}
}
