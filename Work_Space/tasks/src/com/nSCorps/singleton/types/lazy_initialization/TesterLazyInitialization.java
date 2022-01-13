package com.nSCorps.singleton.types.lazy_initialization;

public class TesterLazyInitialization {
	public static void main(String[] args) {
		LazyInitialization initialization = LazyInitialization.getInstance();
		System.out.println(initialization.equals(initialization));
	}
}
