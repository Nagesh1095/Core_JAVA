package com.nscorps.task.dtos;

public class DistrictDTO {
	private String name;
	private TalukDTO taluk;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TalukDTO getTaluk() {
		return taluk;
	}

	public void setTaluk(TalukDTO taluk) {
		this.taluk = taluk;
	}


  public String toString() {
		return "name=" + name + ", taluk=" + taluk;
	}
	
	

}


