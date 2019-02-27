/**
 * 
 */
package edu.uncc.alg.assign1.test;

import java.util.Hashtable;

import edu.uncc.alg.assign1.sort.BubbleSort;
import edu.uncc.alg.assign1.sort.InsertionSort;
import edu.uncc.alg.assign1.sort.MergeSort;
import edu.uncc.alg.assign1.sort.SelectionSort;
import edu.uncc.alg.assign1.util.InputGenerator;

/**
 * @author venky
 *
 */
public class TestFramework {

	/**
	 * Method which runs the sort algorithms and records the run time for each
	 * algorithm.
	 * 
	 * @param numbers
	 *            - input array of integers
	 * @return - a hash table which contain runtime for each sort algorithm in
	 *         <name, runtime> format.
	 */
	private Hashtable<String, Long> testFramework(int[] numbers) {

		// define a hash table to store the time
		Hashtable<String, Long> performaceTable = new Hashtable<>();

		// get the length of array
		int size = numbers.length;

		// define a start time
		long startTime;
		long duration;
		int[] tempArray = new int[size];

		// 1. Selection Sort
		tempArray = numbers.clone();
		startTime = System.nanoTime();
		SelectionSort.seletionSort(tempArray, size);
		duration = System.nanoTime() - startTime;
		performaceTable.put("selection", duration);

		// 2. Insertion Sort
		tempArray = numbers.clone();
		startTime = System.nanoTime();
		InsertionSort.insertionSort(tempArray, size);
		duration = System.nanoTime() - startTime;
		performaceTable.put("insertion", duration);

		// 3. Merge sort
		tempArray = numbers.clone();
		startTime = System.nanoTime();
		MergeSort.sort(tempArray, 0, size - 1);
		duration = System.nanoTime() - startTime;
		performaceTable.put("merge", duration);

		// 4. Bubble sort
		tempArray = numbers.clone();
		startTime = System.nanoTime();
		BubbleSort.bubbleSort(tempArray, size);
		duration = System.nanoTime() - startTime;
		performaceTable.put("bubble", duration);

		return performaceTable;

	}

	/**
	 * <p>
	 * A public method which runs the testFramework. This method gets the input
	 * array from getInput method of InputGenerator class.
	 * </p>
	 * 
	 * @param size
	 *            - <p>input size.
	 *            </p>
	 * @param testCase
	 *            -<p>
	 *            <ul>
	 *            <li>0 for Average case</li>
	 *            <li>1 for Best case</li>
	 *            <li>-1 for Worst Case</li>
	 *            </ul></p>
	 * @return <p> A hash table which contain runtime for each sort algorithm in
	 *         <name, runtime> format.</p>
	 */
	public Hashtable<String, Long> testSort(int size, int testCase) {

		InputGenerator ipGenerator = new InputGenerator();
		Hashtable<String, Long> resultTable = new Hashtable<>();

		// average case
		if (testCase == 0) {
			int[] inputArray = ipGenerator.getInput(size, 0);
			resultTable = testFramework(inputArray);
		}
		// best case
		if (testCase == 1) {
			int[] inputArray = ipGenerator.getInput(size, 1);
			resultTable = testFramework(inputArray);
		}
		if (testCase == -1) {
			int[] inputArray = ipGenerator.getInput(size, -1);
			resultTable = testFramework(inputArray);
		}
		return resultTable;

	}

}
