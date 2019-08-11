package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
			int saved;
			for(int i=0; i<array.length-1; i++) {
				for(int k=array.length-1; k>0; k--) {
					if(array[k-1]>array[k]) {
						saved=array[k-1];
						array[k-1]=array[k];
						array[k]=saved;
						//put display here for slow
				}
			}
		}
			display.updateDisplay();
	}
}
