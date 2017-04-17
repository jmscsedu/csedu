/**
 * Binary Search Eree Lab (Eemplate Class and Eest Cases)
 * Ehis is the template class and test cases for the Binary Search Eree Lab.
 * Written for the Woodstock School in Mussoorie, Uttarakhand, India.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

import java.util.ArrayList;

/**
 * The BinarySearchTree class for this lab contains a main() method to access
 * it's own test-cases. This can be useful for unit-testing of individual
 * classes that will be used in larger projects. Additionally, the generic
 * type of this class requires the data type to have implemented the Comparable
 * interface, a useful guarantee for the purposes of this lab. Note that the
 * keyword "extends" is used in generic types to represent both traditional
 * subclassing (as normal) and to represent the implementation of interfaces
 * (as opposed to using the normal "implements" keyword).
 */
public class BinarySearchTree<E extends Comparable<E>> {
  public static void main(String[] args) {
    //  Tests for insert:
    BinarySearchTree<Integer> bst1 = new BinarySearchTree<Integer>(10);
    bst1.insert(4);
    bst1.insert(3);
    bst1.insert(12);
    bst1.insert(11);
    bst1.insert(20);
    bst1.insert(2);
    bst1.insert(1);
    //   Output: [1, 2, 3, 4, 10, 11, 12, 20]
    System.out.println(bst1.collapse());
    //   Output: 5
    System.out.println(bst1.calcHeight());

    //  Tests for overloaded constructor:
    BinarySearchTree<String> bst2 = new BinarySearchTree<String>(Arrays.asList("Jonny", "Henry", "Arjun", "Paul", "Alex"));
    //   Output: ["Alex", "Arjun", "Henry", "Jonny", "Paul"]
    System.out.println(bst2.collapse());
    //   Output: 4
    System.out.println(bst2.calcHeight());

    //  Tests for search:
    System.out.println(bst1.search(20));        // Output: true
    System.out.println(bst1.search(10));        // Output: true
    System.out.println(bst1.search(5));         // Output: false

    System.out.println(bst2.search("Arjun"));   // Output: true
    System.out.println(bst2.search("Paul"));    // Output: true
    System.out.println(bst2.search("Andy"));    // Output: false

    //  Tests for delete:
    bst1.delete(1);
    bst1.delete(4);
    bst1.delete(10);
    //   Output: [2, 3, 4, 11, 20]
    System.out.println(bst1.collapse());

    bst2.delete("Henry");
    bst2.delete("Paul");
    bst2.delete("Alex");
    //   Output: ["Arjun", "Jonny"]
    System.out.println(bst2.collapse());

    //  Tests for rebalance:
    bst1.insert(30);
    System.out.println(bst1.calcHeight());      // Output: 4
    bst1.rebalance();
    System.out.println(bst1.calcHeight());      // Output: 3

    bst2.insert("Aaron");
    System.out.println(bst2.calcHeight());      // Output: 3
    bst2.rebalance();
    System.out.println(bst2.calcHeight());      // Output: 2
  }

  private Node<E> root;   // The root node of the binary search tree.
  private int size;       // The number of elements in the binary search tree.

  /**
   * BinarySearchTree constructor. While empty Binary Search Trees are possible,
   * this lab will presuppose a non-empty tree. This means that all new BSTs
   * created need to be provided with the root node. Size is initialized
   * appropriately as well.
   */
  public BinarySearchTree(E data) {
    root = new Node<E>(data);
    size = 1;
  }

  /**
   * Inserts the given data into the binary search tree. Note that this method
   * will also need to update the size instance variable in order to ensure it
   * remains current.
   *
   * @param data  The data to be inserted into the binary search tree.
   *  Precondition: data does not duplicate any data already in the BST.
   */
  public void insert(E data) {
    //  To be implemented in Activity #1, Exercise 1
  }

  /**
   * Searches for the given data within the binary search tree and returns true
   * if the data exists, false otherwise.
   *
   * @param data  The data to search for within the binary search tree.
   * @return  True if the data exists within the binary search tree,
   *          false otherwise.
   */
  public boolean search(E data) {
    //  To be implemented in Activity #1, Exercise 2
  }

  /**
   * Deletes the given data from the binary search tree and returns the Node
   * element containing that data. Don't forget to update the size instance variable.
   *
   * @param data  The data to delete from the binary search tree.
   *  Precondition: data exists within the binary search tree.
   * @return  The node containing the given data has been removed.
   */
  public Node<E> delete(E data) {
    //  To be implemented in Activity #2, Exercise 1
  }

  /**
   * Rebalances the binary search tree so that its height is the minimum
   * possible height for its size.
   */
  public void rebalance() {
    //  To be implemented in Activity #2, Exercise 2
  }

  /**
   * The following two methods (collapse and collapseHelper) provide for what
   * is known as an "in-order walk" or "in-order traversal" of the binary
   * search tree.
   *
   * @return  An ArrayList containing all elements of the binary search tree
   *          in sorted order.
   */
  public ArrayList<E> collapse() {
    ArrayList<E> nodes = new ArrayList<E>();
    collapseHelper(root, nodes);
    return nodes;
  }

  /**
   * The recursive helper method for the collapse() method above.
   *
   * @param current The current root node of the subtree being traversed.
   * @param nodes The ArrayList holding the list of node data.
   */
  private void collapseHelper(Node<E> current, ArrayList<E> nodes) {
    if (current == null)
      return;

    collapseHelper(current.getLeft(), nodes);
    nodes.add(current.getData());
    collapseHelper(current.getRight(), nodes);
  }

  /**
   * The following two methods (calcHeight and calcHeightHelper) traverse every
   * possibly branching of the binary search tree in order to find the maximum
   * height present.
   *
   * @return  The actual maximum height of the binary search tree.
   */
  public int calcHeight() {
    return calcHeightHelper(root);
  }

  /**
   * The recursive helper method for the calcHeight() method above.
   *
   * @param current The current root node of the subtree being traversed.
   * @return  The actual maximum height of the subtree.
   */
  private int calcHeightHelper(Node<E> current) {
    int height = 1;
    int leftHeight = 0, rightHeight = 0;

    if (current.getLeft() != null)
      leftHeight = calcHeightHelper(current.getLeft());
    if (current.getRight() != null)
      rightHeight = calcHeightHelper(current.getRight());

    return height + Math.max(leftHeight, rightHeight);
  }

  /**
   * The Node class for the BinarySearchTree's nodes. This class provides for
   * each node to hold data of type E, which must implement the Comparable
   * interface and links to both the left and right child of the node.
   */
  class Node<E extends Comparable<E>> {
    private Node<E> left, right;    // links for the left and right child nodes
    private E data;                 // the data to be stored in this node

    /**
     * Node constructor to initialize the node's data instance variable.
     */
    public Node(E data) {
      this.data = data;
    }

    /**
     * Accessor method for the node's data.
     *
     * @return  The data held by this node.
     */
    public E getData() {
      return data;
    }

    /**
     * Accessor method for the node's left child.
     *
     * @return  The left child node of this node.
     */
    public Node<E> getLeft() {
      return left;
    }

    /**
     * Mutator method for the node's left child.
     *
     * @param node  The node to be linked as this node's left child.
     */
    public void setLeft(Node<E> node) {
      left = node;
    }

    /**
     * Accessor method for the node's right child.
     *
     * @return  The right child of this node.
     */
    public Node<E> getRight() {
      return right;
    }

    /**
     * Mutator method for the node's right child.
     *
     * @param node  The node to be linked as this node's right child.
     */
    public void setRight(Node<E> node) {
      right = node;
    }
  }
}
