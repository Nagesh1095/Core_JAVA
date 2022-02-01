package com.nsCorps.collections.cRUDOperations.operations;

import java.util.ArrayList;

import com.nsCorps.collections.cRUDOperations.dto.Chocolate;

public class Operation {
	ArrayList<Chocolate> chocolate = new ArrayList<Chocolate>();

	public void insert(Chocolate obj) {
		chocolate.add(obj);
		System.out.println("Values Added\n");
	}

	public void printAll() {
		for (Chocolate chocolateDTO : chocolate) {
			System.out.println(chocolateDTO.toString());
		}
	}

	public ArrayList<Chocolate> updatePriceByName(String name, int price) {

		for (Chocolate chocolateDTO : chocolate) {
			if (name.equals(chocolateDTO.getName())) {
				chocolateDTO.setPrice(price);
			}

		}
		return chocolate;
	}

	public ArrayList<Chocolate> deleteByPrice(int price) {
		for (Chocolate chocolateDTO : chocolate) {
			if (price == (chocolateDTO.getPrice())) {
				chocolate = null;

			}

		}
		return chocolate;
	}

}
