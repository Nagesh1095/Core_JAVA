package com.NSCorp.sep20.dTOOperator;

public class TransportDTO {
	public String vehicletype;
	public String vehicle;
	public int priceofvehicle;
	public String color;
	public String destiny;
	
	public TransportDTO(String vehicletype,String vehicle,int priceofvehicle,String color,String destiny) {
		
		this.vehicletype=vehicletype;
		this.vehicle=vehicle;
		this.priceofvehicle=priceofvehicle;
		this.color=color;
		this.destiny=destiny;
	}

     public String printAll() {
    	 
    	 return "vehicletype="+vehicletype +"\t"+"vehicle="+vehicle +"\t"+"priceofvehicle="+priceofvehicle+ "\t"+
      "color="+color+"\t"+"destiny="+destiny;
     }
}
