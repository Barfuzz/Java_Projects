package hb222xt_assign1;
/**
 * Program to present the exact number of swedish bills and coins returned in change.
 */
public class Payment {
  public static void main(String[] args) {
    /**
     * Variables for price, payment and change. Change is rounded to integer.
     * Price, payment and change is presented.
     */
    double price = 372.38;
    int payment = 1000;
    int change = payment - (int) price;
    System.out.println("Price: " + price + "kr");
    System.out.println("Payment: " + payment + "kr");
    System.out.println("Change: " + change + " kronor");
    /**
     * Integers to hold the number of bills.
     */
    int thousandsBills = 0;
    int fiveHundredBills = 0;
    int twoHundredBills = 0;
    int oneHundredBills = 0;
    int fiftyBills = 0;
    int twentyBills = 0;
    int tenCoins = 0;
    int fiveCoins = 0;
    int twoCoins = 0;
    int oneCoins = 0;

    /**
     * While change is larger than zero, loop continues. 
     * If change is larger or equals 500, the number of 500 bills is increased with the remaing value after division and modulus.
     * Same calculation is used for the different variables, e.g 200 bills, 100 bills etc.
     * Loop continues until change is zero and the result is presented.
     */
    while (change > 0) {
      if (change >= 500 ) {
        fiveHundredBills = change / 500;
        change = change % 500;
      } else if (change >= 200) {
        twoHundredBills = change / 200;
        change = change % 200;
      } else if (change >= 100) {
        oneHundredBills = change / 100;
        change = change % 100;
      } else if (change >= 50) {
        fiftyBills = change / 50;
        change = change % 50;
      } else if (change >= 20) {
        twentyBills = change / 20;
        change = change % 20;
      } else if (change >= 10) {
        tenCoins = change / 10;
        change = change % 10;
      } else if (change >= 5) {
        fiveCoins = change / 5;
        change = change % 5;
      } else if (change >= 2) {
        twoCoins = change / 2;
        change = change % 2;
      } else {
        oneCoins = change / 1;
        change = change % 1;
      }
    }
    System.out.println("1000kr bills: " + thousandsBills);
    System.out.println(" 500kr bills: " + fiveHundredBills);
    System.out.println(" 200kr bills: " + twoHundredBills);
    System.out.println(" 100kr bills: " + oneHundredBills);
    System.out.println("  50kr bills: " + fiftyBills);
    System.out.println("  20kr bills: " + twentyBills);
    System.out.println("  10kr coins: " + tenCoins);
    System.out.println("   5kr coins: " + fiveCoins);
    System.out.println("   2kr coins: " + twoCoins);
    System.out.println("   1kr coins: " + oneCoins);
  }
}
