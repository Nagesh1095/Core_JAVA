package com.nscorps.task.daos;

import com.nscorps.task.dtos.TraineeDetailsDTO;

public class TraineeDAO {
	TraineeDetailsDTO[] details = new TraineeDetailsDTO[4];
	int index = 0;

	public void save(TraineeDetailsDTO names) {
		if (index < details.length) {
			details[index] = names;
			index++;
		}
	}

	public void printAll() {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				System.out.println(details[index].toString());
			}
		}
	}

	public TraineeDetailsDTO updateCountryByName(String name, String country) {

		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (name.equals(details[index].getName())) {
					details[index].getAdress().getArea().getDistrict().getTaluk().getState().setCountry(country);
					return details[index];
				}
			}
		}
		return details[index];
	}

	public TraineeDetailsDTO getByCountry(String country) {
		for (int index = 0; index < details.length; index++) {
			if (country.equals(details[index].getAdress().getArea().getDistrict().getTaluk().getState().getCountry())) {
				return details[index];
			}

		}

		return null;
	}

	public TraineeDetailsDTO getByDistrict(String name) {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (name.equals(details[index].getAdress().getArea().getDistrict().getName())) {
					return details[index];
				}
			}

		}

		return details[index];
	}

}
