package com.nscorps.marvel;

import com.nscorps.marvel.childclass.Phase4;
import com.nscorps.marvel.dto.MCUDTO;

public class Tester {
	public static void main(String[] args) {
		MCUDTO mcudto = new Phase4();

		mcudto.setMoviesInMCU((byte) 27);
		mcudto.setMCU("Marvel Cinematic Universe");
		mcudto.setPhasesSoFar((byte) 4);
		System.out.println(mcudto.toString());
		System.out.print("\n" + "Movies in Phase1 : ");
		mcudto.phase1();
		System.out.print("\n" + "Movies in Phase2 : ");
		mcudto.phase2();
		System.out.print("\n" + "Movies in Phase3 : ");
		mcudto.phase3();
		System.out.print("\n" + "Movies in Phase4 : ");
		mcudto.phase4();
		System.out.print("\n" + "Upcoming Movies in Phase4 : ");
		mcudto.phase4("");
		System.out.println("\n" + mcudto.equals(mcudto));
		System.out.println("\n" + mcudto.hashCode());
	}

}
