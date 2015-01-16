package com.maple.diceGame;

public class Recorder {
	
	public void nomalRecorder(String name,int sum) {
		
		System.out.print(name+":"+sum+" ");

	}
	
	public void FraudRecorder(String name,String level,int sum) {
		
		System.out.print(name+level+":"+sum+" ");

	}

}
