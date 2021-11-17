package edu.augustana.csc305.labs;

import static edu.augustana.csc305.labs.NumberUtils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class NumberUtilsTest {

	@Test
	void testSmallestFirst() {
		assertEquals(3, maxOfThree(1,2,3));
		assertEquals(3, maxOfThree(1,3,2));
	}
	
	@Test
	void testMiddleNumFirst() {
		assertEquals(3, maxOfThree(2,1,3));
		assertEquals(3, maxOfThree(2,3,1));
	}
	
	@Test
	void testLargestNumFirst() {
		assertEquals(3, maxOfThree(3,1,2));
		assertEquals(3, maxOfThree(3,2,1));
	}	

	@Test
	void testNegatives() {
		assertEquals(-12, maxOfThree(-300,-12,-75));
	}
	@Test
	void testingNegativesAndPositives() {
		assertEquals(75, maxOfThree(-30,-12,75));
		assertEquals(999, maxOfThree(999,-12,-56));
	}
	
	@Test
	void testZeros() {
		assertEquals(12, maxOfThree(0,12,0));
		assertEquals(0, maxOfThree(-2, -55 ,0));
	}
	
	@Test
	void testOperator() {
		assertEquals(12, maxOfThree(0+11,12,3*3));
	}
	

}
