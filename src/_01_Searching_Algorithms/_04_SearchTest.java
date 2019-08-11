package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String [] strings={"cow", "moo", "what"};
		String value="what";
		assertEquals(2, _00_LinearSearch.linearSearch(strings, value));
		String [] stringss={"moose", "bayleef", "yeet"};
		String values="bayleef";
		assertEquals(1, _00_LinearSearch.linearSearch(stringss, values));
		String [] stringsss={"who", "where", "when"};
		String valuess="who";
		assertEquals(0, _00_LinearSearch.linearSearch(stringsss, valuess));
	}
	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
