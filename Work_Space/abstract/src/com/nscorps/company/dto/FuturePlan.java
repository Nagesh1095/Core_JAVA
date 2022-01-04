package com.nscorps.company.dto;

public class FuturePlan extends NSCorpsDTO {

	// with annotation
	@Override
	public void nextBranch() {
		System.out.println("\n"+"Next Branch Opening in CANADA");
	}

	//without annotation
	public void nextProduct() {
		System.out.println("\n"+"Next Product Will be Smart Gaming Rig");
	}

}
