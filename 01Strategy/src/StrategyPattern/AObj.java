package StrategyPattern;

public class AObj {
	
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImplements();
	}
	
	public void funcAA() {
		
		//����(��������Ʈ)
		ainterface.funcA();
		ainterface.funcA();
//		System.out.println("AAA");
//		System.out.println("AAA");
		
	}
}
