/**
 * Date: 2021-06-21
 * Filename: DisplayMessage.java
 * Author: Henrik Bergsten
 */

package hb222xt_assign2;

/**
 * A program for printing out different messages. 
 * It has two set methods and one get method. 
 * 
 * @version 1.00 Jun 2021
 * @author Henrik Bergsten
 */
public class DisplayMessage {
  /**
   * Variables to hold the messegage and the count
   */
  int displayCount;
  String displayMessage;
  
  /**
   * Method that takes an String as parameter, and assign the value to the variable displayMessage
   * 
   * @param msg String
   */
  public void setDisplayMessage(String msg) {
    displayMessage = msg;
  }
  /**
   * Method that takes an Integer as parameter and assign the value to the variable displayCount
   * 
   * @param nr Integer
   */
  public void setDisplayCount(int nr) {
    displayCount = nr;
  }
  /**
   * Method for displaying the message.
   * Print out the displayMessage multiply times, based on the value of displayCount
   */
  public void display () {
      for (int i = 0; i < displayCount; i++) {
        System.out.println(displayMessage);
      }
  }
  /**
   * Method that overrides if both string and integer is set as parameter to the method
   * 
   * @param msg String
   * @param nr Integer
   */
  public void display(String msg, int nr) {
    displayMessage = msg;
    for (int i = 0; i < nr; i++) {
      System.out.println(msg);
    }
  }
  /**
   * Method that returns the current value of the variable displayMessage
   * 
   * @return String displayMessage
   */
  public String getDisplayMessage () {
    return displayMessage;
  }
  public static void main(String[] args) {
    DisplayMessage dm = new DisplayMessage(); // Creates a new object of the class DisplayMessage
    dm.setDisplayMessage("Hello 1DV532!"); // Call the method with a string as parameter
    dm.setDisplayCount(3); // Call the method with an integer as parameter
    dm.display(); // Call the method display, wich print out the result
    dm.display("Goodbye 1DV532!", 2); // Call the overriding method display with two parameters
    System.out.println("Current message: " + dm.getDisplayMessage()); // Print out the current displayMessage
  }
}
