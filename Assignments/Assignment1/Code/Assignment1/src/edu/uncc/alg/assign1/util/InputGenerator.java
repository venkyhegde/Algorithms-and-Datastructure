/**
 * 
 */
package edu.uncc.alg.assign1.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author venky
 *
 */
public class InputGenerator {

	/**
	 * Method to generate the array of random integers.
	 * 
	 * @param size
	 *            -
	 *            <p>
	 *            Size of the array, can be up to 2<sup>32</sup>.
	 *            </p>
	 * @param order
	 *            -
	 *            <p>
	 *            order in which the random number to be sorted in array.
	 *            <ul>
	 *            <li>0 - Random order</li>
	 *            <li>1 - Ascending order</li>
	 *            <li>-1 - Descending order</li>
	 *            </ul>
	 * @return
	 *         <p>
	 *         An array of Random numbers
	 *         <p>
	 */
	public int[] getInput(int size, int order) {

		// creating instance of Random class to generate random numbers
		Random random = new Random();

		List<Integer> inputList = new ArrayList<>();

		// generating the random numbers
		for (int i = 0; i < size; i++) {
			inputList.add(random.nextInt(size) + 1);
		}
		int[] inputArray = new int[inputList.size()];
		// checking for the order
		if (order == 0) {
			inputArray = listToArray(inputList);
		}

		if (order == 1) {
			// sorts in ascending order
			Collections.sort(inputList);
			inputArray = listToArray(inputList);
		}
		if (order == -1) {
			// sorts in descending order
			Collections.sort(inputList, Collections.reverseOrder());
			inputArray = listToArray(inputList);

		}

		return inputArray;

	}

	/**
	 * A static method to convert an ArrayList of integers to Array of integers.
	 * 
	 * @param myList
	 *            - An integer ArrayList.
	 * @return myArray - An array of integers.
	 */
	private static int[] listToArray(List<Integer> myList) {

		if (null == myList) {
			throw new NullPointerException("List has no elements");
		}
		int[] myArray = new int[myList.size()];
		for (int i = 0; i < myList.size(); i++) {
			if (null != myList.get(i)) {
				myArray[i] = myList.get(i);
			}
		}

		return myArray;

	}

	/**
	 * Method to convert Nano seconds to melli second
	 * @param nanoSecond - time in nano seconds.
	 * @return duration - time in milli seconds.
	 */
	public static double nanoSecToMilisec(long nanoSecond) {
		double duration = (double) nanoSecond / 1000000;
		return duration;

	}

}
