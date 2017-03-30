/**
 * Simulation Lab (Template Class and Test Cases)
 * This is the template class and test cases for the Simulation Lab;
 * Written for the Woodstock School in Mussoorie, Uttarakhand, India.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

public class Simulation {
	public static void main(String[] args) {
		//	Tests for runSimulation
		//	 Outputs will vary each time your tests are run.
		System.out.println(runSimulation(10));
		System.out.println(runSimulation(50));
		System.out.println(runSimulation(100));

		//	Tests for runSimulation (overloaded):
		//	 Outputs will vary each time your tests are run.
		//	 Note: printArray() is implemented below.
		printArray(runSimulation(10, 5));
		printArray(runSimulation(50, 10));
		printArray(runSimulation(100, 20));

		//	Tests for estimateProbability:
		//	 Outputs will vary, but should be close to indicated values.
		System.out.println(estimateProbability(10, 5));		// Output: ~0.875
		System.out.println(estimateProbability(50, 15));	// Output: ~0.220
		System.out.println(estimateProbability(100, 25));	// Output: ~0.080

		//	Tests for estimateExpectedValue:
		//	 Outputs will vary, but should be close to indicated values.
		System.out.println(estimateExpectedValue(10));		// Output: ~6.0
		System.out.println(estimateExpectedValue(50));		// Output: ~11.0
		System.out.println(estimateExpectedValue(100));		// Output: ~15.0
	}

	/**
	 * Runs the Alice Rumour simulation once for the indicated number of guests.
	 *
	 * @param n	The number of guests Alice has invited (including Bob).
	 *	Precondition: n > 0
	 * @return	The number of guests that have heard the rumour before it stops
	 *					propagating.
	 */
	public static int runSimulation(int n) {
		//	To be implemented in Activity #1, Exercise 1
	}

	/**
	 * Runs the Alice Rumour simulation the indicated number of times, each
	 * with the indicated number of guests.
	 *
	 * @param n	The number of guests Alice has invited (including Bob).
	 *	Precondition: n > 0
	 * @param N	The number of times the simulation should be run.
	 *	Precondition: N > 0
	 * @return	An integer array in which the i-th value corresponds to the
	 *					number of guests who have heard the rumour during the i-th
	 *					running of the simulation.
	 */
	public static int[] runSimulation(int n, int N) {
		//	To be implemented in Activity #1, Exercise 2
	}

	/**
	 * Runs the Alice Rumour simulation multiple times in order to estimate the
	 * probability that at least r out of n guests hear the rumour.
	 *
	 * @param n	The number of guests Alice has invited (including Bob).
	 *	Precondition: n > 0
	 * @param r	The target number of guests who have heard the rumour.
	 *	Precondition:	0 <= r <= n
	 * @return	The estimate probability that at least r out of n guests
	 *					have heard the rumour.
	 */
	public static double estimateProbability(int n, int r) {
		//	To be implemented in Activity #2, Exercise 1
	}

	/**
	 * Runs the Alice Rumour simulation multiple times in order to estimate the
	 * expected number of guests to hear the rumour before it stops propagating.
	 *
	 * @param n	The number of guests Alice has invited (including Bob).
	 *	Precondition: n > 0
	 * @return	The average number of guests to have heard the rumour, calculated
	 *					by running the simulation multiple times.
	 */
	public static double estimateExpectedValue(int n) {
		//	To be implemented in Activity #2, Exercise 2
	}

	/**
	 * A helper method to print all values in a given integer array.
	 *
	 * @param a	The integer array to be printed.
	 */
	public static void printArray(int[] a) {
		System.out.print("[" + a[0]);
		for (int i = 1; i < a.length; i++)
			System.out.print(", " + a[i]);
		System.out.println("]");
	}
}	
