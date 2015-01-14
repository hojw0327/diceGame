package com.maple.diceGame;

public class FraudPlayer {
	
	static String name;
	static int flag = 0;
	
	public void playerGame() {
		
		Dice dice = new Dice();
		FraudDice fraudDice = new FraudDice();
		
		if(dice.sum>fraudDice.sum){
			flag  = 1;
			fraudDice.strongnessMode();
		}
		else if(fraudDice.sum>=(dice.sum)+6){
			flag = 2;
			fraudDice.weaknessMode();

		}
		else {
			flag = 0;
			fraudDice.nomalMode();
		}
		
		System.out.println();
	}

}
