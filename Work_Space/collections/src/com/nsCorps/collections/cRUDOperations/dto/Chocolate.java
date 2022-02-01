package com.nsCorps.collections.cRUDOperations.dto;

import java.util.Objects;

public class Chocolate {

	private String name;
	private int price;
	private float weight;
	private float calories;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getCalories() {
		return calories;
	}

	public void setCalories(float calories) {
		this.calories = calories;
	}

	public String toString() {
		return this.getClass().getSimpleName() + "name=" + name + ", price=" + price + ", weight=" + weight
				+ ", calories=" + calories;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calories, name, price, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Chocolate)) {
			return false;
		}
		Chocolate other = (Chocolate) obj;
		return Float.floatToIntBits(calories) == Float.floatToIntBits(other.calories)
				&& Objects.equals(name, other.name) && price == other.price
				&& Float.floatToIntBits(weight) == Float.floatToIntBits(other.weight);
	}
	

}
