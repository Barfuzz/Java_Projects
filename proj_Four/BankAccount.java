/**
 * Date: 2021-07-15
 * Filename: BankAccount.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign4;

import java.util.Scanner;
/**
 * Program that takes user input for creating a bank account and using try and catch if wrong input.
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class BankAccount {
  /**
   * Method that compares the string input by the user with regex to make sure the string has the right format,
   * which is one letter and three digits.
   * Return true or false depending on result.
   * 
   * @param s String, user input
   * @return Boolean
   */
  public static boolean isValid (String s) {
    
    if (s.matches("^[A-Za-z]{1,1}[0-9]{3,3}+$")) {
      return true;
    }
    return false;
  }
  /**
   * Similar to method isValid, but comparing using regex so that user input is seven numbers only.
   * Return true or false depending on result.
   * 
   * @param n String, user input
   * @return Boolean
   */
  public static boolean accountValid (String n) {
    if (n.matches("^[0-9]{7}+$")) {
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    System.out.println("Welcome to the bank of students, by the students and for the students!");
    /**
     * Declaration of variables
     */
    String customId = "";
    String accountNumber = "";
    int balance = 0;
    boolean customIdDone = false;
    boolean accountNumberDone = false;
    boolean balanceDone = false; 
    Scanner scan = new Scanner(System.in); 
    System.out.print("Enter customer ID: ");
    customId = scan.nextLine();
    /**
     * While loop as long as customID is not valid
     * Try if the custom ID entered by the user is valid. 
     * If not, exception is thrown and user is prompted to re-enter custom ID.
     */
    while (!customIdDone) {
      try {
        if (BankAccount.isValid(customId)) {
          customIdDone = true;
        } else {
          throw new AssertionError();
        }
      } catch (AssertionError e) {
        System.out.print("Incorrect customer ID. The customer ID must start with a letter folllwed by tree digits\nTry again: ");
        customId = scan.nextLine();
      }
    }
    /**
     * While loop as long as accountnumber is not valid
     * Try if the accountnumber entered by the user is valid. 
     * If not, exception is thrown and user is prompted to re-enter accountnumber.
     * Else, the loop breaks.
     */
    System.out.print("Enter account number: ");
    accountNumber = scan.nextLine();
    while (!accountNumberDone) {
      try {
        if (BankAccount.accountValid(accountNumber)) {
          accountNumberDone = true;      
        } else {
          throw new IllegalArgumentException();
        }
      } catch (IllegalArgumentException e) {
        System.out.print("The account number must be of seven digits.\nPlease enter again: ");
        accountNumber = scan.nextLine();
      } 
    }
    /**
     * While loop as long as balanceDone is false.
     * If balance is a valid number, balanceDone is true and loop breaks.
     * If balance is not valid, exception is thrown and user is prompted to re-enter the balance.
     * Else, the loop breaks.
     */
    System.out.print("Enter balance: ");
    balance = scan.nextInt();
    while (!balanceDone) {
      try {
        if (balance >= 1000) {
          System.out.println("Congrulatulations, your bankaccount has been created successfully");
          balanceDone = true;
        } else {
          throw new Exception();
        }
      } catch (Exception e) {
        System.out.print("Initial balance must be equal or to or higher than 1000.\nPlease enter again: ");
        balance = scan.nextInt();
      } 
    }
    System.out.println();
    System.out.println("Custumer ID: " + customId);
    System.out.println("Accountnumber: " + accountNumber);
    System.out.println("Balance: " + balance);
    scan.close();
  }
}
