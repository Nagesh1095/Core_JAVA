package com.nscorps.inheritence.childClass;

import com.nscorps.inheritence.perentClass.Airlines;

public class Indigo extends Airlines{
	public int founded =2005;
	public short fleetSize=275;
	public byte destinations=95;
	public String founder="Rahul Bhatia";
	public String revenue="15677.60crore";
	
	public int noofemployees(int employees) {
		return employees;
	}
	
	public byte noofdestinations(byte destinies) {
		return destinies;
	}
	
	public String airbusname(String name) {
		return name;
	}
	
	public String newDomesticRule(String hyderabad) {
		return hyderabad;
	}
	
	public String tiesForEntertainment(String sony) {
		return sony;
	}
	

}
