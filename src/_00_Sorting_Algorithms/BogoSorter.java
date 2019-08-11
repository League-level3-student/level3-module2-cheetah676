package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	// if(inOrder=true) {
	// System.out.println("Finished");
//}
	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean inOrder = false;
		Random ran = new Random();
		int first;
		int second;
		while (inOrder == false) {
			for (int i = 1; i < array.length; i++) {
				if (array[i] > array[i - 1]) {
					if (i == array.length - 1) {
						System.out.println("Finished");
						inOrder = true;
					}
				} else {
					inOrder = false;
					break;
				}
			}
			first = ran.nextInt(array.length + 3000);
			second = ran.nextInt(array.length + 3000);
			if (first >= array.length) {
				first = 0;
			}
			if (second >= array.length) {
				second = array.length - 1;
			}
			int save = array[first];
			array[first] = array[second];
			array[second] = save;
			display.updateDisplay();
		}
	}
}
