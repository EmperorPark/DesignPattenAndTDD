package StrategyPattern;

public class Main {
	public static void main(String[] args) {
//		Ainterface ainterface = new AinterfaceImplements();
//		
//		//���
//		ainterface.funcA();
		
		//��������Ʈ�� �ۼ��� �Լ� ȣ��
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
