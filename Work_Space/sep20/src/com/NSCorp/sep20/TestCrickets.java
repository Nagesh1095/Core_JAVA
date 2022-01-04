package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.Crickets;

public class TestCrickets {
	public static void main(String[] args) {
		Crickets cricket=new Crickets();
		cricket.add("kohli");
		cricket.add("ABD");
		cricket.add("padikkal");
		cricket.add("chahal");
		cricket.add("rhaina");
		cricket.add("maxwell");
		cricket.add("sachin");
		cricket.add("dhoni");
		cricket.add("dravid");
		cricket.add("srishanth");
		cricket.printALL();
	    System.out.println();
	    
		String result=cricket.update("kohli","virat kohli");
		System.out.println(result);
		
	    String result1=cricket.update("ABD","ABDeviliers");
	    System.out.println(result1);

		String result2=cricket.update("sachin","sachin tendulkar");
		System.out.println(result2);
		
		String result3=	cricket.update("dravid","rahul dravid");
		System.out.println(result3);
		
		String result4=cricket.update("dhoni","mahendra singh dhoni");
		System.out.println(result4);
		
		String result5=cricket.update("rhaina","suresh rhaina");
		System.out.println(result5);

		String result6=cricket.update("maxwell","glen maxwell");
	    System.out.println(result6);
		
		String result7=cricket.update("padikkal","devdatt padikkal");
		System.out.println(result7);
		
		String result8=cricket.update("srishanth","srishanth singh");
		System.out.println(result8);
		
		String result9=cricket.update("chahal","yuzi chahal");
		System.out.println(result9);
		
		
		
		cricket.printALL();
		
		String resp = cricket delete("Kohli");
		System.out.println();
	}

}

