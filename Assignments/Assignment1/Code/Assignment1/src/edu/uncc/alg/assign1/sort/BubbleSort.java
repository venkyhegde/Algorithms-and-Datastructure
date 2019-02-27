/**
 * 
 */
package edu.uncc.alg.assign1.sort;

/**
 * @author venky
 *
 */
public class BubbleSort {

	/**
	 * Method which implemets the bubble sort algorithm (Code for this method is
	 * taken from the resource provided by the Professor.)
	 * 
	 * @param numbers
	 *            - array of integers
	 * @param size
	 *            - size of input array
	 */
	public static void bubbleSort(int[] numbers, int size) {
		int i = 0, k = 0, temp = 0;
		int is_sorted = 1;
		for (k = 0; k < size - 1; k++) {// n
			is_sorted = 1;
			for (i = 0; i < size - k - 1; i++) {// best case loop will run for n-1 times best case complexity is n
				// worst case (descending order) the loop will run for
				if (numbers[i] > numbers[i + 1]) {// (n-1)+(n-2)+(n-3)...3+2+1 times = (n^2)/2-n/2 times
					temp = numbers[i]; // worst case time complexity is n^2
					numbers[i] = numbers[i + 1]; // avg case=(best case + worst case)/2
					numbers[i + 1] = temp; // (n^2+n)/2=n^2
					is_sorted = 0; // avg case time complexity is n^2
				}
			}
			if (is_sorted == 1) {
				break;
			}
		}

	}

	/**
	 * Main method to run the bubble sort
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		bubbleSort(numbers, size);

		// print the sorted array
		System.out.println("Sorted Array - Bubble Sort");
		for (int i : numbers) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();

	}

}
