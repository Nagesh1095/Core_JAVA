package com.xworkz.cricket;

import com.xworkz.cricket.IPLTeams.IPLTeams;

public class TestIPLTeams {
	public static void main(String []nags) {
	 
	IPLTeams  team1 = new IPLTeams(8 , "RCB","Kohili" , "Banglore",11,"Red_Black","vivo" ,"star_sports" ,"Disnep+");
	IPLTeams  team2 = new IPLTeams(8 , "MI","Rohit" , "mumbai",11,"Blue","vivo" ,"star_sports" ,"Disnep+");
	IPLTeams  team3 = new IPLTeams(8 , "DC","Shreyas" , "Delhi",11,"Skyblue","vivo" ,"star_sports" ,"Disnep+");
	IPLTeams  team4 = new IPLTeams(8 , "KKR","Dinesh_karthik" , "Kolkata",11,"purple","vivo" ,"star_sports" ,"Disnep+");
	IPLTeams  team5 = new IPLTeams(8 , "CSK","Dhoni" , "chennai",11,"yellow","vivo" ,"star_sports" ,"Disnep+");
	IPLTeams  team6 = new IPLTeams(8 , "SRH","warner" , "hyderabad",11,"orange","vivo" ,"star_sports" ,"Disnep+");
	IPLTeams  team7 = new IPLTeams(8 , "PNBXII","Rahul" , "punjab",11,"pink","vivo" ,"star_sports" ,"Disnep+");
	IPLTeams  team8 = new IPLTeams(8 , "RR","samsung" , "rajastan",11,"Blue_pink","vivo" ,"star_sports" ,"Disnep+");
	
	System.out.println(team1.printAll());
	System.out.println(team2.printAll());
	System.out.println(team3.printAll());
	System.out.println(team4.printAll());
	System.out.println(team5.printAll());
	System.out.println(team6.printAll());
	System.out.println(team7.printAll());
	System.out.println(team8.printAll());
	
 	}

}
