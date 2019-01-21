package StrategyPattern;

public class AObj {
	
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImplements();
	}
	
	public void funcAA() {
		
		//위임(델리게이트)
		ainterface.funcA();
		ainterface.funcA();
//		System.out.println("AAA");
//		System.out.println("AAA");
		
	}
}
