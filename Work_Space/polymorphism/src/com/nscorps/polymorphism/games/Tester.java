package com.nscorps.polymorphism.games;

public class Tester {
	public static void main(String[] args) {
		Games games = new Games();
		games.earningMoney();
		games.getEntertain();

		IndoorGames indoorGames = new IndoorGames();
		indoorGames.earningMoney();
		indoorGames.chess();
		indoorGames.chess((byte) 2);

		OutDoorGames outDoorGames = new OutDoorGames();
		outDoorGames.earningMoney();
		outDoorGames.kabbadi();
		outDoorGames.kabbadi((byte)7);
	}
}
