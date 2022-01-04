package com.nscorps.polymorphism.games;

public class OutDoorGames extends Games {

	@Override
	void earningMoney() {
		System.out.println("\n"+"Players earn More money with Outdoor games");
	}
	void kabbadi() {
		System.out.println("\n"+"Most Of indoor games are Muscle Games like Kabbadi");
	}
	void kabbadi(byte players) {
		System.out.println("\n"+"Kabbadi will play between "+ players +" Players");
	}
	
}
