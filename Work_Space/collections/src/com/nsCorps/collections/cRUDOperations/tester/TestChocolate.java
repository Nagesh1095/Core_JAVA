package com.nsCorps.collections.cRUDOperations.tester;

import java.util.ArrayList;

import com.nsCorps.collections.cRUDOperations.dto.Chocolate;
import com.nsCorps.collections.cRUDOperations.operations.Operation;

public class TestChocolate {
	public static void main(String[] args) {

		Chocolate dto = new Chocolate();
		dto.setName("perk");
		dto.setPrice(10);
		dto.setWeight(26);
		dto.setCalories(43.568f);

		Chocolate dto1 = new Chocolate();
		dto1.setName("Snikers");
		dto1.setPrice(50);
		dto1.setWeight(65.85f);
		dto1.setCalories(122.58f);

		Operation dao = new Operation();
		dao.insert(dto);
		dao.insert(dto1);
		dao.printAll();

		ArrayList<Chocolate> update = dao.updatePriceByName("perk", 25);
		System.out.println("\n" + update);

		dao.printAll();

		ArrayList<Chocolate> delete = dao.deleteByPrice(50);
		System.out.println(delete);
		dao.printAll();

	}

}
