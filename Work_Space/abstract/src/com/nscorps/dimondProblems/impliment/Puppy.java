package com.nscorps.dimondProblems.impliment;

import com.nscorps.dimondProblems.interfaces.Dog;
import com.nscorps.dimondProblems.interfaces.Loin;

public class Puppy implements Dog, Loin {

	@Override
	public void eat() {
		System.out.println("animals eat food");
	}

}
