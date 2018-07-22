package _00_Sorting_Algorithms;

import java.util.function.BooleanSupplier;

import javax.swing.plaf.FontUIResource;

public class _00_SortedArrayChecker {

	public static boolean intArraySorted(int[] unsorted) {
		boolean isSorted = false; 
		for (int i = 0; i < unsorted.length - 1; i++) {
			if (unsorted[i] <= unsorted[i+1]) {
				isSorted = true; 
			}
			else {
				isSorted = false;
				return isSorted; 
			}
		}
		// TODO Auto-generated method stub
		return isSorted;
	}
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	public static boolean doubleArraySorted(double[] unsorted) {
		boolean isSorted = false; 
		for (int i = 0; i < unsorted.length - 1; i++) {
			if (unsorted[i] <= unsorted[i+1]) {
				isSorted = true; 
			}
			else {
				isSorted = false;
				return isSorted; 
			}
		}
		
		return isSorted ;
	}

	public static boolean charArraySorted(char[] unsorted) {
		boolean isSorted = false; 
		for (int i = 0; i < unsorted.length - 1; i++) {
			if (unsorted[i] <= unsorted[i+1]) {
				isSorted = true; 
			}
			else {
				isSorted = false;
				return isSorted; 
			}
		}

		return isSorted;
	}

	public static boolean stringArraySorted(String[] unsorted) {
		// TODO Auto-generated method stub
		boolean isSorted = false; 
		for (int i = 0; i < unsorted.length - 1; i++) {
			if (unsorted[i].compareTo( unsorted[i+1]) <= 0) {
				isSorted = true; 
			}
			else {
				isSorted = false;
				return isSorted; 
			}
		}
		return isSorted;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)

}
