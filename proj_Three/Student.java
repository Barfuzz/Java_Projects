/**
 * Date: 2021-07-04
 * Filename: Student.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * Class student, inheritates from Person.java
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class Student extends Person {
  /**
   * Declatation of variable
   */
  String status;

  /**
   * Constructor
   * @param name String
   * @param adress String
   * @param phoneNumber String
   * @param email String
   * @param status String
   */
  public Student (String name, String adress, String phoneNumber, String email, String status) {
    super (name, adress, phoneNumber, email); // Inheritate from Person
    this.status = status;
  }
  /**
   * Override method toString().
   * Print out student
   */
  @Override
  public String toString () {
    return "Name: " + getName() + " Adress: " + getAdress() + " Phonenumber: " + getPhoneNumber() +
    " Email: " + getEmail() + " Status: " + status;
  }
}
