package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.Butterfly;


public class TestButterfly {

	public static void main(String []args)
	{
		Butterfly operation=new Butterfly();
		operation.add("Brush footed");
		operation.add("Papilionide");
		operation.add("Hesperiidae");
		operation.add("Pieridae");
		operation.add("Lime");
		operation.add("Satyrs");
		operation.add("Danainae");
		operation.add("Pyrgiinae");
		operation.add("Checkerspots");
		operation.add("Spangle");
		operation.add("Emperors");
	
		operation.printAll();
		
		String result=operation.update("Brush footed","Satyrs");
		System.out.println(result);
		String result1=operation.update("Danainae","Emperors");
		System.out.println(result1);
		String result2=operation.update("Emperors","Danainae");
		System.out.println(result2);
		String result3=operation.update("Pieridae","Checkerspots");
		System.out.println(result3);
		String result4=operation.update("Spangle","Lime");
		System.out.println(result4);
		
		
		operation.printAll();
		
		 String tlt=operation.delete();
		  System.out.println(tlt);
		  
		  operation.printAll();
		
	}

}


