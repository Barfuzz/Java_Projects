/**
 * Date: 2021-06-25
 * Filename: SweID.java
 * Author: Henrik Bergsten
 */

package hb222xt_assign2;
import java.util.Scanner;
/**
 * This program ask user for a swedish ID-number. The user is the asked to enter the same number again
 * to check if they are equal. If not, program exits.
 * If they are equal, program checks if it belongs to a male or female, if the date is correct and if last digit, 
 * the checknumber is correct and print out the result
 * 
 * @version 1.00, Jun 2021
 * @author Henrik Bergsten
 */
public class SweID {

  /**
   * Method to get the first six values of the ID-number
   * For-loop until character '-', then the first six values are stored in variable firstPart
   * 
   * @param sweID String that hold the ID-number
   * @return The first six values of the string
   */
  public static String getFirstPart(String sweID) {
    String firstPart = "";
    for (int i = 0; i < sweID.length(); i++) {
      if (sweID.charAt(i) == '-') 
        break;
        firstPart += sweID.charAt(i);
      
    }
    return firstPart;
  }
  /**
   * Method to get the last four values of the ID-number.
   * For-loop that runs starts from the start of the last four characters 
   * and end when last character is added to the variable secondPart
   * 
   * @param sweID - String that holds the ID-number
   * @return The last four values of the ID-number
   */
  public static String getSecondPart(String sweID) {
    String secondPart = "";
    for (int i = 7; i < sweID.length(); i++) {
      secondPart += sweID.charAt(i);
    }
    return secondPart;
  }
  /**
   * Method that checks if the ID-number is a female ID-number.
   * 
   * @param sweID String that holds the ID-number
   * @return True if the ID-number is an female ID-number
   */
  public static boolean isFemaleNumber(String sweID) {
    int nr9 = sweID.charAt(9);
    if (nr9 % 2 != 0 ) {
      return false;
    }
    return true;
  }
  /**
   * Boolean method that compare each character of the two strings.
   * If the characters are not equal, return false. 
   * If the characters are equal, return true.
   * 
   * @param id1 First string that holds the ID
   * @param id2 Second string that holds the ID
   * @return False if the Strings are not equal, true if they are
   */
  public static boolean areEqual(String id1, String id2) {
    for (int i = 0; i < id1.length(); i++) {
      if (id1.charAt(i) != id2.charAt(i)) {
        return false;
      }
    }
    return true;
  }
  /**
   * Method to check if the date in the ID is set correct.
   * Using the getFirstPart-method to split paramterer into first six digits of the ID.
   * Converting to integer and use substring to get the month and day values.
   * 
   * The method does not take to account leap year, only the max number of days in february
   * 
   * @param sweID String that holds the ID
   * @return True if the date is set correct, otherwise false
   */
  public static boolean areCorrect(String sweID) {
    int month = Integer.parseInt(getFirstPart(sweID).substring(2, 4));
    int day = Integer.parseInt(getFirstPart(sweID).substring(4, 6));
    if (month == 2) {
      if (day < 1 || day > 29) {
        return false;
      }
    }
    if (month < 1 || month > 12) {
      return false;
    } else if (day < 1 || day > 31) {
      return false;
    } 
    return true;
  }
  /**
   * Method for checking if the last number in the ID is correct using the Luhn-algoritm.
   * https://en.wikipedia.org/wiki/Luhn_algorithm
   * Each value in the string sweID is converted to int using parseInt and substring, and then assigned to a new variable.
   * Using if condition and modulus to seperate numbers if the product is <= 10.
   * 
   * @param sweID String that holds the ID
   * @return True if last digit in ID is correct, otherwise false
   */
  public static boolean isValid(String sweID) {
    int a = Integer.parseInt(getFirstPart(sweID).substring(0, 1));
    int b = Integer.parseInt(getFirstPart(sweID).substring(1, 2));
    int c = Integer.parseInt(getFirstPart(sweID).substring(2, 3));
    int d = Integer.parseInt(getFirstPart(sweID).substring(3, 4));
    int e = Integer.parseInt(getFirstPart(sweID).substring(4, 5));
    int f = Integer.parseInt(getFirstPart(sweID).substring(5, 6));
    int g = Integer.parseInt(getSecondPart(sweID).substring(0, 1));
    int h = Integer.parseInt(getSecondPart(sweID).substring(1, 2));
    int i = Integer.parseInt(getSecondPart(sweID).substring(2, 3));
    int lastNumber = Integer.parseInt(getSecondPart(sweID).substring(3));
    int restA = 0;
    int restC = 0;
    int restE = 0;
    int restG = 0;
    int restI = 0;
    a *= 2;
    if (a >= 10) {
      restA = a % 10;
      a -= restA;
      a /= 10;
    }
    c *= 2;
    if (c >= 10) {
      restC = c % 10;
      c -= restC;
      c /= 10;
    }
    e *= 2;
    if (e >= 10) {
      restE = e % 10;
      e -= restE;
      e /= 10;
    }
    g *= 2;
    if (g >= 10) {
      restG = g % 10;
      g -= restG; 
      g /= 10;
    }
    i *= 2;
    if (i >= 10) {
      restI = i % 10;
      i -= restI;
      i /= 10;
    }
    int sum = a + restA + b  + c + restC + d  + e + restE + f + g + restG + h + i + restI;
    int correctID = (10 - (sum % 10)) % 10;
    if (lastNumber == correctID) {
      return true;
    }
    return false;
  } 
  /**
   * Main method
   * 
   * User is asked to enter a swedish ID-number, and enter the same number once again.
   * If the numbers are equal, correct and valid, the number and gender is printed out.
   * Else, if numbers are not correct and valid, a message that states unvalid last digit 
   * or unvalid month or day is printed out.
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your swedish ID-number as YYMMDD-NNNN: ");
    String numberOne = scan.nextLine();
    System.out.print("Enter your swedish ID-number as YYMMDD-NNNN again: ");
    String numberTwo = scan.nextLine();
    if (numberOne.length() == 11 && numberTwo.length() == 11) {
      /** 
       * If and else statements to check if ID is correct, equal and what gender
       */
      if (areEqual(numberOne, numberTwo)) {
        if (isFemaleNumber(numberOne)) {
          if(areCorrect(numberOne)) {
            if (isValid(numberOne)) {
              System.out.println(numberOne + " is a correct and valid female number");
            } else if (!isValid(numberOne)) {
              System.out.println(numberOne + " is not a correct number (unvalid last digit)");
            }
          } else {
            System.out.println(numberOne + " is not a correct number (unvalid month or day");
          }
        }
        if (!isFemaleNumber(numberOne)) {
          if(areCorrect(numberOne)) {
            if (isValid(numberOne)) {
              System.out.println(numberOne + " is a correct and valid male number");
            } else if (!isValid(numberOne)) {
              System.out.println(numberOne + " is not a correct number (unvalid last digit)");
            }
          } else {
            System.out.println(numberOne + " is not a correct number (unvalid month or day)");
          }
        }
      } else {
        System.out.println("Sorry, the ID-numbers are not equal. Program will exit, please try again");
        System.exit(0);
      }
    } else {
    System.out.println("Wrong format, program will exit. Try again");
    System.exit(0);
    }
    scan.close();
  }
}
