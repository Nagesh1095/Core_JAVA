package com.nscorps.radio.dto;

public class SizeDTO {
	private float length;
	private float height;
	private double width;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public String toString() {
		return "length=" + length + ", height=" + height + ", width=" + width ;
	}
	
	
	
}
