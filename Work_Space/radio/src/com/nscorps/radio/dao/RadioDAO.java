package com.nscorps.radio.dao;

import com.nscorps.radio.dto.RadioDTO;

public class RadioDAO {
	RadioDTO[] dtos = new RadioDTO[5];
	int index = 0;

	public String add(RadioDTO name) {
		if (index < dtos.length) {
			dtos[index] = name;
			return "Added";
		}
		index++;
		return "Not Added";
	}

	public void printAll() {
		for (int index = 0; index < dtos.length; index++) {
			System.out.println(dtos[index]);
		}
	}

	public RadioDTO updatePricebyCompany(int price, String company) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && company == (dtos[index].getCompeny())) {
				dtos[index].setPrice(price);
				
			}
		}
		return dtos[index];
	}

	public RadioDTO updateColorByPrice(String color, int price) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && price == (dtos[index].getPrice())) {
				dtos[index].setColor(color);
				
			}
		}
		return dtos[index];
	}
	public RadioDTO updateCompanyBycolor(String company , String color ) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && color == (dtos[index].getColor())) {
				dtos[index].setCompeny(company);
			}
		}
		return dtos[index]; 
	}
	
	public String deletebyCompany(String company) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && company.equals(dtos[index].getCompeny())) {
				return "Deleted";
			}
		}
		return "Not Deleted";
	}
	
	public RadioDTO getByCompany(String company) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && company==dtos[index].getCompeny()) {
			}
		}
		return dtos[index];
	}
	public RadioDTO getByPrice(int price) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && price==dtos[index].getPrice()) {
			}
		}
		return dtos[index];
	}
	public RadioDTO getByWidth(double width) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && width==dtos[index].getSize().getWidth()) {
			}
		}
		return dtos[index];
	}
}

