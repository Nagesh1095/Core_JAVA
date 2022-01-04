package com.NSCorp.sep20.CURDOperation;

import com.NSCorp.sep20.dTOOperator.DTOoperation;

public class Operatordto {
	DTOoperation[] operation = new DTOoperation[5];
	int index=0;
	
	public void add(DTOoperation name) {
		if(index<operation.length) {
			operation[index]=name;
			index++;
			
		}
	}

  public void display() {
	  for(int index=0;index<operation.length;index++) {
		  System.out.println(operation[index].printAll());
	  }
  }


}

