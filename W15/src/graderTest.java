import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;
class graderTest {

	@Test
	void fiftyNineshouldGiveF() {
		var grade = new Grader();
		char result = grade.determineLetterGrade(59);
		assertEquals('F',result);
	}
	
	@Test
	void sixtyNineShouldGiveD() {
		var grade = new Grader();
		char result = grade.determineLetterGrade(69);
		assertEquals('D',result);
	}
	
	//Test 70, 80, 90, 91

	
	@Test
	void seventyShouldGiveC() {
		var grade = new Grader();
		char result = grade.determineLetterGrade(70);
		assertEquals('C',result);
	}
	
	@Test
	void eightyShouldGiveB() {
		var grade = new Grader();
		char result = grade.determineLetterGrade(80);
		assertEquals('B',result);
	}
	
	@Test
	void ninetyOneShouldGiveA() {
		var grade = new Grader();
		char result = grade.determineLetterGrade(90);
		assertEquals('A',result);
	}
	
	@Test //for unit test with exception thrown -> use assert throw
	void negativeOneShouldReturnIllegalArgumentException()
	{
		var grader = new Grader();
		assertThrows(IllegalArgumentException.class,
				() -> {
					grader.determineLetterGrade(-1); //using lamda
				});
				
	}
	
	

}
