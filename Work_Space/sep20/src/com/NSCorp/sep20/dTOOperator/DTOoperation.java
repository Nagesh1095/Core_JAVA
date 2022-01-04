package com.NSCorp.sep20.dTOOperator;

public class DTOoperation {
	byte id;
	String name;
    String dOB;
    String email;
    long contact_no;
    String adress;
    
    public DTOoperation(byte id,String name,String dOB,String email,long contact_no,String adress) {
    	this.id=id;
    	this.name=name;
    	this.dOB=dOB;
    	this.email=email;
    	this.contact_no=contact_no;
    	this.adress=adress;
    }
    
 public String printAll() {
	 return "id=" +id +"\t" +"name=" +name +"\t"+"dOB="+dOB +"\t" +"email=" +email +"\t" +"contact_no" +contact_no
	          +"\t" +"adress=" +adress;
 }
}


