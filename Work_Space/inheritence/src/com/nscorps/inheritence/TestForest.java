package com.nscorps.inheritence;

import com.nscorps.inheritence.childClass.EverGreenForest;
import com.nscorps.inheritence.perentClass.Forest;

public class TestForest {
	public static void main(String[] args) {

		Forest forest = new Forest();

		System.out.println(forest.countInIndia);
		System.out.println(forest.jobs);
		System.out.println(forest.types);
		System.out.println(forest.jobs);
		System.out.println(forest.caughtFire);

		EverGreenForest egf = new EverGreenForest();

		System.out.println(egf.area);
		System.out.println(egf.name);
		System.out.println(egf.count);
		System.out.println(egf.population);
		System.out.println(egf.passportNeeded);

		System.out.println(egf.countInIndia);
		System.out.println(egf.jobs);
		System.out.println(egf.types);
		System.out.println(egf.jobs);
		System.out.println(egf.caughtFire);
	}

}
