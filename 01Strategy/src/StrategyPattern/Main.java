package StrategyPattern;

public class Main {
	public static void main(String[] args) {
//		Ainterface ainterface = new AinterfaceImplements();
//		
//		//통로
//		ainterface.funcA();
		
		//델리게이트로 작성된 함수 호출
//		AObj aobj = new AObj();
//		aobj.funcAA();
		
		GameCharacter character = new GameCharacter();
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Axe());
		character.attack();
		
	}
}
