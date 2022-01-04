package com.nsCorps.typeCastingInheritence.method_Overriding.childClass;

import com.nsCorps.typeCastingInheritence.method_Overriding.parentClass.Transportation;

public class Bus extends Transportation{
	public String model;
	public String type;
	public byte noofseats;
	public byte nooftyres;
	public String color;
	
	@Override
	public void travelling() {
		super.timeconvinient();
		System.out.println("Bus is the main source of transportation");
	}
	
	public void heavyLoad() {
		System.out.println("busses are help in taking the heavy load or passengers");
	}

}
