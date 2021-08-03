/**
 * Date: 2021-06-25
 * Filename: ArmstrongNumber.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign2;
import java.util.Scanner;

/**
 * Program that gives the armstrong number of between given range entered by user.
 * An armstrong number is an n-digit number that equals the som of the n^ power of digits.
 * A do-while loop is used to keep the program running until the user want to quit.
 * 
 * @version Jun 2021
 * @author Henrik Bergsten
 */
public class ArmstrongNumber {
  public static void main(String[] args) {
    /**
     * Declaration of variables.
     */
    String reply;
    int startNumber;
    int endNumber;
    int remainder;
    Scanner scan = new Scanner(System.in);
    do {
      System.out.print("Enter the starting number of the range: ");
      startNumber = scan.nextInt();
      System.out.print("Enter the ending number of the range: ");
      endNumber = scan.nextInt();
      /**
       * For-loop that runs within the range entered by the user.
       * Variables for check number and sum is initiated.
       */
      System.out.println("The armstrong numbers are: ");
      for (int i = startNumber + 1; i < endNumber; i++) {
        int theExp = 0;
        int sum = 0;
        int checkNumber = i;
        /**
         * While loop to determine the number of digits.
         * theExp is increased by the number of digits in the value.
         */
        while (checkNumber != 0) {
          checkNumber /= 10;
          ++theExp;
        }
        checkNumber = i;
        /**
         * While checknumber is larger then zero loop continues.
         * If sum equals i, the armstrong number is printed out
         * Math.pow is used to calculate base ^ exponent
         */
        while (checkNumber != 0) {
          remainder = checkNumber % 10;
          sum += Math.pow(remainder, theExp);
          checkNumber /= 10;
        }
        if (sum == i) {
          System.out.println(i);
        }
      }
      /**
       * Ask if the user wants to try agains. If Y, the program runs again. If anwser is anything else the program will break.
       */
      System.out.print("Do you want to repeat? (Y/N): ");
      reply = scan.next().toUpperCase(); 
    } while (reply.equals("Y"));
    scan.close();
  }
}

