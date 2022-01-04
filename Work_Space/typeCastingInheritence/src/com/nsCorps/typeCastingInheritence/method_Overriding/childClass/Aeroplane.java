package com.nsCorps.typeCastingInheritence.method_Overriding.childClass;

import com.nsCorps.typeCastingInheritence.method_Overriding.parentClass.Transportation;

public class Aeroplane extends Transportation{
	public String name ="VISTARA";
	public String type ="full service";
	public String IATA ="UK";
	public double revenue =4738.45;
	public int noofemployees =900;

	public void premiumEconomy() {
		System.out.println("vistara is the first airline to introduce premiumeconomy in domesic market");
	}
	
	public void inFlightEntertainment() {
		System.out.println("vistara provide wifi services to entertain the passengers");
	}
	
	@Override
	public void travelling() {
		super.timeconvinient() ;
		System.out.println("air transportation helps in travelling people for different countries");
	}
	
}
