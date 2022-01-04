package com.NSCorp.sep20.CURDOperation;

import com.NSCorp.sep20.dTOOperator.HillstationDTO;

public class HillstationOperatordto {
	HillstationDTO[] hillstation = new HillstationDTO[4];
	int index=0;
	
	public void truck(HillstationDTO name) {
		if(index<hillstation.length) {
			hillstation[index]=name;
			index++;
		}
	}

    public void getAll() {
    	for(int index=0;index<hillstation.length;index++) {
    		if(hillstation[index]!=null) {
    		System.out.println(hillstation[index].printAll());
    		}
    	}
    }
      
      public HillstationDTO updatenamebydistance(String name,int distance) {
    	  HillstationDTO hill =null;
    	  for(int index=0;index<hillstation.length;index++) {
    		  if(name.equals(hillstation[index].name)) {
    			  hillstation[index].distance=distance;
    			  hill=hillstation[index];
    		  }
    	  }
    	  
           return hill;
      }
      public HillstationDTO delete(String name) {
    	  HillstationDTO hillstationdto =null;
    	  for(int index=0;index<hillstation.length;index++) {
    		  if(name.equals(hillstation[index].name)) {
    			  hillstation[index]=null;
    			  hillstationdto=hillstation[index];
    		  }
    	  }
    	  
           return hillstationdto;
      }
}
