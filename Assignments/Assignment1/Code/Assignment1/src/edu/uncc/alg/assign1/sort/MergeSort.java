/**
 * Merge Sort
 */
package edu.uncc.alg.assign1.sort;

/**
 * @author venky
 *	
 */
public class MergeSort {
	
	/**
	 * (Code for this method is taken from the resource provided by the Professor.)
	 * Merge method
	 * @param numbers
	 * @param i
	 * @param j
	 * @param k
	 */
	   public static void merge(int numbers [], int i, int j, int k) {
		      int mergedSize = k - i + 1;       // Size of merged partition
		      int mergedNumbers [] = new int[mergedSize]; // Temporary array for merged numbers
		      int mergePos;                     // Position to insert merged number
		      int leftPos;                      // Position of elements in left partition
		      int rightPos;                     // Position of elements in right partition

		      mergePos = 0;
		      leftPos = i;                      // Initialize left partition position
		      rightPos = j + 1;                 // Initialize right partition position

		      // Add smallest element from left or right partition to merged numbers
		      while (leftPos <= j && rightPos <= k) {
		         if (numbers[leftPos] < numbers[rightPos]) {
		            mergedNumbers[mergePos] = numbers[leftPos];
		            ++leftPos;
		         } 
		         else {
		            mergedNumbers[mergePos] = numbers[rightPos];
		            ++rightPos;
		         }
		         ++mergePos;
		      }

		      // If left partition is not empty, add remaining elements to merged numbers
		      while (leftPos <= j) {
		         mergedNumbers[mergePos] = numbers[leftPos];
		         ++leftPos;
		         ++mergePos;
		      }

		      // If right partition is not empty, add remaining elements to merged numbers
		      while (rightPos <= k) {
		         mergedNumbers[mergePos] = numbers[rightPos];
		         ++rightPos;
		         ++mergePos;
		      }

		      // Copy merge number back to numbers
		      for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
		         numbers[i + mergePos] = mergedNumbers[mergePos];
		      }
		   }
	   
	   	/**
	   	 * (Code for this method is taken from the resource provided by the Professor.)
	   	 * Sort method
	   	 * @param numbers
	   	 * @param i
	   	 * @param k
	   	 */
		   public static void sort(int numbers [], int i, int k) {
		      int j;

		      if (i < k) {
		         j = (i + k) / 2;  // Find the midpoint in the partition

		         // Recursively sort left and right partitions
		         sort(numbers, i, j);
		         sort(numbers, j + 1, k);

		         // Merge left and right partition in sorted order
		         merge(numbers, i, j, k);
		      }
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
		sort(numbers, 0, size - 1);
		
		// print the sorted array
		System.out.println("Sorted Array - Merge Sort");
		for (int i : numbers) {
			System.out.print(i);
			System.out.print("\t");
		}
		System.out.println();

	}

}
