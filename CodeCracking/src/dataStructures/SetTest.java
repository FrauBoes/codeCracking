package dataStructures;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SetTest {

	Set s = new Set();
	
	// Test cases for empty and non-empty sets
	@Test
	void testEmptySet() {
		assertTrue(s.isEmpty());
		assertTrue(s.size == 0);
		assertFalse(s.contains(1));
		
		s.remove(1);
		assertTrue(s.isEmpty());
		assertTrue(s.size == 0);	
	}
	
	@Test
	void testNonEmptySetOneElement() {
		s.add(1);
		assertTrue(!s.isEmpty());
		assertTrue(s.size == 1);
		assertTrue(s.contains(1));
		assertFalse(s.contains(2));
		
		s.remove(1);
		assertTrue(s.isEmpty());
		assertTrue(s.size == 0);
		assertFalse(s.contains(1));
		
		s.remove(1);
		assertTrue(s.isEmpty());
		assertTrue(s.size == 0);
		
		s.add(1);
		s.add(1);
		assertTrue(s.size == 1);
		s.contains(1);
	}
	
	@Test
	void testNonEmptySetPlusTwoElements() {
		s.add(1);
		s.add(2);
		assertTrue(!s.isEmpty());
		assertTrue(s.size == 2);
		assertTrue(s.contains(1));
		assertTrue(s.contains(2));
		assertFalse(s.contains(3));
		
		s.remove(1);
		assertTrue(!s.isEmpty());
		assertTrue(s.size == 1);
		assertFalse(s.contains(1));
		assertTrue(s.contains(2));
		
		s.add(1);
		s.add(2);
		assertTrue(s.size == 2);
		s.contains(1);
		s.contains(2);
	}
	
	@Test
	void testSetSizeAdapts() {
		int oldSize = s.size;
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.add(11);
		assertTrue(s.size != oldSize);
		s.add(12);
	}
		
	// Method test cases
	@Test
	void testIsEmpty() {
		assertTrue(s.isEmpty());
	}
	
	@Test
	void testSize() {
		assertTrue(s.size == 0);
	}
	
	@Test
	void testAdd() {
		s.add(5);
		assertTrue(!s.isEmpty());
	}
	
	@Test
	void testContains() {
		s.add(1);
		assertTrue(s.contains(1));
		assertFalse(s.contains(2));
	}
	
	@Test
	void testRemove() {
		s.add(1);
		s.remove(1);
	}
	
//	@Test
//	void testElements() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void testClear() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void testUnion() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void testIntersection() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void testSubtraction() {
//		fail("Not yet implemented");
//	}
}

