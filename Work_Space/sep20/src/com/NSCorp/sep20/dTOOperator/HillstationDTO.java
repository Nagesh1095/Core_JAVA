package com.NSCorp.sep20.dTOOperator;

public class HillstationDTO {
	  public String name;
	  public String area;
	  public int distance;
	  public byte entryfee;
	  
	  public HillstationDTO(String name , String area,int distance,byte entryfee) {
		  this.name=name;
		  this.area=area;
		  this.distance=distance;
		  this.entryfee=entryfee;
		  
	  }
   public String printAll() {
  	 return "name="+name +"\t"+"area="+area +"\t"+"distance="+distance +"\t"+"entryfee="+entryfee;
   }
}
