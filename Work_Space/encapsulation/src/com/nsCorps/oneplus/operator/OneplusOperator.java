package com.nsCorps.oneplus.operator;

import com.nsCorps.oneplus.dtos.OneplusDTO;

public class OneplusOperator {
	OneplusDTO[] oneplus = new OneplusDTO[4];
	int index = 0;

	public void add(OneplusDTO dto) {
		if (index < oneplus.length) {
			oneplus[index] = dto;
			index++;
		}
	}

	public void getAll() {
		for (int index = 0; index < oneplus.length; index++) {
			if (oneplus[index] != null) {
				System.out.println(oneplus[index].printAll());

			}
		}
	}

	public String updateRamUsingModel(String model, byte ram) {
		for (int index = 0; index < oneplus.length; index++) {
			if (oneplus[index] != null) {
				if (model.equals(oneplus[index].getModel())) {
					oneplus[index].setRam(ram);
					return "Updated";
				}

			}

		}
		return "Not Updated";
	}

	public String deleteByModel(String model) {
		
		for (int index = 0; index < oneplus.length; index++) {
			if (oneplus[index] != null) {
				if (model.equals(oneplus[index].getModel())) {
					oneplus[index] = null;
					return "Deleted";

				}

			}

		}
		return "Not Deleted";
	}
	
}

