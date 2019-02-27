/**
 * Insertion Sort
 */
package edu.uncc.alg.assign1.sort;

/**
 * @author venky
 *
 */
public class InsertionSort {

	/**
	 * Method for insertion sort
	 * 
	 * @param numbers
	 * @param size
	 */
	public static void insertionSort(int[] numbers, int size) {
		for (int i = 1; i < size; i++) {
			int j = i;
			while (j > 0 && numbers[j] < numbers[j - 1]) {
				// swap the numbers
				int temp = numbers[j];
				numbers[j] = numbers[j - 1];
				numbers[j - 1] = temp;
				j--;
			}
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// define a test array
		int numbers[] = { 2, 1, 6, 3, 5, 4, 7 };
		int size = numbers.length;

		System.out.println("Unsorted Array");
		for (int i : numbers) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println("\n");

		// make a call to selectionSort
		insertionSort(numbers, size);

		// print the sorted array
		System.out.println("Sorted Array - Insertion Sort");
		for (int i : numbers) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
		

	}
	



}
