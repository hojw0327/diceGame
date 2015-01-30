package com.maple.dicegame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fraudPlayer")

public class FraudPlayer{
	
	@Autowired
	FraudDice fraudDice;
	
	String level;
	private String name;
	
	public FraudPlayer(FraudDice fraudDice) { //FraudDice가 Dice를 상속받기 때문에 FraudDice의 fraudDice객체만 있어도 Dice의 dice객체 공유 가능
		//FraudPlayer가 일반 Dice의 주사위를 가질 수 있다는 것. 일반 Player가 가진 주사위를 갖는다는것과는 다르다.
		this.fraudDice=fraudDice;
	}
	

	public void playerGame(int flag) { 
		
		if(flag==1){
			level = "[STRONG]";
			fraudDice.strongnessMode();
		}
		else if(flag==2){
			level = "[WEAK]";
			fraudDice.weaknessMode();

		}
		else {
			level = "[NORMAL]";
			fraudDice.nomalMode();//fraudDice객체는 Dice클래스 상속 받기 때문에 Dice클래스의 메소드 호출 가능
		}
		
		System.out.println();

	}
	
	public void getName(String name){ //이름을 입력받는 메소드
		this.name=name;
	}
	
	public String outName(){ //이름을 출력하는 메소드
		return name;
	}

}

