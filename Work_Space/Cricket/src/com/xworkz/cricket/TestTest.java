package com.xworkz.cricket;

import com.xworkz.cricket.Test.Test;

public class TestTest {
	
	public static void main(String[] nags) {


		String team[] ={"India","Newzealand","Southafrica","England","Australia"};
			
		Test match1 =new Test(2021 , (short)7200,(short)12,"India","Viratkohli","Dravid","White",(short)6,team);
		Test match2 =new Test(2021 , (short)7200,(short)12,"Australia","Tim Paine","justinlaunger","White",(short)8,team);
		Test match3 =new Test(2021 , (short)7200,(short)12,"Newzealand","Williamson","Graystead","White",(short)9,team);
		Test match4 =new Test(2021 , (short)7200,(short)12,"Southafrica","tembaBavuma","MarkBoucer","White",(short)7,team);
		Test match5 =new Test(2021 , (short)7200,(short)12,"England","Morgan","ChrisSilverwood","White",(short)5,team);
		
		System.out.println(match1.printDetails());
		System.out.println(match2.printDetails());
		System.out.println(match3.printDetails());
		System.out.println(match4.printDetails());
		System.out.println(match5.printDetails());
			
	}

}
