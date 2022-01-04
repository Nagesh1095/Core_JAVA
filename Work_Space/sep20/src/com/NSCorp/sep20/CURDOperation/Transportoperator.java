package com.NSCorp.sep20.CURDOperation;

import com.NSCorp.sep20.dTOOperator.TransportDTO;

public class Transportoperator {
	
	TransportDTO[] transport=new TransportDTO[4];
	int index=0;
	
	public void travel(TransportDTO name) {
		if(index<transport.length) {
			transport[index]=name;
			index++;
		}
	}

      public void getAll() {
    	  for(int index=0;index<transport.length;index++) {
    		  if(transport[index]!=null) {
    		  System.out.println(transport[index].printAll());
    		  }
    		  }
      }

  public TransportDTO updatevehicleusingcolor(String vehicle,String color) {
	  TransportDTO transportdto = null;
	  for(int index=0;index<transport.length;index++) {
		  if(vehicle.equals(transport[index].vehicle)) {
			  transport[index].color=color;
			  transportdto=transport[index];
		  }
	  }
        return transportdto;
  }

  public TransportDTO delete(String vehicle) {
	  TransportDTO transportdto = null;
	  for(int index=0;index<transport.length;index++) {
		  if(vehicle.equals(transport[index].vehicle)) {
			  transport[index]=null;
			  transportdto=transport[index];
		  }
	  }
        return transportdto;
  }
}
