package com.nscorps.inheritence;

import com.nscorps.inheritence.childClass.Indigo;

public class TestAirlines {
	public static void main(String []args) {
		
		Indigo indigo =new Indigo();
		
		System.out.println(indigo.purpose);
		System.out.println(indigo.firstCompany);
		System.out.println(indigo.yearoffoundation);
		System.out.println(indigo.globalGDP);
		System.out.println(indigo.price);
		
		String air1 = indigo.emphasis("wide buisness");
		System.out.println("Airline is one of" +air1);
		
		String air2 =indigo.types("national or international");
		System.out.println("Types of airlines mainly" +air2);
		
		String air3 =indigo.biggestAirline("amrican airlines");
		System.out.println("The biggest airline is"  +air3);
		
		String air4 =indigo.buisnessModel("full service carrier");
		System.out.println("The main buisness model"  +air4);
		
		String air5=indigo.website("book in online");
		System.out.println("For booking tickets we can "+ air5);
		
		System.out.println(indigo.founded);
		System.out.println(indigo.fleetSize);
		System.out.println(indigo.destinations);
		System.out.println(indigo.founder);
		System.out.println(indigo.revenue);
		
		int ind1 =indigo.noofemployees(23711);
		System.out.println("Employees in indigo are "  +ind1);
		
		byte ind2 =indigo.noofdestinations((byte)95);
		System.out.println("Number of destinations were "  +ind2);
		
		String ind3=indigo.airbusname(" BSE:539448");
		System.out.println("Name of the airbus"  +ind3);
		
		String ind4=indigo.newDomesticRule("inigo commits to ordering 150 airbus");
		System.out.println("The new rule "   +ind4);
		
		String ind5=indigo.tiesForEntertainment("TieUp with sony");
		System.out.println("For entertainig purpose indigo  " +ind5);
		
	}

}
