/**
 * Date: 2021-07-05
 * Filename: MessagingMain.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * Class with main method.
 * Object of each class is created.
 * Message is encoded and the encoded message is printed out.
 * Each object is then printed out using overriding toString methods, print out includes original message.
 */
public class MessagingMain {
  
  public static void main(String[] args) {
    /**
     * Create objects of each class, including the message.
     * Print out of the encoded message via encode()
     * Message.text is sent to email and sms-objects and printed out, and message
     */
    Message message = new Message("The lion sleeps has entered our club, please make them go away.");
    Email email = new Email(message.toString(), "Carol@rocksteady.org", "Andy@theZoo.com", "Lions at the club");
    SMS sms = new SMS(message.toString(), "+46732678325");  
    
    System.out.println("-- Message --\n");
    System.out.println(message.toString());
    System.out.println();

    System.out.println("-- Encrypted Message --\n");
    System.out.println("From Message class: ");
    Message.encode(message + "\n");
    System.out.println("From Email class: ");
    Email.encode(message + "\n");
    System.out.println("From SMS class: ");
    SMS.encode(message + "\n");
    System.out.println();
    System.out.println("-- Email --");
    System.out.println(email.toString());
    System.out.println();
    System.out.println("-- SMS --");
    System.out.println(sms.toString());
    System.out.println();
  }
}
