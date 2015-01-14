package com.maple.diceGame;

import java.util.Scanner;

public class Judge {
	
	int number;
	
	public void judge() {
		
		
		System.out.print("주사위를 몇번 던질것인지 입력하세요:");
		Scanner stdin = new Scanner(System.in);
		number = stdin.nextInt();

	}
	
	public void winner() {
		
		Dice dice = new Dice();
		FraudDice fraudDice = new FraudDice();
		Player player = new Player();
		FraudPlayer fraudPlayer = new FraudPlayer();
		
		
		if(dice.sum>fraudDice.sum) {
			System.out.print("승자는"+player.name);
		}
		else {
			System.out.print("승자는"+" "+ fraudPlayer.name);

		}
	}
}
