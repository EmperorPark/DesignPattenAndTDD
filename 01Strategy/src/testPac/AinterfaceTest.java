package testPac;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import StrategyPattern.AObj;
import StrategyPattern.Ainterface;
import StrategyPattern.AinterfaceImplements;


/**
 * Ainterface Unit Test Class
 * 
 * @author woghkd0179
 *
 */
class AinterfaceTest {
	

//	 std output control obj 
//	 list : 
//	 outContent, 
//	 errContent, 
//	 originalOut, 
//	 originalErr

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	/**
	 * push std output to stream object
	 */
	@BeforeEach
	private void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	/**
	 * push std output to original System
	 */
	@AfterEach
	private void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}
	
	/**
	 * TestCase1
	 * TestClass : Ainterface
	 * TestMethod : FuncA();
	 * @see Ainterface
	 * @see AinterfaceImplements
	 * 
	 */
	@Test
	void AinterfaceFunc() {
		Ainterface ainterface = new AinterfaceImplements();
		ainterface.funcA();
	    assertEquals("AAA\r\n", outContent.toString());
	}
	
	/**
	 * TestCase1
	 * TestClass : AObj
	 * TestMethod : FuncAA();
	 * @see AObj
	 * @see Ainterface
	 * @see AinterfaceImplements
	 * 
	 */
	@Test
	void AObjFunc() {
		AObj aObj = new AObj();
		aObj.funcAA();
	    assertEquals("AAA\r\nAAA\r\n", outContent.toString());
	}


}
