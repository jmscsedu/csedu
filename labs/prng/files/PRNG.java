/**
 * PRNG Lab (Template Class and Test Cases)
 * This is the template class and test cases for the PRNG lab.
 * Written for the Woodstock School in Mussoorie, Uttarakhand, India.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

public class PRNG {
  public static void main(String[] args) {
    //  Tests for getMiddleSquare:
    System.out.println(getMiddleSquare(48, 2));      // Output: 30
    System.out.println(getMiddleSquare(2015, 4));    // Output: 602
    System.out.println(getMiddleSquare(577324, 6));  // Output: 303000

    //  Tests for getMiddleSquare (Overloaded):
    //   Output: [48, 30, 90, 10, 10]
    printArray(getMiddleSquare(48, 2, 5));
    //   Output: [2015, 602, 6240, 9376, 9093, 6826, 5942, 3073, 4433, 6514]
    printArray(getMiddleSquare(2015, 4, 10));
    //   Output: [577324, 303000, 809000]
    printArray(getMiddleSquare(577324, 6, 3));

    //  Tests for getMiddleSquarePeriod:
    System.out.println(getMiddleSquarePeriod(48, 2));     // Output: 4
    System.out.println(getMiddleSquarePeriod(2015, 4));   // Output: 21
    System.out.println(getMiddleSquarePeriod(577324, 6)); // Output: 10

    //  Tests for getLCG:
    System.out.println(getLCG(13, 47, 103, 10));    // Output: 74
    System.out.println(getLCG(7, 12, 217, 55));     // Output: 180
    System.out.println(getLCG(73, 1, 1024, 250));   // Output: 843

    //  Tests for getLCG (Overloaded):
    //   Output: [10, 74, 82, 83, 96, 59, 93, 20, 101, 21]
    printArray(getLCG(13, 47, 103, 10, 10));
    //   Output: [55, 180, 187, 19, 145]
    printArray(getLCG(7, 12, 217, 55, 5));
    //   Output: [250, 843, 100, 133, 494, 223, 920, 601, 866, 755, 844, ...]
    printArray(getLCG(73, 1, 1024, 250, 100));

    //  Tests for getLCGPeriod:
    System.out.println(getLCGPeriod(13, 47, 103, 10));  // Output: 17
    System.out.println(getLCGPeriod(7, 12, 217, 55));   // Output: 16
    System.out.println(getLCGPeriod(73, 1, 1024, 250)); // Output: 1024
  }

  /**
   * Calculates the next in a sequence of pseudo-random numbers using the
   * middle-square method.
   *
   * @param x The current seed number in a sequence of pseudo-random numbers.
   *  Precondition: x >= 0
   * @param n The number of digits for each number in the sequence.
   *  Precondition: n > 0
   * @return  The next number generated as the middle-square of the given value.
   */
  public static int getMiddleSquare(int x, int n) {
    //  To be implemented in Activity #1, Exercise 1
  }

  /**
   * Calculates a sequence of pseudo-random numbers using the middle-square
   * method.
   *
   * @param x The initial seed number in a sequence of pseudo-random numbers.
   *  Precondition: x >= 0
   * @param n The number of digits for each number in the sequence.
   *  Precondition: n > 0
   * @param N The number of random numbers that should be generated.
   *  Precondition: N > 0
   * @return  An array of pseudo-random numbers generated from the given value
   *          using the middle-square method.
   */
  public static int[] getMiddleSquare(int x, int n, int N) {
    //  To be implemented in Activity #1, Exercise 2
  }

  /**
   * Calculates the period of a sequence of pseudo-random numbers generated
   * using the middle-square method.
   *
   * @param x The initial seed number for the sequence of pseudo-random numbers.
   *  Precondition: x >= 0
   * @param n The number of digits for each number in the sequence.
   * @return  The length of the sequence of pseudo-random numbers generated from
   *          the given value using the middle-square method prior to a
   *          repetition occuring.
   *          Note: Repetition does not need to begin with the intial seed value.
   */
  public static int getMiddleSquarePeriod(int x, int n) {
    //  To be implemented in Activity #1, Exercise 3
  }

  /**
   * Calculates the next in a sequence of pseudo-random numbers using a
   * linear congruential generator.
   *
   * @param k The multiplier for the LCG.
   *  Precondition: k > 0
   * @param c The constant offset for the LCG.
   *  Precondition: c >= 0
   * @param m The modulus for the LCG.
   *  Precondition: m > 1
   * @param x The current seed value for the sequence of pseudo-random numbers.
   *  Precondition: x >= 0
   * @return  The next number generated using a linear congruential generator
   *          with the given parameters.
   */
  public static int getLCG(int k, int c, int m, int x) {
    //  To be implemented in Activity #2, Exercise 1
  }

  /**
   * Calculates a sequence of pseudo-random numbers generated using a linear
   * congruential generator.
   *
   * @param k The multiplier for the LCG.
   *  Precondition: k > 0
   * @param c The constant offset for the LCG.
   *  Precondition: c >= 0
   * @param m The modulus for the LCG.
   *  Precondition: m > 1
   * @param x The initial seed value for the sequence of pseudo-random numbers.
   *  Precondition: x >= 0
   * @param N The number of random numbers that should be generated.
   *  Precondition: N > 0
   * @return  An array of psedo-random numbers generated using a linear
   *          congruential generator with the given parameters.
   */
  public static int[] getLCG(int k, int c, int m, int x, int N) {
    //  To be implemented in Activity #2, Exercise 2
  }

  /**
   * Calculates the period of a sequence of pseudo-random numbers generated
   * using a linear congruential generator.
   *
   * @param k The multiplier for the LCG.
   *  Precondition: k > 0
   * @param c The constant offset for the LCG.
   *  Precondition: c >= 0
   * @param m The modulus for the LCG.
   *  Precondition: m > 1
   * @param x The initial seed value for the sequence of pseudo-random numbers.
   *  Precondition: x >= 0
   * @return  The length of the sequence of pseudo-random numbers generated from
   *          the given value using the linear congruential generator with the
   *          given parameters prior to a repetition occuring.
   *          Note: Repetition does not need to begin with the intial seed value.
   */
  public static int getLCGPeriod(int k, int c, int m, int x) {
    //  To be implemented in Activity #2, Exercise 3
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
