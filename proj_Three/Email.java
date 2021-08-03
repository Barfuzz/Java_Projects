/**
 * Date: 2021-07-05
 * Filename: Email.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;

/**
 * Class Email, extends and inheritates from Message class
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class Email extends Message {
  /**
   * Declaration of variables
   * Private String variables, only reachable within the class.
   */
  private String sender;
  private String reciever;
  private String subjectData;
  /**
   * Constructor Email, inheritates text from super class
   * @param text String - the message
   * @param senderMessage String
   * @param recieverMessage String
   * @param subjectDataMessage String
   */
  public Email (String text, String senderMessage, String recieverMessage, String subjectDataMessage) {
    super(text);
    this.sender = senderMessage;
    this.reciever = recieverMessage;
    this. subjectData = subjectDataMessage;
  }
  /**
   * Get and set methods for sender, reciever and subjectData
   * 
   * @return String
   */
  public String getSender () {
    return sender;
  }
  public void setSender (String theSender) {
    sender = theSender;
  }
  public String getReciever () {
    return reciever;
  }
  public void setReciever (String theReciever) {
    reciever = theReciever;
  }
  public String getSubjectData () {
    return subjectData;
  }
  public void setSubjectData (String theData) {
    subjectData = theData;
  }
  /**
   * Method for print out, including the message from the super class
   */
  @Override
  public String toString () {
    return "From: " + getSender() + "\nTo: " + getReciever() + "\nSubject: " + getSubjectData() + "\nMessage: "  + super.toString();
  }

}
