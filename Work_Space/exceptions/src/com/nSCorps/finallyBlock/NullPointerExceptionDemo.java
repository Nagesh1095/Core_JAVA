package com.nSCorps.finallyBlock;


public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		String ns = null;
		System.out.println("Method ON Aythu");
		try {
			System.out.println(ns.toLowerCase());	
		} finally {
			System.out.println("Method Mugithu Maga");
			
		}
		
	}
}
