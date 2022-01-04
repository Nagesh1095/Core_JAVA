package com.nsCorps.oneplus.operator;

import com.nsCorps.oneplus.dtos.EarPhoneDTO;

public class EarPhoneOperator {
	EarPhoneDTO[] earphone = new EarPhoneDTO[4];
	int index = 0;

	public void add(EarPhoneDTO dto) {
		if (index < earphone.length) {
			earphone[index] = dto;
			index++;
		}
	}

	public void getAll() {
		for (int index = 0; index < earphone.length; index++) {
			if (earphone[index] != null) {
				System.out.println(earphone[index].printAll());

			}
		}
	}

	public String updateDriverUsingChipset(String chipset, byte driver) {
		for (int index = 0; index < earphone.length; index++) {
			if (earphone[index] != null) {
				if (chipset.equals(earphone[index].getChipset())) {
					earphone[index].setDriver(driver);
					return "Updated";
				}

			}

		}
		return "Not Updated";
	}

	public String deleteByChipset(String chipset) {
		for (int index = 0; index < earphone.length; index++) {
			if (earphone != null) {
				if (chipset.equals(earphone[index].getChipset())) {
					return "Deleted";

				}

			}

		}
		return "Not Deleted";
	}
	
}


