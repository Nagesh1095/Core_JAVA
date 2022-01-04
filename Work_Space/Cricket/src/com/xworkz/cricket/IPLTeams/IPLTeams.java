package com.xworkz.cricket.IPLTeams;

public class IPLTeams {
	 int No_of_teams;
	 String Teamname;
	 String captain;
	 String Homestate;
	 int noofplayers;
	 String Jersycolour;
	 String Titlesponser;
	 String Official_broadcaster;
	 String Official_partner;
	
	 public IPLTeams(int no_of_teams) {
		this.No_of_teams = no_of_teams;
	 }
	
	 public IPLTeams(String teamname, String captain) {
		this.Teamname = teamname;
		this.captain = captain;
	 }
	
	 public IPLTeams(String homestate,int noofplayers) {
		this.Homestate = homestate;
		this.noofplayers = noofplayers;
	 }
	
	 public IPLTeams(String jersycolour) {
		this.Jersycolour = jersycolour;
	 }
	 
	 public IPLTeams(String titlesponser,String official_broadcaster,String official_partner) {
		this.Titlesponser = titlesponser;
		this.Official_broadcaster=official_broadcaster;
		this.Official_partner=official_partner;
	}
   
	 public IPLTeams(int no_of_teams,String teamname, String captain, String homestate, int noofplayers, String jersycolour,
   		String titlesponser,String official_broadcaster,String official_partner ) {
		this(no_of_teams);
   	    this.Teamname = teamname;
 		this.captain = captain;
 		this.Homestate = homestate;
 		this.noofplayers = noofplayers;
		this.Jersycolour = jersycolour;
		this.Titlesponser = titlesponser;
		this.Official_broadcaster = official_broadcaster;
		this.Official_partner = official_partner;
  
     }    
         public String printAll() {
       	 String response ="no_of_teams =" + No_of_teams +"\t"+"teamname=" +Teamname +"\t"+"captain=" +captain +"\t"+"homestate=" +Homestate + 
       "\t"+ "noofplayers=" +noofplayers +"\t"+"jersycolour=" +Jersycolour +"\t"+"titlesponser=" +Titlesponser +"\t"+"official_broadcaster="
       	                    +Official_broadcaster +"\t"+"official_partner=" +Official_partner;
       	 return response;
         }

}