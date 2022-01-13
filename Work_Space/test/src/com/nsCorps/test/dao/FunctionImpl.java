package com.nsCorps.test.dao;

import com.nsCorps.test.dto.Functions;
import com.nsCorps.test.dto.MobileDTO;

public class FunctionImpl implements Functions {

	MobileDTO[] mobileDTO = new MobileDTO[5];
	int index = 0;

	@Override
	public boolean add(MobileDTO dto) {
		if (index < mobileDTO.length) {
			mobileDTO[index] = dto;
			index++;
		}
		return true;
	}

	@Override
	public void getAll() {
		for (int index = 0; index < mobileDTO.length; index++) {
			if (mobileDTO[index] != null) {
				System.out.println(mobileDTO[index].toString());
			}

		}

	}

	@Override
	public MobileDTO deleteByMobileID(String mobileID) {
		for (int index = 0; index < mobileDTO.length; index++) {
			if (mobileDTO[index] != null) {
				if (mobileID.equals(mobileDTO[index].getMobileID())) {

				}
			}
		}
		return null;
	}

	@Override
	public MobileDTO updateBySerialNumber(long serialNumber, String modelName) {
		for (int index = 0; index < mobileDTO.length; index++) {
			if (mobileDTO[index] != null) {
				if (modelName.equals(mobileDTO[index].getModelName())) {
					mobileDTO[index].setSerialNumber(serialNumber);
					return mobileDTO[index];
				}
			}

		}
		return null;
	}

	@Override
	public void getAllByBrandName(String brandName) {
		for (int index = 0; index < mobileDTO.length; index++) {
			if (mobileDTO[index] != null) {
				if (brandName.equals(mobileDTO[index].getBrandName())) {
					System.out.println("\nThe Brand name is\n" + mobileDTO[index].getBrandName());
				}
			}

		}

	}

}
