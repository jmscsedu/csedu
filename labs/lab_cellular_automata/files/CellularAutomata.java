/**
 * Cellular Automata Lab (Template Classes and Test Cases)
 * These are the template classes and test cases for the Cellular
 * Automata Lab. Written for the Woodstock School in Mussoorie,
 * Uttarakhand, India.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

public class CellularAutomata {
  public static void main(String[] args) {
    //  Tests for CellularAutomaton handling of n, the number of cells.
    //   Output: 11 cells, with the center cell filled.
    System.out.println(new CellularAutomaton(11));
    //   Output: 21 cells, with the center cell filled.
    System.out.println(new CellularAutomaton(21));
    //   Output: 51 cells, with the center cell filled.
    System.out.println(new CellularAutomaton(51));

    //  Tests for the evolve() method.
    //   Output: The following lines should print the sample evolution from
    //           the Background section of the lab.
    CellularAutomaton ca1 = new CellularAutomaton(15);
    System.out.println(ca1);
    ca1.evolve();
    ca1.evolve();
    ca1.evolve();

    //   Output: The following lines should print identical output as those
    //           above.
    CellularAutomaton ca2 = new CellularAutomaton(15, 90);
    System.out.println(ca2);
    ca2.evolve();
    ca2.evolve();
    ca2.evolve();

    //   Output: The following lines should print the solution to Activity #1,
    //           Question #2.
    CellularAutomaton ca3 = new CellularAutomaton(23, 57);
    System.out.println(ca3);
    for (int i = 1; i < 15; i++)
      ca3.evolve();

    //   Output: The following lines will produce similar starting output as
    //           the sample given in the Background; however, the edge cases
    //           will begin to shift the pattern once they begin being filled.
    WrappingCellularAutomaton wca1 = new WrappingCellularAutomaton(15, 90);
    System.out.println(wca1);
    for (int i = 1; i < 15; i++)
      wca1.evolve();

    //   Output: The following lines will produce similar output as the
    //           sample given in the background; however, the edge cases will
    //           be handled according to the special rule set.
    SpecialCaseCellularAutomaton scca1 = new SpecialCaseCellularAutomaton(15, 90, 11);
    System.out.println(scca1);
    for (int i = 1; i < 15; i++)
      scca1.evolve();
  }
}

class CellularAutomaton {
  private int[] cells;        //  array to hold the current cell states
  private int[] rules;        //  array to hold the current rule values

  /**
   * Initializes a CellularAutomaton of array size n. The rules should be
   * populated according to Rule #90 from the background section of the lab.
   * Additionally, the center cell should be turned 'on' (initialized to 1).
   *
   * @param n The size of the array of cells.
   *  Precondition: n > 0
   */
   public CellularAutomaton(int n) {
     // To be implemented in Activity #1, Exercise 1A
   }

  /**
   * Initializes a CellularAutomaton of array size n with a rule set in
   * accordance to the given rule number. Additionally, the center cell should
   * be turned 'on' (initialized to 1).
   *
   * @param n The size of the array of cells.
   *  Precondition: n > 0
   * @param ruleN The denary rule number the cellular automaton should follow.
   *  Precondition: 0 <= ruleN <= 255
   */
   public CellularAutomaton(int n, int ruleN) {
     // To be implemented in Activity #1, Exercise 2B
   }

  /**
   * Evolves the current set of cells according to the stored rule set and
   * prints the result.
   */
  public void evolve() {
    //  To be implemented in Activity #1, Exercise 1C
  }

  /**
   * Helper method to return the denary value representing the given cell's
   * neighbourhood.
   *
   * @param index  The index of the cell to get the neighbourhood value of.
   *  Precondition: index is valid for the current group of cells.
   * @return  A denary value representing the given cell's neighbourhood.
   */
  private int getNeighbourValue(int index) {
    //  To be implemented in Activity #1, Exercise 1B(i)
  }

  /**
   * Helper method to return an array representing the next generation of cells.
   *
   * @return  An array representing the next generation of cells.
   */
  private int[] getNextGeneration() {
    //  To be implemented in Activity #1, Exercise 1B(ii)
  }

  /**
   * Helper method to return an array representing the rule set from a given
   * denary rule number.
   *
   * @param ruleN A denary value representing a rule number.
   *  Precondition: 0 <= ruleN <= 255
   * @return  An array representing the rule set from the given denary rule
   *          number.
   */
   private int[] getRulePattern(int ruleN) {
     // To be implemented in Activity #1, Exercise 2A
   }

  /**
   * Override of the toString method for printing the cellular automaton.
   *
   * @return  A string giving a visual representation of the current group of
   *          cells in the cellular automaton.
   */
  public String toString() {
    String output = "";
    for (int i = 0; i < cells.length; i++)
      if (cells[i] == 0)
        output += (char)0x25A1;
      else
        output += (char)0x25A3;
    return output;
  }
}

class WrappingCellularAutomaton extends CellularAutomaton {
  public WrappingCellularAutomaton(int n) {
    super(n);
  }

  public WrappingCellularAutomaton(int n, int ruleN) {
    super(n, ruleN);
  }

  //  Additional method(s) to be implemented in Activity #2, Exercise 1
}

class SpecialCaseCellularAutomaton extends CellularAutomaton {
  private int[] specialRules;

  public SpecialCaseCellularAutomaton(int n, int ruleN, int specialN) {
    super(n, ruleN);
    //  Processing of specialN to be implemented in Activity #2, Exercise 2
  }

  //  Additional method(s) to be implemented in Activity #2, Exercise 2
}
