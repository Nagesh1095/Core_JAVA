package com.xworkz.bank;

import com.xworkz.bank.Accountholders.Accountholders;

public class TestAccountholders {
	public static void main(String []args) {
		
	
	Accountholders holder2 = new Accountholders("DBS Bank","jhon",80799,7634987253l,76920,"DUAP1234","BDA2345",8550071423l,962362282676l,"Kodigehalli");
	Accountholders holder3 = new Accountholders("DBS Bank","ram",80799,7634987253l,76920,"DUAP1234","BDA2345",8550071423l,962362282676l,"Kodigehalli");
	Accountholders holder5 = new Accountholders("DBS Bank","shashi",80798,5679834659l,76765,"DUAP1234","BDA2345",8550071423l,962362282676l,"Kodigehalli");
	Accountholders holder6 = new Accountholders("DBS Bank","ganga",18720,7634987253l,76920,"DVP1234","BDA2345",8550071423l,962362282676l,"Kodigehalli");
	Accountholders holder8 = new Accountholders("DBS Bank","arjun",18720,7634987253l,76920,"SVP1234","BDA2345",9916073718l,962362282676l,"Kodigehalli");
	Accountholders holder9 = new Accountholders("DBS Bank","Arun",80799,7634987253l,76920,"DUAP1234","BDA2345",8550071423l,962362282676l,"Kodigehalli");
	
       System.out.println(holder2.printall());	
       System.out.println(holder3.printall());
       System.out.println(holder5.printall());
       System.out.println(holder6.printall());
       System.out.println(holder8.printall());
       System.out.println(holder9.printall());
	}

}
