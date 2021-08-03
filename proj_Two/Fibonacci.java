/**
 * Date: 2021-06-24
 * Filename: Fibonacci.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign2;
import java.util.ArrayList;

/**
 * A program that print out the fibonacci sequence.
 * The two start terms are 1 and 2.
 * When the sequence is finnished, the the fibonacci sequence is printed out
 * along with all odd numbers, and the sum of all odd numbers that do not exceed one thousand.
 * 
 * @version Jun 2021
 * @author Henrik Bergsten
 */

public class Fibonacci {
  public static void main(String[] args) {
    /**
     * Declaration of the variables.
     * An arraylist is initiated to hold the odd values and present them when the program finnish.
     */
    int maxNumber = 1000;
    int termOne = 1;
    int termTwo = 2;
    int sumOfOddNumbers = 0;
    int oddNumber;
    ArrayList<Integer> theList = new ArrayList<>();
    /**
     * While loop that continues until maxNumber is reached and the program exits.
     * If term is an odd number, the value is assigned to the variable oddNumber.
     * The sum of all odd numbers are calculated, and the odd number is added the the arraylist.
     * The numbers of the finobacci sequence is printed out.
     */
    while (termOne <= maxNumber) {
      System.out.print(termOne + ", ");
      if (termOne % 2 != 0) {
        oddNumber = termOne;
        sumOfOddNumbers += oddNumber;
        theList.add(termOne);
      } 
      /**
       * The finobacci sequence
       */
      int nextTerm = termOne + termTwo;
      termOne = termTwo;
      termTwo = nextTerm;
    }
    /**
     * Print out of the sum of all odd numbers, as well as the arraylist holding each odd number.
     */
    System.out.println();
    System.out.println("The sum of the odd valued terms are: " + sumOfOddNumbers);
    System.out.println("The odd numbers of the finobacci sequence: " + theList);
  }
}
