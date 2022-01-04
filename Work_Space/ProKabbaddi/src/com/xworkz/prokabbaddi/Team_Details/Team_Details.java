package com.xworkz.prokabbaddi.Team_Details;

public class Team_Details {
	String teamname;
	byte noofplayers;
	String homeplace;
	String captain;
	String coach;
	String jersycolour;
	String mainraider;
	String[] args = new String[9];
		
	public Team_Details(String []args) {
		this.args=args;
			
	}

	public Team_Details(String teamname) {
		this.teamname = teamname;
	}

	public Team_Details(byte noofplayers, String homeplace) {
		this.noofplayers = noofplayers;
		this.homeplace = homeplace;
	}

	public Team_Details(String homeplace, String captain, String coach) {
		this.homeplace = homeplace;
		this.captain = captain;
		this.coach = coach;
	}

	public Team_Details(String jersycolour, String mainraider) {
		this.jersycolour = jersycolour;
		this.mainraider = mainraider;
	}
	
	   
	
	public Team_Details(String teamname, byte noofplayers, String homeplace, String captain, String coach,
			String jersycolour, String mainraider, String[] args) {
		this(noofplayers,homeplace);
		this.captain = captain;
		this.coach = coach;
		this.jersycolour = jersycolour;
		this.mainraider = mainraider;
		this.args = args;
	}

	public String show() {
		   String response="teamname="+teamname +"\t"+"noofplayers="+noofplayers +"\t"+"homeplace="+homeplace +"\t"+"captain=" +captain +"\t"
				   +"coach=" +coach +"\t"+"jersycolour="+jersycolour +"\t"+"mainraider=" +mainraider +"\n"+"Teams =" +args[0] +"\t"+args[1]+"\t"+args[2]+
				   "\t"+args[3]+"\t"+args[4]+"\t"+args[5]+"\t"+args[6];
	return response;
	}
		 
	  
	}

