package com.NSCorp.sep20.dTOOperator;

public class CricketDTO {
	public String type;
	public String teamname;
	public String captain;
	public byte noofplayers;
	public String coach;
	public int  noofovers;
	
	
	public CricketDTO(String type,String teamname,String captain,byte noofplayers,String coach,int  noofovers) {
		this.type=type;
		this.teamname=teamname;
		this.captain=captain;
		this.noofplayers=noofplayers;
		this.coach=coach;
		this.noofovers=noofovers;
		
	}
	
	public String printAll() {
		return "type=" +type +"\t" +"teamname="+teamname+"\t"+"captain="+captain +"\t"+"noofplayers="+noofplayers+ "\t"+
	         "coach="+coach +"\t"+"noofovers="+noofovers;
	}

     
}


