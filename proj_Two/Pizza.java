/**
 * Date: 2021-06-27
 * Filename: Pizza.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign2;

/**
 * 
 * @version 1.00 Jun 2021
 * @author Henrik Bergsten
 */
public class Pizza { 
  /**
   * Private variables for the pizza
   */
  private String size;
  private int numberOfCheeseTopping;
  private int numberOfPepperoniToppning;
  private int numberOfHamTopping;
  /**
   * Constructor for class Pizza with no parameters.
   */
  public Pizza () {
    this.size = "";
    this.numberOfCheeseTopping = 0;
    this.numberOfPepperoniToppning = 0;
    this.numberOfHamTopping = 0;
  }
  /**
   * Method that set the size of the pizza
   * @param pizzaSize The size of the pizza
   */
  public void setSize (String pizzaSize) {
    this.size = pizzaSize;
  }
  /**
   * Get method that returns the size of the pizza
   * @return String - the size of the pizza
   */
  public String getSize () {
    return size;
  }/**
   * Set method that set the value of numberOfCheeseToppings to the amount the user choose
   * @param cheese Number of cheese toppings
   */
  public void setCheeseTopping (int cheese) {
    this.numberOfCheeseTopping = cheese;
  }
  /**
   * Get method that returns the number of cheese toppings
   * @return Int - the number of cheese toppings
   */
  public int getCheeseTopping () {
    return numberOfCheeseTopping;
  }
  /**
   * Set method that set the value of numberOfPepperoniToppings to the amount the user choose
   * @param pepper Number of pepper toppings
   */
  public void setPepperoniTopping (int pepper) {
    this.numberOfPepperoniToppning = pepper;
  }
  /**
   * Get method that returns the number of pepperoni toppings
   * @return Int - the number of pepperoni toppings
   */
  public int getPepperoniTopping () {
    return numberOfPepperoniToppning;
  }
  /**
   * Set method that set the value of numberOfHamToppings to the amount the user choose
   * @param ham Number of ham toppings
   */
  public void setHamTopping (int ham) {
    this.numberOfHamTopping = ham;
  }
  /**
   * Get method that returns the number of ham toppings
   * @return Integer - number of ham toppings
   */
  public int getHamTopping () {
    return numberOfHamTopping;
  }
  /**
   * Method that return the total cost of the pizza.
   * Based on if statements and number of different toppings, if none, 0.0 returns.
   * @return - Double, the total cost of the pizza.
   */
  public double calcCost () {
    if (size.equals("SMALL")) {
      return 10 + (numberOfCheeseTopping + numberOfPepperoniToppning + numberOfHamTopping) * 3;
    } else if (size.equals("MEDIUM")) {
      return 15 + (numberOfCheeseTopping + numberOfPepperoniToppning + numberOfHamTopping) * 2.5;
    } else if (size.equals("LARGE")) {
      return 20 + (numberOfCheeseTopping + numberOfPepperoniToppning + numberOfHamTopping) * 2;
    } else {
      return 0.00; 
    }
  }
  /**
   * Method that returns a description of the order, including the total cost.
   * @return String 
   */
  public String getDescription () {
    if (numberOfCheeseTopping > 0 && numberOfPepperoniToppning < 1 && numberOfHamTopping < 1) {
      return "Thank you, you ordered a " + size.toLowerCase() + " pizza with " + numberOfCheeseTopping + " cheese toppings.\n"
      + "Your bill is " + calcCost() + " kr";
    } else if (numberOfCheeseTopping < 1 && numberOfPepperoniToppning > 0 && numberOfHamTopping < 1) {
      return "Thank you, you ordered a " + size.toLowerCase() + " pizza with " + numberOfPepperoniToppning + " pepperoni toppings.\n" 
      + "Your bill is " + calcCost() + " kr";
    } else
    return "Thank you, you ordered a " + size.toLowerCase() + " pizza with " + numberOfHamTopping + " ham toppings.\n" 
    + "Your bill is " + calcCost() + " kr";
   }
}

