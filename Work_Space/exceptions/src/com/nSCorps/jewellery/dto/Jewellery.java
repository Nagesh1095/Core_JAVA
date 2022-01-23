package com.nSCorps.jewellery.dto;

import java.util.Objects;

public class Jewellery {
	private String typeOfMaterial;
	private double weight;
	private int designNumber;
	private int price;
	private String type;
	private String color;
	private byte karat;
	private String alloy;

	public Jewellery() {
		super();
	}

	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getDesignNumber() {
		return designNumber;
	}

	public void setDesignNumber(int designNumber) {
		this.designNumber = designNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getKarat() {
		return karat;
	}

	public void setKarat(byte karat) {
		this.karat = karat;
	}

	public String getAlloy() {
		return alloy;
	}

	public void setAlloy(String alloy) {
		this.alloy = alloy;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " TypeOfMaterial=" + typeOfMaterial + ", Weight=" + weight + ", DesignNumber=" + designNumber + ", Price="
				+ price + ", Type=" + type + ", Color=" + color + ", Karat=" + karat + ", Alloy=" + alloy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alloy, color, designNumber, karat, price, type, typeOfMaterial, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Jewellery)) {
			return false;
		}
		Jewellery other = (Jewellery) obj;
		return Objects.equals(alloy, other.alloy) && Objects.equals(color, other.color)
				&& designNumber == other.designNumber && karat == other.karat && price == other.price
				&& Objects.equals(type, other.type) && Objects.equals(typeOfMaterial, other.typeOfMaterial)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

}
