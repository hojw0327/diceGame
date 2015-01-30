package com.maple.dicegame;
import java.io.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameMain {
	public static void main (String args[]) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		Dice dice = (Dice)context.getBean("dice");
		FraudDice fraudDice = (FraudDice)context.getBean("fraudDice");
		Player player = (Player)context.getBean("player");
		FraudPlayer fraudPlayer = (FraudPlayer)context.getBean("fraudPlayer");
		Judge judge = (Judge)context.getBean("judge");
		Recorder recorder = (Recorder)context.getBean("recorder");

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