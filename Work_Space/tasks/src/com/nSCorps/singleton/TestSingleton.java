package com.nSCorps.singleton;

public class TestSingleton {
	public static void main(String[] args) {

		Singleton singleton = Singleton.instance();
		singleton.demo();
		singleton.instance();

	}

}
