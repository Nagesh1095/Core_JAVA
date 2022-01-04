package com.NSCorp.sep20.CURDOperation;

import com.NSCorp.sep20.dTOOperator.TempeldetailsDTO;

public class TempeloperatorDTO {
	TempeldetailsDTO[] tempeldto = new TempeldetailsDTO[5];
	 int index=0;
	 
	 public void pray(TempeldetailsDTO name) {
		 if(index<tempeldto.length) {
			 tempeldto[index]=name;
			 index++;
		 }
	 }
    public void getAll() {
    	for(int index=0;index<tempeldto.length;index++) {
    		if(tempeldto[index]!=null) {
    		System.out.println(tempeldto[index].printAll());
    		}
    	}
    }
    
    public TempeldetailsDTO updatemaintainancebyname(String name,String maintainance) {
    	TempeldetailsDTO tempeldetails = null;
    	for(int index=0;index<tempeldto.length;index++) {
    		if(name.equals(tempeldto[index].name)) {
    			tempeldto[index].maintainance=maintainance;
    			tempeldetails=tempeldto[index];
    		}
    	}
          return tempeldetails;
    }
    public TempeldetailsDTO delete(String name) {
    	TempeldetailsDTO tempeldetails = null;
    	for(int index=0;index<tempeldto.length;index++) {
    		if(name.equals(tempeldto[index].name)) {
    			tempeldto[index]=null;
    			tempeldetails=tempeldto[index];
    		}
    	}
          return tempeldetails;
    } 
}
