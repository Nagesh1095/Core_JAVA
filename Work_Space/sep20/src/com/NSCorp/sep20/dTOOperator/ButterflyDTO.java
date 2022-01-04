package com.NSCorp.sep20.dTOOperator;

public class ButterflyDTO {
	public String name;
	public String color;
	public int length;
	public float height;
	
	public ButterflyDTO(String name,String color,int length,float height) {
		this.name=name;
		this.color=color;
		this.length=length;
		this.height=height;
	}

  public String printAll() {
	  
	  return "name="+name+"\t"+ "color="+color+ "\t"+ "length="+ length+"\t" +"height="+height;
  }
}
