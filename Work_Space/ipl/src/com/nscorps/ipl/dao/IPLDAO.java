package com.nscorps.ipl.dao;

import com.nscorps.ipl.dto.IPLDTO;

public class IPLDAO {
	IPLDTO[] dtos=new IPLDTO [5];
	int index=0;
	public void add(IPLDTO name) {
		if(index<dtos.length) {
			dtos[index]=name;
			index++;
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			System.out.println(dtos[index].toString());
			}
		}
	}
	
	public IPLDTO getbyteamName(String teamName ){
		for (int index = 0; index < dtos.length; index++) {
			if(teamName.equals(dtos[index].getTeamName())){
				return dtos[index];
			}
			
		}
		return null;
	}
	
	public IPLDTO getbyExperience(String Experience ){
		for (int index = 0; index < dtos.length; index++) {
			if(Experience.equals(dtos[index].getCaptain().getExperience())){
				return dtos[index];
			}
			
		}
		return null;
	}
	
	
	public IPLDTO updateteamNamebyOwner(String owner,String teamName){
		IPLDTO ipldetailsDTO=null;
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(owner.equals(dtos[index].getOwner())){
					dtos[index].setTeamName(teamName);
					ipldetailsDTO=dtos[index];
				}									
			}
		}
	return ipldetailsDTO;
		}
	
	public IPLDTO updatenoOfPlayersbyViseCaptain(byte noOfPlayers ,String viseCaptain ){
		IPLDTO ipldetailsDTO1=null;
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(viseCaptain.equals(dtos[index].getViseCaptain())){
					dtos[index].setNoOfPlayers(noOfPlayers);
					ipldetailsDTO1=dtos[index];
				}									
			}
		}
	return ipldetailsDTO1;
		}
	
	
	public IPLDTO deletebycaptain(String Visecaptain) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(Visecaptain.equals(dtos[index].getViseCaptain())) {
				dtos[index]=null;
			}
		
			}
		}
		return dtos[index];
	}
	
	public IPLDTO deletebyowner(String owner) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(owner.equals(dtos[index].getOwner())) {
				dtos[index]=null;
			}
		
			}
		}
		return dtos[index];
	}
	

	
}
