package stringManipulation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PermutationWithListTest {

	@Test
	void CorrectStringTest() {
		LinkedList<String> list = (LinkedList<String>) PermutationWithList.permute("ABC");
		List<String> listCorrect = Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");

		assertTrue(list.equals(listCorrect));
	}
	
	@Test
	void EmptyStringTest() {
		LinkedList<String> list = (LinkedList<String>) PermutationWithList.permute("");
		List<String> listCorrect = Arrays.asList("");

		assertTrue(list.equals(listCorrect));
	}
	
	@Test
	void SameCharTest() {
		LinkedList<String> list = (LinkedList<String>) PermutationWithList.permute("AA");
		List<String> listCorrect = Arrays.asList("AA", "AA");

		assertTrue(list.equals(listCorrect));
	}
	
	@Test
	void SingleCharTest() {
		LinkedList<String> list = (LinkedList<String>) PermutationWithList.permute("A");
		List<String> listCorrect = Arrays.asList("A");

		assertTrue(list.equals(listCorrect));
	}
}
