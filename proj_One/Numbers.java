package hb222xt_assign1;

import java.util.Scanner;
/**
 * A program to caculate the sum and product of user input, wich is an three-digit integer.
 */
public class Numbers {
  public static void main(String[] args) {
    /**
     * Integers for user input, sum and product. Product is set to 1 since value multiplied with 0 equals 0
     */
    int userNumber;
    int sum = 0;
    int product = 1;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a three-digit integer number: ");
    userNumber = scan.nextInt();
    /**
     * While-loop that continues as long as userNumber is larger than zero.
     * Division and modulus is used to seperate the values from user input.
     * For each loop the remain is added to sum to get the total sum of the values.
     * For each loop the remain is multiplied with the product to get the total product of the values.
     * userNumbers is divided by ten each loop until loop breaks.
     * The the results are printed out.
     */
    while (userNumber > 0) {
      int remain = userNumber % 10;
      sum = sum + remain;
      product = product * remain;
      userNumber = userNumber / 10;
    }
    System.out.println("Sum of the digits of the integer number are " + sum);
    System.out.println("Product of the digits of the integer number are " + product);
    scan.close();
  }
}
