package stringManipulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CompressStringTest {

	@Test
	void StringEmptyTest() {
		assertEquals("", CompressString.compress(""));
	}
	
	@Test
	void StringTooShort1Test() {
		assertEquals("xx", CompressString.compress("xx"));
	}
	
	@Test
	void StringTooShort2Test() {
		assertEquals("xy", CompressString.compress("xy"));
	}
	
	@Test
	void StringCorrectTest() {
		assertEquals("2x2y2d4s", CompressString.compress("xxyyddssss"));
	}	
}
