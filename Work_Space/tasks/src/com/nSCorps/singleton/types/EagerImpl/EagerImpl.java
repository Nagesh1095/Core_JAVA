package com.nSCorps.singleton.types.EagerImpl;
//This is the simplest method of creating a singleton class. 
//In this, object of class is created when it is loaded to the memory by JVM.
//It is done by assigning the reference an instance directly. 
//Exception handling is not possible.
public class EagerImpl {
	private static final EagerImpl instance = new EagerImpl();

	private EagerImpl() {
	}

	public static EagerImpl getInstance() {
		return instance;
	}
}
