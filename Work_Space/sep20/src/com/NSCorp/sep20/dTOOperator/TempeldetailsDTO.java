package com.NSCorp.sep20.dTOOperator;

public class TempeldetailsDTO {
	public String name;
	public String lord;
	public String place;
	public int opentimings;
	public String maintainance;
	
	public TempeldetailsDTO(String name,String lord,String place,int opentimings,String maintainance) {
		this.name=name;
		this.lord=lord;
		this.place=place;
		this.opentimings=opentimings;
		this.maintainance=maintainance;
	}
	
    public String printAll() {
    	return "name="+name +"\t"+"lord="+lord +"\t"+"place="+place +"\t"+"opentimings="+opentimings +"\t"+
              "maintainance="+maintainance;
    }
}
