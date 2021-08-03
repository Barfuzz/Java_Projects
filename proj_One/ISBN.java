package hb222xt_assign1;

import java.util.Scanner;

/**
 * A program to calculate the checksum of an ISBN-10 number.
 */

public class ISBN {
  public static void main(String[] args) {
    /**
     * Integers to keep track each number in the ISBN
     */
    int numberOne;
    int numberTwo;
    int numberThree;
    int numberFour;
    int numberFive;
    int numberSix;
    int numberSeven;
    int numberEight;
    int numberNine;

    /**
     * Asking user for an ISBN as integer, only first nine numbers.
     * If user input is an integer the program will start, else it will exit with an message.
     */

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    if (scan.hasNextInt()) {
      int tempISBN = scan.nextInt();

    /**
     * Using division and modulus to seperate the user input to single integers and store the values in variables
     */

      numberOne = tempISBN / 100000000 % 10;
      numberTwo = tempISBN / 10000000 % 10;
      numberThree = tempISBN / 1000000 % 10;
      numberFour = tempISBN / 100000 % 10;
      numberFive = tempISBN / 10000 % 10;
      numberSix = tempISBN / 1000 % 10;
      numberSeven = tempISBN / 100 % 10;
      numberEight = tempISBN / 10 % 10;
      numberNine = tempISBN % 10;

    /**
     * Calculating the checksum of the ISBN-10 and print out the result.
     * If checksum equals 10, X is added to the ISBN-10.
     */

      int sumCheck; 
      char theX = 'X'; // Character to use if the sumcheck equals 10
      sumCheck = (numberOne * 1 + numberTwo * 2 + numberThree * 3 + numberFour * 4 + numberFive * 5 + numberSix * 6 + numberSeven * 7 + numberEight * 8 + numberNine * 9) % 11;
      if (sumCheck != 10) {
        System.out.println("The ISBN-10 number is: " + tempISBN + sumCheck);
      } else {
        System.out.println("The ISBN-number is: " + tempISBN + theX);
      }
    } else {
      System.out.println("You need to enter an integer as input");
      System.exit(0);
    }
    scan.close();
  }
}
