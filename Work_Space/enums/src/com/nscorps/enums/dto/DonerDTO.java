package com.nscorps.enums.dto;

import com.nscorps.enums.enums.BloodGroup;
import com.nscorps.enums.enums.Gender;

public class DonerDTO {
	private String name;
	private byte age;
	private float weight;
	private BloodGroup bloodGroup;
	private Gender gender;
	private ContactDetailsDTO details;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public ContactDetailsDTO getDetails() {
		return details;
	}

	public void setDetails(ContactDetailsDTO details) {
		this.details = details;
	}

	public String toString() {
		return getClass().getSimpleName() + "name=" + name + ", age=" + age + ", weight=" + weight + ", bloodGroup=" + bloodGroup + ", gender="
				+ gender + ", details=" + details;
	}

}
