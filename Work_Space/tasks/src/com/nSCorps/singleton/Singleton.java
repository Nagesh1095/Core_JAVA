package com.nSCorps.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
		// private constructor prevents any other class from instantiating
	}

	public static Singleton instance() {
		return singleton;
	}

	protected static void demo() {
		System.out.println("Demo Example");
	}

}
