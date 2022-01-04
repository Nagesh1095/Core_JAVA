package com.nsCorps.typeCastingInheritence.method_Overriding.childClass;

import com.nsCorps.typeCastingInheritence.method_Overriding.parentClass.Transportation;

public class Train extends Transportation{
	public String enginetype="diesel";
	public float length =2.2f;
	public byte noofcompartment=25;
	public String coachtype="AC compartment";
	
	
	public void sourceOfTransport() {
		System.out.println(" train is the number one mode of carrying the large people ");
	}
	
	@Override
	public void timeconvinient() {
		super. travelling();
		System.out.println("tarvelling in train we can manage the time");
		
	}
	
	public void chanceOfAccident() {
		System.out.println("in train transportation chances of accidents are less");
	}
	

}
