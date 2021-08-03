/**
 * Date: 2021-06-27
 * Filename: PizzaMain.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign2;
import java.util.Date;
import java.util.Scanner;
/**
 * PizzaMain hold the main method and are used to create new pizza objects from Pizza.java.
 * User is asked to choose size of the pizza, what kind of topping and the amount of topping.
 * Based on the user input, the order is printed out with current time and date.
 * 
 * @version 1.00, Jun 2021
 * @author Henrik Bergsten
 */
public class PizzaMain {
  public static void main(String[] args) {
    /**
     * Declaration of variables
     */
    String size;
    String typeOfTopping;
    int cheese;
    int pepperoni;
    int ham;
    /**
     * Creates new objects of the class Pizza
     */
    Pizza pepperoniPizza = new Pizza();
    Pizza hamPizza = new Pizza();
    Pizza cheesePizza = new Pizza();
    /**
     * Create a new object of the class Date and print out date and time
     */
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println();
    Scanner scan = new Scanner(System.in);
    /**
     * Ask user for pizzasize, topping and amount of topping
     */
    System.out.println("Welcome to the Café LNU!\n");
    System.out.print("Please enter the size of your pizza [small, medium, large]: ");
    size = scan.nextLine().toUpperCase();
    System.out.print("Please enter the type of topping [cheese, pepperoni or ham]: ");
    typeOfTopping = scan.nextLine().toUpperCase();
    System.out.print("Please enter the number of toppings that you want: ");
    /**
     * If statements based on user input.
     * If cheese topping is chosen, object cheesePizza call the methods setSize, setCheeseTopping with size and number
     * of cheese toppings from user input as parameters.
     * Print out the order with getDescription method.
     * 
     * Same if statements are used for the ham and pepperoni toppings.
     */
    if (typeOfTopping.equals("CHEESE")) {
      cheese = scan.nextInt();
      cheesePizza.setSize(size);
      cheesePizza.setCheeseTopping(cheese);
      System.out.println(cheesePizza.getDescription());
    }
    if (typeOfTopping.equals("PEPPERONI")) {
      pepperoni = scan.nextInt();
      pepperoniPizza.setSize(size);
      pepperoniPizza.setPepperoniTopping(pepperoni);
      System.out.println(pepperoniPizza.getDescription());
    }
    if (typeOfTopping.equals("HAM")) {
      ham = scan.nextInt();
      hamPizza.setSize(size);
      hamPizza.setHamTopping(ham);
      System.out.println(hamPizza.getDescription());
    }
    scan.close();
  }
}
