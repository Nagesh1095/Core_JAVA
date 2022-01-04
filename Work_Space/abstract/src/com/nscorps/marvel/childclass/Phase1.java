package com.nscorps.marvel.childclass;

import com.nscorps.marvel.dto.MCUDTO;

public abstract class Phase1 extends MCUDTO {

	@Override
	public void phase1() {
	System.out.println("Iron Man , The Incredible Hulk , Iron Man 2 , Thor , Captain America , The Avengers");	
	}
	public abstract void phase2(); 
	public abstract void phase3();
	public abstract void phase4(); 
}
