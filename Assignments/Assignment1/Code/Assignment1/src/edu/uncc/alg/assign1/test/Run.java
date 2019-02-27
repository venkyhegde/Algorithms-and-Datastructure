/**
 * 
 */
package edu.uncc.alg.assign1.test;

import java.util.Hashtable;
import java.util.TreeMap;

import edu.uncc.alg.assign1.util.InputGenerator;

/**
 * @author venky
 *
 */
public class Run {

	TestFramework testFramework = new TestFramework();

	/**
	 * <p>
	 * A public method which runs the tests to get the run time for each sorting
	 * algorithms and prints the result
	 * </p>
	 * 
	 * @param sizeArray
	 *            -
	 *            <p>
	 * 			Input array of integers
	 *            </p>
	 * @param numOfRun
	 *            -
	 *            <p>
	 * 			Number of times each algorithm has to run.
	 *            <p>
	 * @param runCase
	 *            -
	 *            <p>
	 *            Specifies the case.
	 *            <ul>
	 *            <li>"average" to run the algorithms for Average case</li>
	 *            <li>"best" to run the algorithms for Best case</li>
	 *            <li>"worse" to run the algorithms for Worst case</li>
	 *            </ul>
	 *            </p>
	 */
	public void runTest(int[] sizeArray, int numOfRun, String runCase) {

		int order = 0;
		if (runCase.equalsIgnoreCase("average")) {
			order = 0;
		}

		if (runCase.equalsIgnoreCase("best")) {
			order = 1;
		}
		if (runCase.equalsIgnoreCase("worse")) {
			order = -1;
		}

		TreeMap<Integer, Double> selectionResult = new TreeMap<>();
		TreeMap<Integer, Double> insertionResult = new TreeMap<>();
		TreeMap<Integer, Double> mergeResult = new TreeMap<>();
		TreeMap<Integer, Double> bubbleResult = new TreeMap<>();

		long selectionRunTime = 0;
		long selectionAvgRunTime = 0;

		long insertionRunTime = 0;
		long insertionAvgRunTime = 0;

		long mergeRunTime = 0;
		long mergeAvgRunTime = 0;

		long bubbleRunTime = 0;
		long bubbleAvgRunTime = 0;

		for (int i = 0; i < sizeArray.length; i++) {
			for (int j = 1; j <= numOfRun; j++) {
				Hashtable<String, Long> resultTable = testFramework.testSort(sizeArray[i], order);
				selectionRunTime = selectionRunTime + resultTable.get("selection");
				insertionRunTime = insertionRunTime + resultTable.get("insertion");
				mergeRunTime = mergeRunTime + resultTable.get("merge");
				bubbleRunTime = bubbleRunTime + resultTable.get("bubble");

			}
			selectionAvgRunTime = selectionRunTime / numOfRun;
			insertionAvgRunTime = insertionRunTime / numOfRun;
			mergeAvgRunTime = mergeRunTime / numOfRun;
			bubbleAvgRunTime = bubbleRunTime / numOfRun;

			selectionResult.put(sizeArray[i], InputGenerator.nanoSecToMilisec(selectionAvgRunTime));
			insertionResult.put(sizeArray[i], InputGenerator.nanoSecToMilisec(insertionAvgRunTime));
			mergeResult.put(sizeArray[i], InputGenerator.nanoSecToMilisec(mergeAvgRunTime));
			bubbleResult.put(sizeArray[i], InputGenerator.nanoSecToMilisec(bubbleAvgRunTime));

		}

		System.out.println("\nResults for " + runCase + " case\n================================================");
		System.out.println("\nSelection Sort");
		System.out.println(selectionResult);
		System.out.println("\nInsertion Sort");
		System.out.println(insertionResult);
		System.out.println("\nMerge Sort");
		System.out.println(mergeResult);
		System.out.println("\nBubble Sort");
		System.out.println(bubbleResult);

	}
}
