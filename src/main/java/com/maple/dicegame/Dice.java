package com.maple.dicegame;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;
import org.springframework.stereotype.Service;

@Service("dice")

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

}	


