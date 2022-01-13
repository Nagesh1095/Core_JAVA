package com.nSCorps.singleton.types.static_block;

public class TestStaticBlock {

	public static void main(String[] args) {
		Static_block block = Static_block.instance;
		System.out.println(block.hashCode());
	}

}
