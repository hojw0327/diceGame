package com.maple.diceGame;

import java.util.Scanner;

public class Judge {
	
	int number;
	
	private Dice dice;
	private FraudDice fraudDice;
	
	public Judge(Dice dice,FraudDice fraudDice) {
		this.dice=dice;
		this.fraudDice=fraudDice;
	}

	
	public void gameProgress() {
		
		System.out.print("주사위를 몇번 던질것인지 입력하세요:");
		Scanner stdin = new Scanner(System.in);
		number = stdin.nextInt();

	}
	
	public int fraudPlayerFlag(){
		
		int flag=0;
		
		if(dice.outSum()>fraudDice.outSum()){
			flag=1;
		}
		else if(fraudDice.outSum()>=(dice.outSum())+6){
			flag=2;
		}
		else{
			flag=0;
		}
		return flag;
	}
	
	public void judge(String playerName, String fraudPlayerName) {
		
		System.out.print("승자는 ");
		
		if(dice.outSum()>fraudDice.outSum()){
			System.out.print(playerName);
		}
		else if(fraudDice.outSum()>=dice.outSum()){
			System.out.print(fraudPlayerName);
		}
		System.out.println();
	}
}
