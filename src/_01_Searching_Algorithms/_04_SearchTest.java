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
		String valuess="what";
		assertEquals(-1, _00_LinearSearch.linearSearch(stringsss, valuess));
	}
	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int [] int1= {1, 2, 3, 4, 5, 6};
		int value1=4;
		assertEquals(3, _01_BinarySearch.binarySearch(int1, 0, 5, value1));
		int [] int2= {1, 2, 3, 4, 5, 6};
		int value2=6;
		assertEquals(5, _01_BinarySearch.binarySearch(int2, 0, 5, value2));
		int [] int3= {2, 3, 6, 7, 15, 26};
		int value3=15;
		assertEquals(4, _01_BinarySearch.binarySearch(int3, 0, 5, value3));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int [] int1= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int value1=8;
		assertEquals(7, _02_InterpolationSearch.interpolationSearch(int1, value1));
		int [] int2= {6, 10, 14, 18, 22, 26, 30, 34, 38, 42};
		int value2=18;
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(int2, value2));
		int [] int3= {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
		int value3=29;
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(int3, value3));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int [] int1= {1, 2, 3, 4, 5, 6, 7, 99, 100};
		int value1=99;
		assertEquals(7, _03_ExponentialSearch.exponentialSearch(int1, value1));
		int [] int2= {3, 6, 7, 9, 13, 17, 21, 54, 62, 999999999};
		int value2=21;
		assertEquals(6, _03_ExponentialSearch.exponentialSearch(int2, value2));
		int [] int3= {112, 224, 356, 467, 589, 601, 745, 9967, 10090};
		int value3=10090;
		assertEquals(8, _03_ExponentialSearch.exponentialSearch(int3, value3));
	}
}
