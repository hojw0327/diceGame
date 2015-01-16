package com.maple.diceGame;

import java.util.Scanner;

public class GameMain {
	public static void main (String args[]) {
		
		Dice dice = new Dice();
		FraudDice fraudDice = new FraudDice();//FraudDice가 Dice를 상속받아서 Dice클래스의 메소드를 이용한다 해도  Dice클래스의 객체와 FraudDice의 객체는 서로 다르므로 각 객체의 메소드호출도 개별적인 것.
		Player player = new Player(dice);//생성된 Dice클래스의 dice객체를 Player클래스에 전달한다.(공유하기 위하여)
		FraudPlayer fraudPlayer = new FraudPlayer(fraudDice);//생성된 Dice클래스의 dice객체와 FraudDice클래스의 fraudDice 객체를 FruadPlayer클래스에 전달한다.(공유하기 위하여)
		Judge judge = new Judge(dice,fraudDice);
		Recorder recorder = new Recorder();
		Scanner scan = new Scanner(System.in);

		System.out.print("플레이어의 이름을 입력하세요:");
		String name = scan.nextLine();
		player.getName(name);//입력한 이름을 Player클래스의 getName메소드로 전달
		
		System.out.print("사기플레이어의 이름을 입력하세요:");
		name = scan.nextLine();
		fraudPlayer.getName(name);
	
		judge.gameProgress();
		
		for(int i=0;i<judge.number;i++) {

				fraudPlayer.playerGame(judge.fraudPlayerFlag());
				player.playerGame();
				recorder.FraudRecorder(fraudPlayer.outName(),fraudPlayer.level,fraudDice.outSum());
				recorder.nomalRecorder(player.outName(),dice.outSum());	
			}

		System.out.println();
		judge.judge(player.outName(),fraudPlayer.outName());

	}

}
