package com.xworkz.cricket;

import com.xworkz.cricket.ODI.ODI;

public class TestODI {
	public static void main(String []nags) {
		
	ODI teams1 = new ODI(20 , "India", 15, "Kohili","Rohit","Blue","Ravishasthri","Anilkumble");
	ODI teams2 = new ODI(20 , "Australia", 15, "Aaronfinch","smith","yellow","justinlanger","hayden");
	ODI teams3 = new ODI(20 , "Southafrica", 15, "tembaBavuma","deanElgar","Green","MarkBoucer","jacqueskallis");
	ODI teams4 = new ODI(20 , "Newzeland", 15, "Williamson","ajazpatel","Black","GrayStead","jurgensen");
	ODI teams5 = new ODI(20 , "England", 15, "Morgan","Root","liteBlue","ChrisSilverwood","Minpatel");
	
	  System.out.println(teams1.display());
	  System.out.println(teams2.display());
	  System.out.println(teams3.display());
	  System.out.println(teams4.display());
	  System.out.println(teams5.display());
	 
	}

}
