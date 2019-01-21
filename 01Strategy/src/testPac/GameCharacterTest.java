package testPac;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import StrategyPattern.Axe;
import StrategyPattern.GameCharacter;
import StrategyPattern.Knife;
import StrategyPattern.Sword;
import StrategyPattern.Weapon;

/**
 * GameCharacter Unit Test Class
 * 
 * @author woghkd0179
 *
 */
class GameCharacterTest {

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
	 * 
	 * TestName : GameCharacterAttack
	 * 
	 * @see GameCharacter
	 * @see Weapon
	 * @see Knife
	 * @see Sword
	 * @see Axe
	 */
	@Test
	void GameCharacterAttacktest() {
		GameCharacter character = new GameCharacter();
		character.attack();
		assertEquals("맨손 공격\r\n", outContent.toString());
		
		outContent.reset();
		
		character.setWeapon(new Knife());
		character.attack();
		
		assertEquals("칼 공격\r\n", outContent.toString());
		
		outContent.reset();
		
		character.setWeapon(new Sword());
		character.attack();
		
		assertEquals("검 공격\r\n", outContent.toString());
		
		outContent.reset();
		
		character.setWeapon(new Axe());
		character.attack();
		
		assertEquals("도끼 공격\r\n", outContent.toString());
		
	}

}
