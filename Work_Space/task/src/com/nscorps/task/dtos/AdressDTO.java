package com.nscorps.task.dtos;

public class AdressDTO {
	private String buildingName;
	private AreaDTO area;
	
	
	public String getBuildingName() {
		return buildingName;
	}


	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	public AreaDTO getArea() {
		return area;
	}


	public void setArea(AreaDTO area) {
		this.area = area;
	}


	public String toString() {
		return "buildingName=" + buildingName + ", area=" + area;
	}

	
	
	
}
