package com.nSCorps.singleton.types.static_block;
//This is also a sub part of Eager initialization.
//The only difference is object is created in a static block so that we can have access on its creation, 
//like exception handling. In this way also, object is created at the time of class loading. 
//It can be used when there is a chance of exceptions in creating object with eager initialization.
//Exceptions can be handled in static block.
public class Static_block {
	public static Static_block instance;
	 
	  private Static_block()
	  {
	    // private constructor
	  }
	static
	  {
	    // static block to initialize instance
	    instance = new Static_block();
	  }
}
