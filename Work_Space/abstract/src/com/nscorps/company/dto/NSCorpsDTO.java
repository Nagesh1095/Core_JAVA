package com.nscorps.company.dto;

public abstract class NSCorpsDTO {
	public byte noOfChairPersons = 13;
	public int noOfBranchsSoFar = 6;
	public String headOffice = "Bangalore";

	public void founder() {
		System.out.println("\n"+"N S Corps founded by NAGESHA");
	}
	public void countryOfOrigin() {
		System.out.println("\n"+"This company belongs INDIA");		
	}
	public abstract void nextBranch() ;
	public abstract void nextProduct() ; 
}
