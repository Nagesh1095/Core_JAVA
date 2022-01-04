package com.nsCorps.oneplus.operator;

import com.nsCorps.oneplus.dtos.WatchDTO;

public class WatchOperator {
	WatchDTO[] watch = new WatchDTO[4];
	int index = 0;

	public void add(WatchDTO dto) {
		if (index < watch.length) {
			watch[index] = dto;
			index++;
		}
	}

	public void getAll() {
		for (int index = 0; index < watch.length; index++) {
			if (watch[index] != null) {
				System.out.println(watch[index].printAll());

			}
		}
	}

	public String updateRamUsingModel(String model, byte ram) {
		
		for (int index = 0; index < watch.length; index++) {
			if (watch[index] != null) {
				if (model.equals(watch[index].getModel())) {
					watch[index].setRam(ram);
					return "Updated";
				}

			}

		}
		return "Not Updated";
	}

	public String deleteByModel(String model) {
		for (int index = 0; index < watch.length; index++) {
			if(watch[index]!=null) {
				if (model.equals(watch[index].getModel())) {
					watch[index] = null;
					return "Deleted";
				}
			}

		}
		return "Not Deleted";
	}
	

}
