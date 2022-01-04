package com.nscorps.inheritence.childClass;

import com.nscorps.inheritence.perentClass.Birds;

public class Peacock extends Birds{
	public String color="blue-green";
	public byte weight =5;
	public float height =2.56f;
	public byte nooflegs=2;
	public float length =4.8f;
	
	public Peacock() {
		System.out.println("Invoking Peacock");
	}
	
	public String dance(String dancing) {
		return  dancing;
	}
	
	public String speerch(String speerch) {
		return  speerch;
	}
	
	public String fly(String fly) {
		return  fly;
	}
	
	public boolean layingEgg(boolean layingEgg) {
		return layingEgg;
	}

}
