package com.nscorps.ipl.dto;

public class CaptainDTO {
	private String CaptainName;
	private byte AucPriceinCr;
	private String Experience;
	
	public String getCaptainName() {
		return CaptainName;
	}
	public void setCaptainName(String captainName) {
		CaptainName = captainName;
	}
	public int getAucPriceinCr() {
		return AucPriceinCr;
	}
	public void setAucPriceinCr(byte aucPriceinCr) {
		AucPriceinCr = aucPriceinCr;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	
	public String toString() {
		return "CaptainName=" + CaptainName + ", AucPriceinCr=" + AucPriceinCr + ", Experience="
				+ Experience ;
	}
	
	

}
