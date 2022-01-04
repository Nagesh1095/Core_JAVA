package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.Temple;

public class TestTemple {
		public static void main(String []args)
		{
			Temple operation=new Temple();
			operation.add("Hanuman Temple");
			operation.add("isckon Temple");
			operation.add("Banashankari Temple");
			operation.add("Krishna Temple");
			operation.add("Shiva Temple");
			operation.add("Ganesh Temple");
			operation.add("Ram Temple");
			operation.add("Tirupati Temple");
			operation.add("Darmastala Temple");
			operation.add("Kukke Temple");
			operation.add("Virupakshi Temple");
		
			operation.printAll();
			
			String result=operation.update("Hanuman Temple","isckon Temple");
			System.out.println(result);
			String result1=operation.update("Darmastala Temple","Virupakshi Temple");
			System.out.println(result1);
			String result2=operation.update("Kukke Temple","Hanuman Temple");
			System.out.println(result2);
			String result3=operation.update("Ram Temple","Ganesh Temple");
			System.out.println(result3);
			String result4=operation.update("Krishna Temple","Tirupati Temple");
			System.out.println(result4);
			
			
			operation.printAll();
			 
			
		}

	}



		

