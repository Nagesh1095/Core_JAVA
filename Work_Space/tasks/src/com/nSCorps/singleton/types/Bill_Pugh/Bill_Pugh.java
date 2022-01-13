package com.nSCorps.singleton.types.Bill_Pugh;

public class Bill_Pugh {

	private Bill_Pugh() {
		// private constructor
	}

	// Inner class to provide instance of class
	private static class BillPughSingleton {
		private static final Bill_Pugh INSTANCE = new Bill_Pugh();
	}

	public static Bill_Pugh getInstance() {
		return BillPughSingleton.INSTANCE;
	}
}
