package com.nSCorps.exceptionsNBlocks;

public class Names {

	static String name[] = { "Nagesh", null, "Ammu", "Anusha", "Arun" };

	public static void main(String[] args) {
		System.out.println(name[0].toUpperCase());
		try {
			System.out.println(name[1].toUpperCase());
			
		} 
		finally {
			System.out.println("End of block");
		}
		System.out.println(name[2].toUpperCase());
		System.out.println(name[3].toUpperCase());
		System.out.println(name[4].toUpperCase());

	}
}
