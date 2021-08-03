/**
 * Date: 2021-07-05
 * Filename: Message.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * Super class Message, holds the message wich is sent as an parameter when creating objects of SMS and Email classes.
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class Message {
  /**
   * Declaration of variable
   */
  String text;
  /**
   * Constructor, using setText method for setting the message
   * @param theText String, the message
   */
  public Message (String theText) {
    setText(theText);
  }
  /**
   * Setter
   * @param t String
   */
  public void setText (String t) {
    this.text = t;
  }
  /**
   * Method for encoding the message sent into the method.
   * If the characters are alphabetical, encode it to the next letter.
   * If not, let character be as original, e.g @, ! 
   * @param msg Object, the message
   */
  public static void encode (Object msg) {
    String message = msg.toString();
    String encode = "";
    /**
     * For loop that encodes each character of the message
     */
    for (char c: message.toCharArray()) {
      if (Character.isAlphabetic((char)c)) {
        encode += Character.toString((char)(((c - 'a' + 1 ) % 26) + 'a')); // Increases each letter by one, a becomes b etc.
      } else if (!Character.isAlphabetic((char)c)) { // If letter is a special character, character is not encoded.
        encode += Character.toString((char)c);
      }
    }
    /**
     * Print out the encoded message
     */
    System.out.println(encode);
  }
  /**
   * Method for returning the message
   */
  public String toString () {
    return this.text;
  }
}
