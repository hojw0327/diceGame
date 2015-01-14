package com.maple.diceGame;

import java.util.Scanner;

public class GameMain {
	public static void main (String args[]) {
		
		Player player = new Player();
		FraudPlayer fraudPlayer = new FraudPlayer();
		Dice dice = new Dice();
		FraudDice fraudDice = new FraudDice();
		Judge judge = new Judge();
		Recorder recorder = new Recorder();
		Scanner scan = new Scanner(System.in);
		
		//System.out.println(dice.dice());
		
		
		System.out.print("플레이어의 이름을 입력하세요:");
		player.name = scan.nextLine();
		
		System.out.print("사기플레이어의 이름을 입력하세요:");
		fraudPlayer.name = scan.nextLine();
		judge.judge();
		
		for(int i=0;i<judge.number;i++) {
			if(i==0) {
				dice.dice();
				fraudDice.nomalMode();
				recorder.FraudRecorder();
				recorder.nomalRecorder();
				
			}
			else {
				fraudPlayer.playerGame();
				player.playerGame();
				recorder.FraudRecorder();
				recorder.nomalRecorder();
			}
		}

		System.out.println();
		judge.winner();

	}

}
