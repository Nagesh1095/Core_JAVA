package com.nscorp.arrays;

import java.util.Arrays;
import java.util.List;

public class Array {
	public static void main(String args[]) {

		String a[] = new String[] { "Nagesh", "Kamala", "Faisal", "Madhushre", "Shilpa" };

		// Listig
		List list = Arrays.asList(a);
		System.out.println("The list is:" + list);

		// Binery Search in Arrays
		byte byteArr[] = { 10, 12, 14, 16, 18, 20 };
		short shortArr[] = { 135, 145, 155, 165, 175, 185, 195 };
		Arrays.sort(byteArr);
		Arrays.sort(shortArr);
		byte byteKey = 14;
		short shortKey = 115;
		System.out.println(byteKey + " it will found at index = " + Arrays.binarySearch(byteArr, byteKey));
		System.out.println(shortKey + " it will found at index = " + Arrays.binarySearch(shortArr, shortKey));

		// Array Copy
		int n[] = { 1, 3, 5 };
		int m[] = new int[n.length];
		m = n;
		m[0]++;
		System.out.println("Contents Of n");
		for (int index = 0; index < n.length; index++)
			System.out.print(n[index] + "");
		System.out.println("\n\nContents Of m");
		for (int index = 0; index < m.length; index++)
			System.out.print(m[index] + "");
	}
}