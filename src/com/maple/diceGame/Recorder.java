package com.maple.diceGame;

public class Recorder {
	
	public void nomalRecorder() {
		
		Dice dice = new Dice();
		Player player = new Player();
		System.out.print(player.name+":"+dice.dice()+" ");

	}
	
	public void FraudRecorder() {
		
		
		FraudDice fraudDice = new FraudDice();
		FraudPlayer fraudPlayer = new FraudPlayer();
		if(fraudPlayer.flag==1){
			System.out.print(fraudPlayer.name+"[STRONG]"+":"+fraudDice.strongnessMode());
		}
		else if(fraudPlayer.flag==2){
			System.out.print(fraudPlayer.name+"[WEAK]"+":"+fraudDice.weaknessMode());
		}
		else {
			System.out.print(fraudPlayer.name+"[NORMAL]"+":"+fraudDice.dice());
		}

		
	}

}
