/**
 * Tower of Hanoi Lab (Template Classes and Test Cases)
 * This is the template class and test cases for the Tower of Hanoi Lab.
 * Written for the Woodstock School in Mussoorie, Uttarakhand, India.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

import java.util.Stack;

public class TowerOfHanoi {
  public static void main(String[] args) {
    //  Tests of the performMove() method:
    HanoiPuzzle hp1 = new HanoiPuzzle(5);
    //   Output: Move #1:... followed by an appropriate view of the puzzle.
    performMove(hp1, 0, 2, true);
    //   Output: Should show the state of the puzzle after moving a disk from
    //           tower 0 to tower 1.
    performMove(hp1, 0, 1, false);
    System.out.println(hp1);
    //   Output: Illegal Move
    performMove(hp1, 0, 1, true);

    // Tests of the calcOther() method:
    System.out.println(calcOther(1, 3));    // Output: 2
    System.out.println(calcOther(2, 1));    // Output: 3
    System.out.println(calcOther(3, 2));    // Output: 1

    // Tests of the solve3() method:
    HanoiPuzzle hp2 = new HanoiPuzzle(3);
    HanoiPuzzle hp3 = new HanoiPuzzle(3);

    //  Output: Should show all appropriate moves to solve the Tower of Hanoi
    //          puzzle with three disks (in 15 moves)!
    solve3(hp2, 1, 3, true);

    //  Output: Should show only the final, solved position of the Tower of
    //          Hanoi puzzle with three disks.
    solve3(hp3, 1, 3, false);
    System.out.println(hp3);

    // Tests of the solveN() method:
    HanoiPuzzle hp4 = new HanoiPuzzle(5);
    HanoiPuzzle hp5 = new HanoiPuzzle(8);
    HanoiPuzzle hp6 = new HanoiPuzzle(12);

    //   Output: Every move required to solve a 5-disk Tower of Hanoi puzzle,
    //           followed by the correct number of moves (31).
    solveN(hp4, 1, 3, 5, true);
    System.out.println(hp4.getMoves());

    //   Output: A solved 8-disk Tower of Hanoi puzzle, followed by the correct
    //           number of moves (255).
    solveN(hp5, 1, 3, 8, false);
    System.out.println(hp5);
    System.out.println(hp5.getMoves());

    //   Output: A solved 12-disk Tower of Hanoi puzzle, followed by the correct
    //           number of moves (4095).
    solveN(hp6, 1, 3, 12, false);
    System.out.println(hp6);
    System.out.println(hp6.getMoves());
  }

  /**
   * Moves a disk in the given puzzle from the given source tower to the given
   * destination tower. When verbose is true, the following is output to screen.
   * If a move is successful:
   * "Move #" followed by the current move number, then the entire current
   * state of the given puzzle.
   * If a move is not successful:
   * "Illegal Move"
   *
   * @param puzzle The puzzle to perform the move on.
   * @param from The source tower to move the disk from.
   *  Precondition: from is a valid tower number (0, 1 or 2).
   * @param to The destination tower to move the disk to.
   *  Precondition: to is a valid tower number (0, 1, or 2).
   * @param verbose Whether or not the given move should be output to the screen.
   *
   * Postcondition: If the move was valid, puzzle should contain towers holding
   *                the appropriate disks.
   */
  public static void performMove(HanoiPuzzle puzzle, int from, int to, boolean verbose) {
    //  To be implemented in Activity #1, Exercise 1
  }

  /**
   * Calculates what the "other" tower is when given a specific source and
   * destination tower.
   *
   * @param from The given source tower.
   *  Precondition: from is a valid tower number (0, 1 or 2).
   * @param to The given destination tower.
   *  Precondition: to is a valid tower number (0, 1, or 2).
   * @return  The tower not given as either the source or destination tower.
   */
  public static int calcOther(int from, int to) {
    //  To be implemented in Activity #1, Exercise 2
    return 0;
  }

  /**
   * Solves a given three-disk tower of hanoi puzzle, moving all disks from the
   * given source tower to the given destination tower. When verbose is true,
   * this method will output all moves performed while solving the puzzle.
   *
   * @param puzzle The puzzle to solve.
   *  Precondition: puzzle is a 3-disk tower of hanoi puzzle with all disks
   *                currently on the "from" tower.
   * @param from The source tower to move the disks from.
   *  Precondition: from contains all disks in the current puzzle
   * @param to The destination tower to move the disks to.
   *  Precondition: to is a valid tower number (0, 1, or 2).
   * @param verbose Whether or not each move should be output to the screen.
   *
   * Postcondition: puzzle should hold a solved Tower of Hanoi puzzle and the
   *                moves counter variable should hold the value 15.
   */
  public static void solve3(HanoiPuzzle puzzle, int from, int to, boolean verbose) {
    //  To be implemented in Activity #2, Exercise 1
  }

  /**
   * Solves a given n-disk tower of hanoi puzzle, moving all disks from the
   * given source tower to the given destination tower. When verbose is true,
   * this method will output all moves performed while solving the puzzle.
   *
   * @param puzzle The puzzle to solve.
   *  Precondition: puzzle is an n-disk tower of hanoi puzzle with all disks
   *                currently on the "from" tower.
   * @param from The source tower to move the disks from.
   *  Precondition: from contains all disks in the current puzzle
   * @param to The destination tower to move the disks to.
   *  Precondition: to is a valid tower number (0, 1, or 2).
   * @param n The number of disks to move from the destination tower to the
   *          source tower.
   *  Precondition: 0 < n <= puzzle.diskCount
   * @param verbose Whether or not each move should be output to the screen.
   *
   * Postcondition: puzzle should hold a solved Tower of Hanoi puzzle and the
   *                moves counter variable should hold the value (2^n - 1).
   */
  public static void solveN(HanoiPuzzle puzzle, int from, int to, int n, boolean verbose) {
    //  To be implemented in Activity #2, Exercise 2
  }
}

/**
 * The HanoiPuzzle class is the core class designed to represent the Tower
 * of Hanoi problem in Java. It is primarily responsible for enabling and
 * verifying moves between towers, as well as presenting a graphical display
 * of the current state of the towers.
 *
 * The HanoiPuzzle class here presents an opportunity for students to read
 * and understand how it works; however, it should not be modified for
 * the purposes of this lab.
 *
 * Note: This class has been hard-coded to handle only a three tower problem,
 * which is sufficient for all exercises and questions presented in the lab.
 */

class HanoiPuzzle {
  private Tower[] towers;           //  an array to store the towers
  private int diskCount, moves;     //  diskCount represents the number of
                                    //  disks present in the current puzzle,
                                    //  moves represents the current total
                                    //  number of moves taken

  /**
   * HanoiPuzzle constructor to create and store the towers and
   * initialize the instance variables for each object. Additionally,
   * this constructor sets up the first tower to hold all of the disks
   * appropriately.
   *
   * @param diskCount   The number of disks for the current puzzle.
   *  Precondition: diskCount > 0
   */
  public HanoiPuzzle(int diskCount) {
      this.diskCount = diskCount;
      moves = 0;

      towers = new Tower[3];
      towers[0] = new Tower();
      towers[1] = new Tower();
      towers[2] = new Tower();

      // Create and add all of the disks to the first tower. Because
      // the storage of disks is implemented as a stack, they are created
      // and added in reverse order (largest to smallest).
      for (int i = diskCount; i > 0; i--)
        towers[0].place(new Disk(i));
  }

  /**
   * Accessor method for the moves instance variable.
   *
   * @return  The current number of moves taken.
   */
  public int getMoves() {
      return moves;
  }

  /**
   * Attempts to move the top-most disk from the given source towers
   * to the given destination tower. If successful, the move count will
   * be updated as appropriate.
   *
   * @param from  The source tower for the move.
   *  Precondition: from is a valid tower number (0, 1, or 2).
   * @param to    The destination tower for the move.
   *  Precondition: to is a valid tower number (0, 1, or 2).
   * @return  Returns true if the move was successful, false otherwise.
   */
  public boolean move(int from, int to) {
      Tower srcTower = towers[from];
      Tower dstTower = towers[to];

      Disk topDisk = srcTower.remove();
      if ((topDisk != null) && (dstTower.place(topDisk))) {
          moves++;
          return true;
      }
      srcTower.place(topDisk);
      return false;
  }

  /**
   * Override of the toString method to visually display the current state
   * of all three towers in the current tower of hanoi puzzle.
   *
   * @return  The string to be printed to visually display the current state
   *          of the current tower of hanoi puzzle.
   */
  public String toString() {
      int towerWidth = 2 * diskCount - 1;

      // Set-up the tower headings using a String formatting method.
      String headerFormat = "%" + (towerWidth) + "c%" + (2 * towerWidth + 1) + "c%" + (2 * towerWidth + 1) + "c%n";
      String towerString = String.format(headerFormat, '0', '1', '2');
      towerString += "\n";

      // Loop through each of the tower "rows".
      for (int i = diskCount - 1; i >= 0; i--) {
        towerString += towers[0].getRowString(i, towerWidth);
        towerString += "  ";
        towerString += towers[1].getRowString(i, towerWidth);
        towerString += "  ";
        towerString += towers[2].getRowString(i, towerWidth);
        towerString += "\n";
      }
      return towerString;
  }

  /**
   * The Tower class designed to store and process disks. It is also
   * responsible for formatting its own "row strings" referenced below.
   *
   * This class has been implemented as a nested class. Nested classes
   * allow for the creation of classes in Java as members of another class.
   * They are traditionally used to logically group classes together,
   * particularly classes that need to directly access member variables
   * of one another.
   */
  class Tower {
    private Stack<Disk> disks;    // A stack of disks implemented using
                                  // Java's built-in Stack class.

    /**
     * Tower class constructor to initialize the stack of disks.
     */
    public Tower() {
      disks = new Stack<Disk>();
    }

    /**
     * Method that pushes a disk to the top of the tower's disk stack,
     * provided it meets the requirement of being small than the top
     * disk on the stack.
     *
     * @param d The disk to place.
     *  Precondition: d is a disk in the Tower of Hanoi puzzle to which this
     *                tower belongs.
     * @return  Returns true if the disk move is valid, fale otherwise.
     */
    public boolean place(Disk d) {
      if ((disks.empty()) || (d.compareTo(disks.peek()) < 0)) {
        disks.push(d);
        return true;
      }
      return false;
    }

    /**
     * Removes and returns the disk at the top of the disk stack.
     *
     * @return  The disk at the top of the disk stack or null if no such
     *          disk exists.
     */
    public Disk remove() {
      return (disks.empty()) ? null : disks.pop();
    }

    /**
     * Composes and returns a string to graphically represent the current state
     * of a given "row" of the tower.
     *
     * @param row Which row to represent as a string.
     *  Precondition: row is a valid row for the current Tower of Hanoi puzzle.
     * @param width How wide the row should be (for string padding reasons).
     *  Precondition: width > 0
     * @return  A string graphically representing the current state of the
     *          given "row" of the tower, padded to the given width.
     */
    public String getRowString(int row, int width) {
      int stringLength = 2 * width - 1;
      String rowString = "";

      // If there is no disk present, represent the blank "peg" as a line.
      String diskString = (disks.size() <= row) ? "|" : disks.get(row).toString();

      // Calculate the required padding on either side of the present disk.
      int paddingLength = (stringLength - diskString.length()) / 2;

      // Add padding to the left of the present disk.
      for (int i = 0; i < paddingLength; i++)
        rowString += " ";
      rowString += diskString;
      // Add padding to the right of the present disk.
      for (int i = 0; i < paddingLength; i++)
        rowString += " ";

      return rowString;
    }
  }

  /**
   * The Disk class used to represent individual disks within the Tower of
   * Hanoi puzzle. This class shows implementation of the Comparable interface
   * in order to allow for determining whether or not a move is allowed.
   */
  class Disk implements Comparable<Disk> {
    private final int size;   // size of the current disk
                              // disk is labelled final as there should not be
                              // any reason why the size should be able to
                              // change throughout the solving of a puzzle.

    /**
     * Disk class constructor to initialize the disk to the given size.
     *
     * @param size The size of the disk to be created.
     */
    public Disk(int size) {
      this.size = size;
    }

    /**
     * Compares the current disk to the given one in accordance to the
     * compareTo method described in the Comparable interface.
     *
     * @param disk The disk to compare this one to.
     *  Precondition: disk is a valid disk for the current puzzle.
     * @return  -1 if the current disk is smaller than the given disk, +1 if
     *          the current disk is larger than the given disk, 0 otherwise.
     */
    public int compareTo(Disk disk) {
      if (size < disk.size)
        return -1;
      else if (size > disk.size)
        return 1;
      return 0;
    }

    /**
     * Override of the toString() method in order to graphically represent the
     * current disk.
     *
     * @return  A string graphically representing the current disk.
     */
    public String toString() {
      String diskString = "";

      // (2 * size - 1) allows for always having an odd number of symbols
      // representing each disk, which allows for centering of the disk
      // graphically on each tower
      for (int i = 0; i < (2 * size - 1); i++)
        diskString += "=";
      return diskString;
    }
  }
}
