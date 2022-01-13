package com.nSCorps.singleton.types;

public class GFG {
	private static GFG instance;

	private GFG()
	  {
	    // private constructor
	  }

	public static GFG getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (GFG.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new GFG();
				}

			}
		}
		return instance;
	}
}
