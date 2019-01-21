package testAdpter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import AdapterPattern.Math;
import AdapterPattern.Adapter;
import AdapterPattern.AdapterImplement;

/**
 * Math Test Case
 * @author user
 *
 */
class MathTest {

	/**
	 * Basic Math Test
	 */
	@Test
	void BasicMathtest() {
		Math math = new Math();
		
		assertEquals(-8E-1, math.twoTime(-0.4));
		assertEquals(600, math.twoTime(30E+1));
		assertEquals(0E+2000, math.twoTime(0.0));
		
		assertEquals(-2E-1, math.half(-0.4));
		assertEquals(150, math.half(30E+1));
		assertEquals(0.0, math.twoTime(0E+2000));
		
		
		assertEquals(2.0, math.doubled(1.0).doubleValue());
	}
	
	/**
	 * Adapter Math Test
	 */
	@Test
	void AdapterMathTest() {
		
		Adapter adapter = new AdapterImplement();
		
		//float Object compare double Object => is not equal
		assertNotEquals(-8E-1, adapter.twiceOf(-0.4f));
		assertNotEquals(0.8, adapter.twiceOf(0.4f));
		
		//float Object compare double Object with delta => is equal
		//ignore differences smaller than delta
		assertEquals(-8E-1, adapter.twiceOf(-0.4f), 0.000001);
		assertEquals(0.8, adapter.twiceOf(0.4f), 0.0000001);
		
		//float Object compare double Object => is not equal
		assertNotEquals(-2E-1, adapter.halfOf(-0.4f));
		assertNotEquals(0.2, adapter.halfOf(-0.4f));
		
	}

}
