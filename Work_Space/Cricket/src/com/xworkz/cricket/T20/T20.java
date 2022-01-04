package com.xworkz.cricket.T20;

public class T20 {
		String Country;
		String Teamcaptain;
		String Teamcoach;
		String Jersycolour;
		short NoofWins;
		int Year;
		int NoofOvers;
		short Minutes;
		short Noofteams;
    public T20(int year) {
		this.Year = year;
	}

	public T20(int noofOvers, short minutes) {
		this.NoofOvers = noofOvers;
		this.Minutes = minutes;
	}

	public T20(short noofteams, String country) {
		this.Noofteams = noofteams;
		this.Country = country;
	}

	public T20(String teamcaptain, String teamcoach) {
		this.Teamcaptain = teamcaptain;
		this.Teamcoach = teamcoach;
	}

	public T20( int year,String jersycolour, short noofWins) {
		this(year);
		this.Jersycolour = jersycolour;
		this.NoofWins = noofWins;
	}
 
   
	
	public T20(int year, int noofOvers, short minutes, short noofteams, String country, String teamcaptain,
			String teamcoach, String jersycolour, short noofWins) {
		Year = year;
		NoofOvers = noofOvers;
		Minutes = minutes;
		Noofteams = noofteams;
		Country = country;
		Teamcaptain = teamcaptain;
		Teamcoach = teamcoach;
		Jersycolour = jersycolour;
		NoofWins = noofWins;
	}

	public String Showoff() {
		return "Year=" + Year + ", NoofOvers=" + NoofOvers + ", Minutes=" + Minutes + ", Noofteams="
				+ Noofteams + ", Country=" + Country + ", Teamcaptain=" + Teamcaptain + ", Teamcoach=" + Teamcoach
				+ ", Jersycolour=" + Jersycolour + ", NoofWins=" + NoofWins ;
	}

	

}
