package com.nscorps.radio.dto;

public class RadioDTO {
	private String compeny;
	private int price;
	private String color;
	private byte noOfRS;
	private SizeDTO size;

	public String getCompeny() {
		return compeny;
	}
	public void setCompeny(String compeny) {
		this.compeny = compeny;
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
	public byte getNoOfRS() {
		return noOfRS;
	}
	public void setNoOfRS(byte noOfRS) {
		this.noOfRS = noOfRS;
	}
	public SizeDTO getSize() {
		return size;
	}
	public void setSize(SizeDTO size) {
		this.size = size;
	}
	public String toString() {
		return "compeny=" + compeny + ", price=" + price + ", color=" + color + ", noOfRS=" + noOfRS
				+ ", size=" + size ;
	}
	
	
}
