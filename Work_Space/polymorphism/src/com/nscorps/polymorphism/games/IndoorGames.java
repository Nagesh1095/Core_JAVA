package com.nscorps.polymorphism.games;

public class IndoorGames extends Games {

	@Override
	void earningMoney() {
		System.out.println("\n"+"Players earn Less money with indoor games");
	}
	
	void chess() {
		System.out.println("\n"+"Most Of indoor games are Mind Games like Chess");
	}
	void chess(byte players) {
		System.out.println("\n"+"Chess will play between "+ players +" Players");
	}
}
