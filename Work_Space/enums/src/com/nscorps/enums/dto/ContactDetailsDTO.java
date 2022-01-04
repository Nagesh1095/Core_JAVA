package com.nscorps.enums.dto;

public class ContactDetailsDTO {
	private long contactNumber;
	private String email;
	private String adress;

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String toString() {
		return getClass().getSimpleName() + "contactNumber=" + contactNumber + ", email=" + email + ", adress=" + adress;
	}

}
