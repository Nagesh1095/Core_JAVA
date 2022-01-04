package com.NSCorp.sep20.CURDOperation;

import com.NSCorp.sep20.dTOOperator.ButterflyDTO;

public class Butterflyoperatordto {
	
	ButterflyDTO[]  butterflydto = new ButterflyDTO[4];
	int index=0;
	
	public void fly(ButterflyDTO name) {
		if(index<butterflydto.length) {
			butterflydto[index]=name;
			index++;
		}
	}

   public void getAll() {
	   for(int index=0;index<butterflydto.length;index++) {
		   System.out.println(butterflydto[index].printAll());
	   }
   }
 public ButterflyDTO updatenameusingheight(String name,float height) {
	 ButterflyDTO butterfly = null;
	 for(int index=0;index<butterflydto.length;index++) {
		 if(name.equals(butterflydto[index].name)) {
			 butterflydto[index].height=height;
			 butterfly=butterflydto[index];
		 }
	 }
         return butterfly;
 }

 public ButterflyDTO delete(String name) {
	 ButterflyDTO butterfly = null;
	 for(int index=0;index<butterflydto.length;index++) {
		 if(name.equals(butterflydto[index].name)) {
			 
			 butterflydto[index]=null;
			 butterfly=butterflydto[index];
		 }
	 }
         return butterfly;
 }
}
