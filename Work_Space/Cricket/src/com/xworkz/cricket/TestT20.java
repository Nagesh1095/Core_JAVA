package com.xworkz.cricket;

import com.xworkz.cricket.T20.T20;

public class TestT20 {
	public static void main(String []nags) {
		
		T20 team1 =new T20(2020 , 20, (short)80,(short)12,"INDIA","Viratkohili","Ravishastri","Blue",(short)6);
		T20 team2 =new T20(2020 , 20, (short)80,(short)12,"Australia","Aaronfinch","justinlaunger","yellow",(short)8);
		T20 team3 =new T20(2020 , 20, (short)80,(short)12,"Newzealand","Williamson","Graystead","Black",(short)9);
		T20 team4 =new T20(2020 , 20, (short)80,(short)12,"Southafrica","tembaBavuma","MarkBoucer","Green",(short)7);
		T20 team5 =new T20(2020 , 20, (short)80,(short)12,"England","Morgan","ChrisSilverwood","liteBlue",(short)5);
		
		System.out.println(team1.Showoff());
		System.out.println(team2.Showoff());
		System.out.println(team3.Showoff());
		System.out.println(team4.Showoff());
		System.out.println(team5.Showoff());
		
		
	}

}
