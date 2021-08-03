/**
 * Date: 2021-07-03
 * Filename: Dices.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;

import java.util.Random;
/**
 * Program that simulates rolling of two dices with random values.
 * The dices are rolled 10000 times and the result is presented to the user, with sum and frequency of the different rolls.
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten.
 */
public class Dices {
  public static void main(String[] args) {
    /**
     * Declaration of variables
     * Array to hold the count of the different values
     * 
     */
    int dieOne;
    int dieTwo;
    int sum = 0;
    int arrayOfValues[] = new int[11];
    int number = 1;
    Random roll = new Random();
    /**
     * For loop that runs 10000 times, each time the dices are rolled and the values is saved into sum.
     * If sum is equal to a certain value, it´s element in arrayOfValues is increased.
     * Using Random object to get random numbers for the dices.
     */
    for (int i = 0; i < 10000; i++) {
      dieOne = roll.nextInt(6) + 1;
      dieTwo = roll.nextInt(6) + 1;
      sum = dieOne + dieTwo;
      if (sum == 2) {
        arrayOfValues[0]++;
      } else if (sum == 3) {
        arrayOfValues[1]++;
      } else if (sum == 4) {
        arrayOfValues[2]++;
      } else if (sum == 5) {
        arrayOfValues[3]++;
      } else if (sum == 6) {
        arrayOfValues[4]++;
      } else if (sum == 7) {
        arrayOfValues[5]++;
      } else if (sum == 8) {
        arrayOfValues[6]++;
      } else if (sum == 9) {
        arrayOfValues[7]++;
      } else if (sum == 10) {
        arrayOfValues[8]++;
      } else if (sum == 11) {
        arrayOfValues[9]++;
      } else if (sum == 12) {
        arrayOfValues[10]++;
      }
    }
    /**
     * Print out the result
     */
    System.out.println("Frequency table (sum, count) for rolling two dices 10000 times is: ");
    for (int i = 0; i < arrayOfValues.length; i++) {
      System.out.println(++number + "         " + arrayOfValues[i]);
    }
  }
}
