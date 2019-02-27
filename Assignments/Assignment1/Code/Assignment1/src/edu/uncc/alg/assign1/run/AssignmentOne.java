/**
 * 
 */
package edu.uncc.alg.assign1.run;

import edu.uncc.alg.assign1.test.Run;

/**
 * @author venky
 *
 */
public class AssignmentOne {

	/**
	 * Main method, Run this method to get the result.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sizeArray = { 500, 1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000 };

		Run run = new Run();
		System.out.println("Running for best case...");
		run.runTest(sizeArray, 10, "best");
		System.out.println("\n\nRunning for worse case...");
		run.runTest(sizeArray, 10, "worse");
		System.out.println("\n\nRunning for average case...");
		run.runTest(sizeArray, 10, "average");

	}

}
