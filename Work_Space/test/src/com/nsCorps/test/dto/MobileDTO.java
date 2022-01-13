package com.nsCorps.test.dto;

import java.util.Objects;

public class MobileDTO {
	String mobileID;
	String modelName;
	int price;
	short memoryInGB;
	String brandName;
	long serialNumber;
	byte noOfCamera;

	public MobileDTO() {
		super();
	}

	public String getMobileID() {
		return mobileID;
	}

	public void setMobileID(String mobileID) {
		this.mobileID = mobileID;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public short getMemoryInGB() {
		return memoryInGB;
	}

	public void setMemoryInGB(short memoryInGB) {
		this.memoryInGB = memoryInGB;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public byte getNoOfCamera() {
		return noOfCamera;
	}

	public void setNoOfCamera(byte noOfCamera) {
		this.noOfCamera = noOfCamera;
	}

	public String toString() {
		return this.getClass().getSimpleName() +" mobileID=" + mobileID + ", modelName=" + modelName + ", price=" + price + ", memoryInGB="
				+ memoryInGB + ", brandName=" + brandName + ", serialNumber=" + serialNumber + ", noOfCamera="
				+ noOfCamera ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, memoryInGB, mobileID, modelName, noOfCamera, price, serialNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MobileDTO)) {
			return false;
		}
		MobileDTO other = (MobileDTO) obj;
		return Objects.equals(brandName, other.brandName) && memoryInGB == other.memoryInGB
				&& Objects.equals(mobileID, other.mobileID) && Objects.equals(modelName, other.modelName)
				&& noOfCamera == other.noOfCamera && price == other.price && serialNumber == other.serialNumber;
	}
	
	
}
