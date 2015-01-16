package com.maple.diceGame;

public class Player {
	
	private String name;
	private Dice dice; //Dice 타입의 변수 dice를 선언(생성은 하지 않았다.)
	
	public Player(Dice dice){ //생성자 - GameMain에서 Dice 클래스의 객체를 생성했고 생성된 dice객체를 Player클래스 에서도 사용한다. 한번 생성된 dice객체를 여러 클래스에서
		//공유 하여 사용한다. 굳이 GameMain에서 Dice 객체를 만들었는데 또 Player클래스에서도 만들 필요는 없다. 불필요한 반복을 줄여주기 위해 사용할 수 있다.
		this.dice=dice; //GameMain에서 생성한 Dice클래스의 객체인 dice와 Player에서 Dice 타입의 변수로 선언한 dice가 같다고 둔다.(결국 한 객체를 공유한다는 의미)(위임)
	}
	
	public void playerGame() {

		dice.nomalMode();
	}
	
	public void getName(String name){ //이름을 입력받는 메소드
		this.name=name;
	}
	
	public String outName(){ //이름을 출력하는 메소드
		return name;
	}
}
