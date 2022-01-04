package com.nscorps.inheritence.childClass;

import com.nscorps.inheritence.perentClass.Forest;

public class EverGreenForest extends Forest {
	public String area = "Bay of Bengal";
	public String name = "Andaman and Nicobar Islands";
	public short count = 300;
	public long population = 43400000;
	public boolean passportNeeded = false;

	public EverGreenForest() {
		System.out.println("Invoking Ever Green forest class");
	}

	public String area(String area) {
		this.area = area;
		return area;
	}

	public String name(String name) {
		this.name = name;
		return name;
	}

	public short count(short count) {
		this.count = count;
		return count;
	}

	public long population(long population) {
		this.population = population;
		return population;
	}

	public boolean passportNeeded(boolean passportNeeded) {
		this.passportNeeded = passportNeeded;
		return passportNeeded;
	}
}
