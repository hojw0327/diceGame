package com.maple.diceGame;
import java.util.Random;


public class Dice {
	
	static int sum = 0;
	
	public int dice() {

		Random random = new Random();
		int randomValue = random.nextInt(6)+1;
		sum = randomValue + sum;
		return sum;
	}
	
	


}
