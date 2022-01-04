package com.nscorps.ipl.dto;

public class IPLDTO {
	private String teamName;
	private byte noOfPlayers;
	private CaptainDTO captain;
	private String viseCaptain;
	private String owner;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public byte getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(byte noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	
	public String getViseCaptain() {
		return viseCaptain;
	}
	public void setViseCaptain(String viseCaptain) {
		this.viseCaptain = viseCaptain;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public CaptainDTO getCaptain() {
		return captain;
	}
	public void setCaptain(CaptainDTO captain) {
		this.captain = captain;
	}

	public String toString() {
		return "teamName=" + teamName + ", noOfPlayers=" + noOfPlayers + ", captain=" + captain
				+ ", viseCaptain=" + viseCaptain + ", owner=" + owner ;
	}
	
	
	
	

}
