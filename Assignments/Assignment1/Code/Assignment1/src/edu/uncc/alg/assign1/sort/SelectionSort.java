/**
 * Selection Sort
 */
package edu.uncc.alg.assign1.sort;

/**
 * @author venky
 *
 */
public class SelectionSort {
	
	/**
	 * Method to perform selection sort
	 * @param numbers - array of numbers
	 * @param size - size of the array
	 * 
	 */
	public static void seletionSort(int numbers[], int size) {
		
		for(int i=0; i< size; i++) {
			//assuming first index as smallest number index
			int indexSmall = i;
			for(int j = i+1; j< size; j++) {
				if(numbers[j] < numbers[indexSmall]) {
					indexSmall = j; // changing the index of smallest number
				}
			}
			
			//swap the numbers
			int temp = numbers[i];
			numbers[i] = numbers[indexSmall];
			numbers[indexSmall] = temp;
		}
		
//		return numbers;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//define a test array
		int numbers[] = {2,1,6,3,5,4,7};
		int size = numbers.length;
		
		System.out.println("Unsorted Array");
		for (int i : numbers) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println("\n");
		
		
		// make a call to selectionSort
		seletionSort(numbers, size);
		
		// print the sorted array
		System.out.println("Sorted Array - Selection Sort");
		for (int i : numbers) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();
	}

}
