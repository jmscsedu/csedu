/**
 * Calculator Lab (Template Class and Test Cases)
 * This is the template class and test cases for the Calculator Lab.
 * Written for the Woodstock School in Mussoorie, Uttarakhand, India.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

public class Calculator {
  public static void main(String[] args) {
    //  Test cases for evalPostfix:
    System.out.println(evalPostfix("3 4 10 + -"));          // Output: -11
    System.out.println(evalPostfix("5 6 * 2 8 - +"));       // Output: 24
    System.out.println(evalPostfix("10 2 / 4 5 * 3 + +"));  // Output: 28

    //  Test cases for evalPrefix:
    System.out.println(evalPrefix("* + 2 5 - 3 7"));        // Output: -28
    System.out.println(evalPrefix("- - - 4 5 8 3"));        // Output: -12
    System.out.println(evalPrefix("+ * 2 5 / 6 2"));        // Output: 13

    //  Test cases for infix2postfix:
    //   Output: 2 3 4 * + 8 -
    System.out.println(infix2postfix("2 + 3 * 4 - 8"));
    //   Output: 3 7 - 8 2 / +
    System.out.println(infix2postfix("3 - 7 + 8 / 2"));
    //   Output: 2 10 * 5 3 * 2 / +
    System.out.println(infix2postfix("2 * 10 + 5 * 3 / 2"));

    //  Test cases for evalInfix:
    System.out.println(evalInfix("2 + 3 * 4 - 8"));       // Output: 6
    System.out.println(evalInfix("3 - 7 + 8 / 2"));       // Output: 0
    System.out.println(evalInfix("2 * 10 + 5 * 3 / 2"));  // Output: 27.5
  }

  /**
   * Evaluates a given postfix notation expression and returns the result.
   *
   * @param expression
   *  Preconditions:  expression is well-formed in postfix notation
   *                  each token is separated by a single blank space
   * @return  The value of the expression after evaluation.
   */
  public static double evalPostfix(String expression) {
    //  To be implemented in Activity #1, Exercise 1
  }

  /**
   * Evaluates a given prefix notation expression and returns the result.
   *
   * @param expression
   *  Precondition: expression is well-formed in prefix notation
   *                each token is separated by a single blank space
   * @return  The value of the expression after evaluation.
   */
  public static double evalPrefix(String expression) {
    //  To be implemented in Activity #1, Exercise 2
  }

  /**
   * Converts a string from infix notation to postfix notation.
   *
   * @param expression
   *  Precondition: expression is well-formed in infix notation
   *                each token is separated by a single blank space
   * @return  An equivalent expression in postfix notation.
   */
  public static String infix2postfix(String expression) {
    //  To be implemented in Activity #2, Exercise 1
  }

  /**
   * Evaluates a given infix notation expression and returns the result.
   *
   * @param expression
   *  Precondition: expression is well-formed in infix notation
   *                each token is separated by a single blank space
   * @return  The value of the expression after evaluation.
   */
  public static double evalInfix(String expression) {
    //  To be implemented in Activity #2, Exercise 2
  }
}
