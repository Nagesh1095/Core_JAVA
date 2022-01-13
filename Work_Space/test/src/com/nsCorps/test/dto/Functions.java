package com.nsCorps.test.dto;

public interface Functions {
	boolean add(MobileDTO dto);

	void getAll();

	MobileDTO deleteByMobileID(String mobileID);

	MobileDTO updateBySerialNumber(long serialNumber ,String modelName);

	void getAllByBrandName(String brandName);

	
}
