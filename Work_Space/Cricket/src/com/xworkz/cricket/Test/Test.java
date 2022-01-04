package com.xworkz.cricket.Test;

import java.util.Arrays;

public class Test {
	
	int year;
	short minutes;
	short noOfTeams;
	String country;
	String teamCaptain;
	String teamCoach;
	String jersyColour;
    short noOfWins;
    String[] teams;
    
    public Test(String []teams) {
    	this.teams=teams;	
    }
	
    public Test(int year) {
		this.year = year;
	}

	public Test( short minutes) {
		this.minutes = minutes;
	}

	public Test(short noofteams, String country) {
		this.noOfTeams = noofteams;
		this.country = country;
	}

	public Test(String teamcaptain, String teamcoach) {
		this.teamCaptain = teamcaptain;
		this.teamCoach = teamcoach;
	}

	public Test( int year,String jersycolour, short noofWins) {
		this(year);
		this.jersyColour = jersycolour;
		this.noOfWins = noofWins;
	}
 
   public Test(int year, short minutes,short noofteams, String country,String teamcaptain, String teamcoach,
		   String jersycolour, short noofWins,String[] teams) {
	    this(year);
		this.minutes = minutes;
		this.noOfTeams = noofteams;
		this.country = country;
		this.teamCaptain = teamcaptain;
		this.teamCoach = teamcoach;
		this.jersyColour = jersycolour;
		this.noOfWins = noofWins;
		this.teams = teams;
	}

public String printDetails() {
	return "year=" + year + ", minutes=" + minutes + ", noOfTeams=" + noOfTeams + ", country=" + country
			+ ", teamCaptain=" + teamCaptain + ", teamCoach=" + teamCoach + ", jersyColour=" + jersyColour
			+ ", noOfWins=" + noOfWins + ", teams=" + Arrays.toString(teams);
}

   	

}
