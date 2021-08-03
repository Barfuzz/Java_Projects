/**
 * Date: 2021-07-03
 * Filename: NoDuplicates.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;

import java.util.Scanner;
/**
 * Program that ask user for five different numbers, then present them in entered order and descending order.
 * Only values between 10 and 100 can be entered, else user is prompted if wrong number is entered.
 * User is also alerted if number has already been entered.
 * Method insertionSort takes an array as parameter and sort the array for descending order.
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class NoDuplicates {
  /**
   * Method that sort an array using reverse insertion sort to make the elements appear in descending order.
   * 
   * @param array Array of numbers
   */
  public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j = i;
      /**
       * Compare the variable temp with each element on the right until a larger element than it is found.
       */
      while (j > 0 && temp > array[j - 1]) {
        array[j] = array[j - 1];
        j--;
      }
      /**
       * Places temp before the element smaller than it
       */
      array[j] = temp;
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /**
     * Declaration of variables and array
     */
    int theArray[] = new int[5];
    int counter = 0;
    int n = 0;
    int number = 0;
    int nextNumber = 0;

    while (n < theArray.length) {
      System.out.print("Enter number " + ++nextNumber + ": ");
      number = scan.nextInt();
      /**
       * If entered number is between 10 and 100, the value is added to the array, else user is alerted.
       * Also if a number has already been entered, the user is prompted to enter number again.
       */
      if (number >= 10 && number <= 100) {
        boolean num = false;
        for (int i = 0; i < theArray.length; i++) {
          if (theArray[i] == number) {
            num = true;
          }
        }
        if (!num) {
          theArray[counter] = number;
          counter++;
          n++;
        } else {
          System.out.println("The number was entered before.");
          nextNumber--;
        }
      } else {
        System.out.println("The number must be between 10 and 100.");
        nextNumber--;
      }
      for (int i = 0; i < theArray.length; i++) {
        if (theArray[i] != 0) {
          System.out.print(theArray[i] + " ");
        }
      }
      System.out.println();
    }
    /**
     * Print out the numbers entered in order entered by the user.
     */
    System.out.print("Numbers in the entered order: ");
    for (int i = 0; i < theArray.length; i++) {
      System.out.print(theArray[i] + " ");
    }
    System.out.println();
    System.out.print("Number in sorted order: ");
    /**
     * Call the insertionSort method for sorting the array, then print out in descending order
     */
    insertionSort(theArray);
    for (int i = 0; i < theArray.length; i++) {
      System.out.print(theArray[i] + " ");
    }
    scan.close();
  }
}
