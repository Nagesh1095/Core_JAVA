package com.nSCorps.singleton.types.threadSafeSingleton;

public class TestThreadSafeSingleton {
	public static void main(String[] args) {
		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
		System.out.println(threadSafeSingleton.hashCode());
	}
}
