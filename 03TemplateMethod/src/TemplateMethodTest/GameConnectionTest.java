package TemplateMethodTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import TemplateMethod.abstGameConnectHelper;
import TemplateMethod.DefaultGameConnectHelper;

/**
 * GameConnectionHeleperTest Class
 * @author woghkd0719
 *
 */
class GameConnectionTest {
	
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
	 * requestConnection Method result is typed by hard Coding
	 */
	@Test
	void GameConnectionHelperTest() {
		
		abstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		String encodestr = "encodestr";
		assertEquals("decodeStr", helper.requestConnection(encodestr));
		//assertEquals("decode\r\ncheck ID & PW\r\nAccount authorization query\r\nGame Manager\r\nLast connection sequence\r\n", outContent.toString());
		assertEquals("Enhanced decode Algorithm\r\ncheck ID & PW\r\nAccount authorization query\r\nauthorization : Game Manager\r\nLast connection sequence\r\n", outContent.toString());
		
	}

}
