package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
static boolean intArraySorted(int [] array) {
	int arrlength=array.length;
	int lastNumber=0;
	boolean ascendingOrder=false;
	for(int i=0; i<arrlength; i++) {
		if(array[i]>=lastNumber) {
			lastNumber=array[i];
			ascendingOrder=true;
		}
		else {
			ascendingOrder=false;
			break;
		}
	}
	return ascendingOrder;
}
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static boolean doubleArraySorted(double[] array) {
	boolean ascendingOrder=false;
	double lastNumber=0;
	int arrLength=array.length;
	for(int i=0; i<arrLength; i++) {
		if(array[i]>=lastNumber) {
			lastNumber=array[i];
			ascendingOrder=true;
		}
		else {
			ascendingOrder=false;
			break;
		}
	}
	return ascendingOrder;
}
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
static boolean charArraySorted(char[] array) {
	boolean alphabeticalOrder=false;
	int arrLength=array.length;
	for(int i=1; i<arrLength; i++) {
		if((""+array[i]).compareTo(""+array[i-1])>-1) {
			alphabeticalOrder=true;	
		}
		else {
			alphabeticalOrder=false;
			break;
		}
	}
	return alphabeticalOrder;
}	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
static boolean stringArraySorted(String[] array) {
	boolean alphabeticalOrder=false;
	int arrLength=array.length;
	for(int i=1; i<arrLength; i++) {
		if((""+array[i]).compareTo(""+array[i-1])>-1) {
			alphabeticalOrder=true;	
		}
		else {
			alphabeticalOrder=false;
			break;
		}
	}
	return alphabeticalOrder;
}	
}
