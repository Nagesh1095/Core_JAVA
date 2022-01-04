package com.nscorps.armor.dto;

public class CompanyDTO {
	private String comName;
	private String comFounder;
	private String country;

	public CompanyDTO() {
		super();
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComFounder() {
		return comFounder;
	}

	public void setComFounder(String comFounder) {
		this.comFounder = comFounder;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " comName=" + comName + ", comFounder=" + comFounder + ", country=" + country;
	}
	
}
