package com.maple.diceGame;
import java.util.Random;

public class FraudDice extends Dice {
	
	static int sum = 0;
	int randomValue = 0;
	
	FraudPlayer fraudPlayer = new FraudPlayer();
	
	public void nomalMode() {
		
		dice();
		
	}
	
	public int weaknessMode() {
		
		Random random = new Random();
		randomValue = random.nextInt(6)+1;
		if(randomValue>=5) {
			randomValue = random.nextInt(6)+1;
		}
		
		sum = randomValue+sum;
		return sum;

	}
	
	public int strongnessMode() {
		
		Random random = new Random();
		randomValue = random.nextInt(6)+1;
		if(randomValue>2) {
			randomValue = random.nextInt(6)+1;
		}
		
		sum = randomValue+sum;

		return sum;
	}

}
