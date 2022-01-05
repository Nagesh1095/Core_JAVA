package com.nsCorps.calculater;

public class Calculator {

	public long add(long x, long y) {
		System.out.println("Adding Two Numbers");
		long z = x + y;
		return z;
	}

	public long sub(long x, long y) {
		System.out.println("Subtracting Two Numbers");
		long z = x - y;
		return z;
	}

	public void multi(long x, long y) {
		System.out.println("Multipling Two Numbers");
		if (x > 0 && y > 0) {
			long z = x * y;
			System.out.println("Ans is :" + z);
		} else
			System.out.println("Enter Valid Number");
	}

	public void div(long x, long y) {
		System.out.println("Dividing two Numbers");
		if (x > 0 && y > 0) {
			long z = x / y;
			System.out.println("Ans is :" + z);
		} else
			System.out.println("Enter Valid Number");

	}
//	public double add(double x, double y) {
//		System.out.println("Adding Two Numbers");
//		double z = x + y;
//		return z;
//	}
//
//	public double sub(double x, double y) {
//		System.out.println("Subtracting Two Numbers");
//		double z = x - y;
//		return z;
//	}
//
//	public void multi(double x, double y) {
//		System.out.println("Multipling Two Numbers");
//		if (x > 0 && y > 0) {
//			double z = x * y;
//			System.out.println("Ans is :" + z);
//		} else
//			System.out.println("Enter Valid Number");
//	}
//
//	public void div(double x, double y) {
//		System.out.println("Dividing two Numbers");
//		if (x > 0 && y > 0) {
//			double z = x / y;
//			System.out.println("Ans is :" + z);
//		} else
//			System.out.println("Enter Valid Number");
//
//	}
}
