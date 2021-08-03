/**
 * Date: 2021-06-21
 * Filename: SquareRoot.java
 * Author: Henrik Bergsten
 */

package hb222xt_assign2;
import java.util.Scanner;

/**
 * This program uses the babylonian algorithm to compute the square of a positive number.
 * The user is asked to enter a positive number, a do-while loop runs until the guess is within 1% 
 * of the previous guess. The program then print out the result.
 * 
 * @version 1 Jun 2021
 * @author Henrik Bergsten
 */
public class SquareRoot {
  public static void main(String[] args) {
    /**
     * Declaration of the variables 
     */
    double n;
    double guess;
    double r;
    double firstGuess; // Variable to hold the previous guess

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive value for n: ");
    n = scan.nextDouble();
    guess = n / 2;
    /**
     * Do-while loop that iterates until the guess is within 1% of the previous guess.
     * As the loop breaks, the result is printed out.
     */
    do {
      firstGuess = guess;
      r = n / guess;
      guess = (guess + r) / 2;
      System.out.println(guess);
    } while (guess <= firstGuess * 0.99 || guess >= firstGuess * 1.01);

    System.out.printf("The squareroot of %.2f is approximately %.2f\n", n, guess);
    
    scan.close();
  }
}
