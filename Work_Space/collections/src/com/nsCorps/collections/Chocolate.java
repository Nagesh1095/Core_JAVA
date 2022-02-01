package com.nsCorps.collections;

import java.util.List;
import java.util.ArrayList;

public class Chocolate {

	public static void main(String[] args) {

		List list = new ArrayList(); // creating object

		System.out.println("Adding Chocolates to list--------->\n");
		list.add("Bounty Bar"); // adding elements to list
		list.add("Sneekers");
		list.add("Poppins");
		list.add("Marbles");
		list.add("Coffee bite");
		list.add("London Dairy");
		list.add("Wowie");
		list.add("Munch");
		System.out.println(list + "\n");

		System.out.println("Adding Chocolate at index 0--------->" + "\n");
		list.add(0, "Wowie"); // adding element at particular index
		System.out.println(list + "\n");

		List list1 = new ArrayList(); // creating object 1

		System.out.println("Adding Chocolate to list1--------->" + "\n");
		list1.add("Milk Treat"); // adding elements in collection1
		System.out.println(list1 + "\n");

		System.out.println("Adding list1 into list collection---------->" + "\n");
		list.addAll(list1); // combining two collections
		System.out.println(list + "\n");

		System.out.println("Adding list1 into list at index 1------------>" + "\n");
		list.addAll(1, list1); // adding collection at specified index
		System.out.println(list + "\n");

		System.out.println("checking whether Wowie is present in the list------------->" + "\n");
		boolean b1 = list.contains("Wowie"); // checking the element
		System.out.println(b1 + "\n");

		System.out.println("checking whether the list1 is prsent in list collection------------>");
		boolean b2 = list.containsAll(list1); // adding collection1 in collection
		System.out.println(b2 + "\n");

		System.out.println("checking whether list and list1 are equal------------->" + "\n");
		boolean b3 = list.equals(list1); // comparing collection1 and collection
		System.out.println(b3 + "\n");

		System.out.println("getting the element at index 5-------------->" + "\n");
		System.out.println(list.get(5) + "\n"); // getting element using index

		System.out.println("hashCode of list-------------->" + "\n");
		System.out.println(list.hashCode() + "\n"); // hashCode

		System.out.println("getting index of London Dairy------------>" + "\n");
		System.out.println(list.indexOf("London Dairy") + "\n"); // getting index of specified element

		System.out.println("checking whether the list is empty----------->" + "\n");
		boolean b4 = list.isEmpty(); // checking whether the collection is empty
		System.out.println(b4 + "\n");

		System.out.println("Last index/occurance of Wowie-------------->" + "\n");
		System.out.println(list.lastIndexOf("Wowie") + "\n"); // last index of repeated element

		System.out.println("removing element at index 2------------->" + "\n");
		System.out.println(list.remove(2) + "\n"); // removes the element at particular index

		System.out.println("remove element Munch-------------->" + "\n");
		System.out.println(list.remove("Munch") + "\n"); // removes element
		System.out.println(list + "\n");

		System.out.println("setting element Naturo at index 5------------->" + "\n");
		System.out.println(list.set(5, "Naturo") + "\n"); // setting elements using index
		System.out.println(list + "\n");

		System.out.println("retaining all the elements------------->" + "\n");
		boolean b5 = list.retainAll(list); // retaining the elements
		System.out.println(b5 + "\n");

		System.out.println("size of the collection list------------->" + "\n");
		System.out.println(list.size() + "\n"); // size of the exception

		System.out.println("conveting collection into array------------>" + "\n");
		Object[] array = list.toArray(); // collection to array
		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index] + "\n");
		}

		System.out.println("converting collection list into String---------->" + "\n");
		list.toString(); // to string
		System.out.println(list + "\n");

		System.out.println("removing all the elements of list------------>" + "\n");
		System.out.println(list.removeAll(list) + "\n"); // removes the collection
		System.out.println(list + "\n");

	}

}
