import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void testTwoPlusTwoShouldEqualFour() {
		SimpleCalculator cal = new SimpleCalculator();
		var cal2 = new SimpleCalculator();
		int result = cal.add(2, 2);
		
		int expected = 4;
		
		
		//for 1 unit, there are different asserts statements, doing different things
		assertEquals(4, result, "SimpleCalculater.add(2,2) test failed");
		
		 
		
	}
	@Test
	void test3Plus5ShouldEqual8() {
		var cal = new SimpleCalculator();
		int result = cal.add(3, 5);
		
		int expected = 8;
		
		assertEquals(2,result);
	}

}
