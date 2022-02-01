package com.nsCorps.collections.linkedList;

public class Flower {
	private String name;
	private String color;
	private int price;
	private String scientificName;
	private byte sepals;
	
	public Flower() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public byte getSepals() {
		return sepals;
	}

	public void setSepals(byte sepals) {
		this.sepals = sepals;
	}

	
	public String toString() {
		return getClass().getSimpleName()+ " name=" + name + ", color=" + color + ", price=" + price + ", scientificName="
				+ scientificName + ", sepals=" + sepals;
	}
	
	
	


}
