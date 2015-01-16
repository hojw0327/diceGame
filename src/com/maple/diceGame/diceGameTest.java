package com.maple.diceGame;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class diceGameTest {
	
	@Test
	
	public void testDice_STRONG_모드() throws Exception {
		
		int flag;
		Dice dice = new Dice();
		FraudDice fraudDice = new FraudDice();
		
		FraudPlayer fraudPlayer = new FraudPlayer(fraudDice);
		
		SetLevel setLevel = mock(SetLevel.class);
		fraudPlayer.level(setLevel);
		
		when(setLevel.setLevel(1)).thenReturn(1, flag);
		String result = fraudPlayer.playerGame(1);
		
		assertEquals("[STRONG]",result);
	}
	
	@Test
	
	public void testDice_WEAK_모드() throws Exception {
		
		int flag;
		Dice dice = new Dice();
		FraudDice fraudDice = new FraudDice();
		
		FraudPlayer fraudPlayer = new FraudPlayer(fraudDice);
		
		SetLevel setLevel = mock(SetLevel.class);
		fraudPlayer.level(setLevel);
		
		when(setLevel.setLevel(2)).thenReturn(2, flag);
		String result = fraudPlayer.playerGame(2);
		
		assertEquals("[WEAK]",result);
	}
	
	@Test
	
	public void testDice_NORMAL_모드() throws Exception {
		
		int flag;
		Dice dice = new Dice();
		FraudDice fraudDice = new FraudDice();
		
		FraudPlayer fraudPlayer = new FraudPlayer(fraudDice);
		
		SetLevel setLevel = mock(SetLevel.class);
		fraudPlayer.level(setLevel);
		
		when(setLevel.setLevel(0)).thenReturn(0, flag);
		String result = fraudPlayer.playerGame(0);
		
		assertEquals("[NORMAL]",result);
	}

}
