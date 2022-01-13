package com.nSCorps.singleton.types.EagerImpl;

public class TestEagerImpl {
	public static void main(String[] args) {
		EagerImpl eagerImpl = EagerImpl.getInstance();
		System.out.println(eagerImpl.equals(eagerImpl));
	}
}
