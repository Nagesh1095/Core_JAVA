package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.Transportation;

public class TestTransportation {
	
	public static void main(String []args)
	{
		Transportation operation=new Transportation();
		operation.add("Truck");
		operation.add("Bicycle");
		operation.add("Bus");
		operation.add("Taxi");
		operation.add("Car");
		operation.add("Ambulance");
		operation.add("Lorry");
		operation.add("Van");
		operation.add("Helicopter");
		operation.add("Bike");
		operation.add("Ship");
	
		operation.printAll();
		
		String result=operation.update("Car","CAR");
		System.out.println(result);
		String result1=operation.update("Ship","SHIP");
		System.out.println(result1);
		String result2=operation.update("Bike","BIKE");
		System.out.println(result2);
		String result3=operation.update("Taxi","TAXI");
		System.out.println(result3);
		String result4=operation.update("Bus","BUS");
		System.out.println(result4);
		
		
		operation.printAll();
		 
		
	}

}


