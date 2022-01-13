package com.nSCorps.singleton.types.threadSafeSingleton;
// A thread safe singleton in created so that singleton property is maintained even in multithreaded environment.
public class ThreadSafeSingleton {
	// Java program to create Thread Safe
	// Singleton class
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton()
	{
		// private constructor
	}

	// synchronized method to control simultaneous access
	synchronized public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
