package com.nSCorps.singleton.types.lazy_initialization;
//In this method, object is created only if it is needed. This may prevent resource wastage.
//It can be used in a single threaded environment because multiple threads can break singleton 
//property because they can access get instance method simultaneously and create multiple objects. 
public class LazyInitialization {
	 private static LazyInitialization instance;
	 
	  private LazyInitialization()
	  {
	    // private constructor
	  }
	 
	  //method to return instance of class
	  public static LazyInitialization getInstance()
	  {
	    if (instance == null)
	    {
	      // if instance is null, initialize
	      instance = new LazyInitialization();
	    }
	    return instance;
	  }
}
