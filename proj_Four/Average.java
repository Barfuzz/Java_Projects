/**
 * Date: 2021-07-23
 * Filename: Average.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.*;

/**
 * Program for calculation of average of an amount of numbers entered by the user.
 * User is promted to enter how many numbers to enter.
 * If negative or zero, user is prompted to enter number again.
 * Then user is promted to enter values to calculate average.
 * If not an integer, user is prompted to enter number again.
 * 
 * Try and catch to catch error and let user enter number again.
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class Average {
  public static void main(String[] args) {
    /**
     * Declaration of variables and scanner object.
     */
    Scanner scan = new Scanner(System.in);
    boolean correctN = false;
    int n;
    System.out.print("How many numbers do you want to enter? \nEnter here: ");
    n = scan.nextInt();
    /**
     * While loop until correctN is true.
     */
    while (!correctN) {
      try {
        if (n > 0) {
          correctN = true;
        } else {
          throw new NumberFormatException();
        }
      } catch (NumberFormatException e) {
        System.out.println("Number must be greater than 0");
        System.out.println("How many number do you want to enter?");
        n = scan.nextInt();
      }
    }
    boolean filledArray = false;
    int total = 0;
    /**
     * arrayOfNumbers, wich has the size entered by the user, n.
     */
    int[] arrayOfNumbers = new int[n];
    /**
     * Do while loop with a for loop inside to fill array with the numbers entered by the user.
     * Try / catch to validate user input. If not an integer, user is prompted to re-enter number.
     */
    do {
      for (int i = 0; i < arrayOfNumbers.length; i++) {
        System.out.print("Enter number " + (i + 1) + ": ");
        try {
          arrayOfNumbers[i] = scan.nextInt();
        } catch (InputMismatchException e) {
          System.out.println("You entered a non-numberic value wich is not allowed");
          System.out.println("Please enter number again.");
          scan.nextLine(); // clear the scanner
          --i; // decrease count
          total -= arrayOfNumbers[i]; // decrease from total
        }
        total += arrayOfNumbers[i]; // add to total
        /**
         * If array is filled, filledArray is true and exit loop
         */
        if (i == arrayOfNumbers.length - 1) {
          filledArray = true;
        }
      }
    } while (!filledArray);
    /**
     * Print out average, using DecimalFormat to get two decimals on the average value
     */
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Average of the entered numbers is " + df.format(total / n).replaceAll("\\.00$", ""));
    scan.close();
  }
}
