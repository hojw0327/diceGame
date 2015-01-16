package com.maple.diceGame;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class FraudDice extends Dice{

	
	public int weaknessMode() {
		
		int randomValue=0;
		
		do{
			randomValue = dice();
		}while(randomValue>=5);
		
		addScore(randomValue);//랜덤으로 나온 수를 Dice클래스의 addScore메소드에 전달해서 메소드 실행
		return outSum(); 
	}
	
	public int strongnessMode() {
		
		int randomValue=0;

		do{
			randomValue = dice();
		}while(randomValue<=2);
		
		addScore(randomValue);
		return outSum();
	}
	
	@Test
	public void testFraudDice() {		
		int result = randomValue;
		assertTrue(result>=0);
	}
	
}


