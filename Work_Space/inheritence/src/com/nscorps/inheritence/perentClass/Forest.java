package com.nscorps.inheritence.perentClass;

public class Forest {
	public int countInIndia = 3000;
	public byte types = 67;
	public int jobs = 15652;
	public boolean caughtFire;

	public Forest() {
		System.out.println("Invoking class forest");
	}

	public int countInIndia(int countInIndia) {
		this.countInIndia = countInIndia;
		return countInIndia;
	}

	public byte types(byte types) {
		this.types = types;
		return types;
	}

	public int jobs(int jobs) {
		this.jobs = jobs;
		return jobs;
	}

	public boolean caughtFire(boolean caughtFire) {
		this.caughtFire = caughtFire;
		return caughtFire;
	}
}
