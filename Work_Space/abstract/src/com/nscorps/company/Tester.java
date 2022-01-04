package com.nscorps.company;

import com.nscorps.company.dto.FuturePlan;
import com.nscorps.company.dto.NSCorpsDTO;

public class Tester {
	public static void main(String[] args) {
		NSCorpsDTO corpsDTO = new FuturePlan();
		System.out.println("No of Chairpersons are "+corpsDTO.noOfChairPersons);
		System.out.println("\n"+"No of Branches are " +corpsDTO.noOfBranchsSoFar);
		System.out.println("\n"+"The Head Office is in " +corpsDTO.headOffice);

		corpsDTO.founder();
		corpsDTO.countryOfOrigin();
		corpsDTO.nextBranch();
		corpsDTO.nextProduct();

	}
}
