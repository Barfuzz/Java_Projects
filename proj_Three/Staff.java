/**
 * Date: 2021-07-04
 * Filename: Staff.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * Class inheritates from Employee.java
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class Staff extends Employee {
  /**
   * Declaration of variable
   */
  String title;
  /**
   * Constructor
   * 
   * @param name String 
   * @param adress String
   * @param phoneNumber String
   * @param email String
   * @param salary Double
   * @param hireDate String
   * @param title String
   */
  public Staff (String name, String adress, String phoneNumber, String email, double salary, String hireDate, String title) {
    super(name, adress, phoneNumber, email, salary, hireDate);
    this.title = title;
  }
  /**
   * Override method toString()
   * Print out Staff
   */
  @Override
  public String toString () {
    return "Name: " + getName() + " Adress: " + getAdress() + " Phonenumber: " + getPhoneNumber() + " Email: " + getEmail() + 
    " Salary: " + salary + " Hire date: " + hireDate + " Titel: " + title;
  }
}
