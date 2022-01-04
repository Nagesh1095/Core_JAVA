package com.xworkz.cricket.ODI;

public class ODI {
	int Noofteams;
	String Country;
	int Noofplayers;
	String Captain;
	String Vicecaptain;
	String Jersycolour;
	String Battingcoach;
	String Bowlingcoach;
	
	public ODI(int noofteams) {
		Noofteams = noofteams;
	}
	
	public ODI(String country, int noofplayers) {
		Country = country;
		Noofplayers = noofplayers;
	}
	
	public ODI(String captain, String vicecaptain) {
		Captain = captain;
		Vicecaptain = vicecaptain;
	}
	
	public ODI(String jersycolour, String battingcoach, String bowlingcoach) {
		Jersycolour = jersycolour;
		Battingcoach = battingcoach;
		Bowlingcoach = bowlingcoach;
	}
	
	public ODI(int noofteams ,String country, int noofplayers, String captain, String vicecaptain, String jersycolour, String battingcoach,
		      String bowlingcoach) {
		Noofteams = noofteams;
		Country = country;
		Noofplayers = noofplayers;
		Captain = captain;
		Vicecaptain = vicecaptain;
		Jersycolour = jersycolour;
		Battingcoach = battingcoach;
		Bowlingcoach = bowlingcoach;
	  
	}

	public String display() {
		return "Noofteams=" + Noofteams + ", Country=" + Country + ", Noofplayers=" + Noofplayers + ", Captain="
				+ Captain + ", Vicecaptain=" + Vicecaptain + ", Jersycolour=" + Jersycolour + ", Battingcoach="
				+ Battingcoach + ", Bowlingcoach=" + Bowlingcoach ;
	}
    
}
