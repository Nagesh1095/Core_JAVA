package com.nsCorps.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Chocolates {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList(); // creating object

		// System.out.println("Adding Chocolates to list .......\n");
		list.add("Bounty Bar"); // adding elements to list
		list.add("Sneekers");
		list.add("Poppins");
		list.add("Marbles");
		list.add("Coffee bite");
		list.add("London Dairy");
		list.add("Wowie");
		list.add("Munch");

//		For Loop
		System.out.println("Got By For.......... \n");
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index) + "\n");
		}

//		ForEach Loop
		System.out.println("Got By ForEach.......... \n");
		for (String lists : list) {
			System.out.println(lists + "\n");
		}

// 		While Loop		
		System.out.println("Got By WhileLoop...... ");
		Iterator<String> e = list.iterator();
		// int count = 0;
		while (e.hasNext()) {
			String string = (String) e.next();
			if (string.startsWith("M") || string.endsWith("s")) {
				System.out.println("\n" + string);
				// count++;
			}
		}

	}
}
