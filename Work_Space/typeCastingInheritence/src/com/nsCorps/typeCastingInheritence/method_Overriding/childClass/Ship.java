package com.nsCorps.typeCastingInheritence.method_Overriding.childClass;

import com.nsCorps.typeCastingInheritence.method_Overriding.parentClass.Transportation;

public class Ship extends Transportation{
	  public String name;
	  public double weight;
	  public String haltingyards;
	  public String color;
	  
	  
	  public void watertransport() {
		  System.out.println("ships are the largest mode of water transportation");
	  }
	  
	  public void shippinggoods() {
		  System.out.println("large goods are shipped by ships");
	  }
	  
	  @Override
	  public void travelling() {
		  super.timeconvinient();
		  System.out.println("compare to road transport water travelling is safety");
	  }

	}
