package com.nSCorps.throwNThrows;

public class ThrowExceptions {
	static int num = 0;
	static int num2 = 50;
	
	static void result() {
		if (num==0 || num2==0) {
			throw new ArithmeticException (" Sonne Hakbeda maga");
		}else
			System.out.println("Irli Bidu");
		System.out.println(num * num2);
	}
	
	static void validatepath() {
		String path = null;
		
		System.out.println(path);
	}
	public static void main(String[] args) {
	try {
		result();	
	} catch (Exception e) {
		System.out.println("Maga sari Illa" + e.getMessage());
	}
	}
}


	
