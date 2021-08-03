/**
 * Date: 2021-07-05
 * Filename: SMS.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * Class for SMS, extends and inheritates from Message class
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class SMS extends Message {
  /**
   * Declaration of variables
   */
  private String recipientContactNo; // String for printout contact number

  /**
   * Constructor SMS, inheritates text from super class
   * 
   * @param text String, the message
   * @param recipientContactNo String, contact number
   */
  public SMS (String text, String recipientContactNo) {
    super(text);
    this.recipientContactNo = recipientContactNo;
  }
  /**
   * Getter
   * @return String recipientContactNo
   */
  public String getRecipientContactNo () {
    return recipientContactNo;
  }
  /**
   * Setter 
   * @param r String
   */
  public void setRecipientContactNo (String r) {
    this.recipientContactNo = r;
  }
  /**
   * Method for print out, including the message from the super class
   */
  @Override
  public String toString () {
    return "Message: " + super.toString() + "\nFrom: " + getRecipientContactNo();
  }
}
