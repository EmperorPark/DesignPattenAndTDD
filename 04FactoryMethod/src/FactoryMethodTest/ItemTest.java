package FactoryMethodTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ItemTest {
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
	
	@Test
	void HPPotiontest() {
		framework.Item item = new concreate.HpPotion();
		item.use();
		assertEquals("HP recovery\r\n", outContent.toString());
	}
	
	@Test
	void MPPotiontest() {
		framework.Item item = new concreate.MpPotion();
		item.use();
		assertEquals("MP recovery\r\n", outContent.toString());
	}
	
	@Test
	void HPPotionCreatetest() {

		framework.ItemCreator creator = new concreate.HpCreator();
		framework.Item item = creator.create();
		assertEquals("Get HP Potion info from database.\r\nInsert HP Potion getting info to database. " + new Date().toString() + "\r\n", outContent.toString());
		outContent.reset();
		
		item.use();
		assertEquals("HP recovery\r\n", outContent.toString());
	}
	
	@Test
	void MPPotionCreatetest() {

		framework.ItemCreator creator = new concreate.MpCreator();
		framework.Item item = creator.create();
		assertEquals("Get MP Potion info from database.\r\nInsert MP Potion getting info to database. " + new Date().toString() + "\r\n", outContent.toString());
		outContent.reset();
		
		item.use();
		assertEquals("MP recovery\r\n", outContent.toString());
	}

}
