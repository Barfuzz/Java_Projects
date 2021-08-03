/**
 * Date: 2021-07-04
 * Filename: Faculty.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * Class inheritates Faculty.java
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class Faculty extends Employee {
  /**
   * Declaration of variables
   */
  String office;
  String rank;
  /**
   * Constructor 
   * 
   * @param name String
   * @param adress String
   * @param phoneNumber String
   * @param email String
   * @param salary Double
   * @param hireDate String
   * @param office String
   * @param rank String
   */
  public Faculty (String name, String adress, String phoneNumber, String email, double salary, String hireDate, String office, String rank) {
    super(name, adress, phoneNumber, email, salary, hireDate);
    this.office = office;
    this.rank = rank;
  }
  /**
   * Override method toString()
   * Print out Faculty
   */
  @Override
  public String toString () {
    return "Name: " + getName() + " Adress: " + getAdress() + " Phonenumber: " + getPhoneNumber() + " Email: " + getEmail() + 
    " Salary: " + salary + " Hire date: " + hireDate + " Office: " + office + " Rank: " + rank;
  }
}
