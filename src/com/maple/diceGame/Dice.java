package com.maple.diceGame;
import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;


public class Dice {
	
	int randomValue;
	private int sum;
	Random random = new Random();
	
	public Dice(){
		
		sum=0;
	}
	
	public int dice() {
		
		randomValue = random.nextInt(6)+1;
		return randomValue;
	}
	
	public void addScore(int score){
		sum = sum+score;	
	}
	
	public int nomalMode(){
		
		addScore(dice());
		
		return outSum();
	}
	
	public int outSum(){
		return sum;
	}
	
	@Test
	public void testDice() {
		
		int result = randomValue;
		assertTrue(result>=0);
	}
}	

