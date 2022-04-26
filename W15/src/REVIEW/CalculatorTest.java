package REVIEW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator obj = new Calculator();
		int a = 2;
		int b = 2;
		int result = obj.add(a,b);
		int expected = 4;
		assertEquals(expected,result);
	}

}
