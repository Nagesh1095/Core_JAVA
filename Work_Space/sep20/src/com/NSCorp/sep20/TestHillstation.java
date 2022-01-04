package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.HillStations;

public class TestHillstation {
	public static void main(String []args)
	{
		HillStations operation=new HillStations();
		operation.add("Nandi");
		operation.add("Agumbe");
		operation.add("Kodachadri");
		operation.add("Kemmanagundi");
		operation.add("Chikmagalur");
		operation.add("BR");
		operation.add("Coorg");
		operation.add("Shimla");
		operation.add("Shilong");
		operation.add("Leh Ladakh");
		operation.add("Mahabaleshwar");
	
		operation.printAll();
		
		String result=operation.update("Mahabaleshwar","Leh Ladakh");
		System.out.println(result);
		String result1=operation.update("Shilong","Coorg");
		System.out.println(result1);
		String result2=operation.update("BR","Chikmagalur");
		System.out.println(result2);
		String result3=operation.update("Kodachadri","Coorg");
		System.out.println(result3);
		String result4=operation.update("Agumbe","Shimla");
		System.out.println(result4);
		
		
		operation.printAll();
		 
		
	}

}



	



