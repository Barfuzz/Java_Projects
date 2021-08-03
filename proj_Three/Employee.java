/**
 * Date: 2021-07-04
 * Filename: Employee.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * Class inheritates from the class Person.java
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class Employee extends Person {
  /**
   * Declaration of variables
   */
  double salary;
  String hireDate;
  /**
   * Constructor
   * 
   * @param name String
   * @param adress String 
   * @param phoneNumber String
   * @param email String 
   * @param salary Double
   * @param hireDate String
   */
  public Employee (String name, String adress, String phoneNumber, String email, double salary, String hireDate) {
    super(name, adress, phoneNumber, email);
    this.salary = salary;
    this.hireDate = hireDate;
  }
  /**
   * Override method toString()
   * Print out Employee
   */
  @Override
  public String toString () {
    return "Name: " +getName() + " Adress: " + getAdress() + " Phonenumber: " + getPhoneNumber() + " Email: " + getEmail() +
    " Salary: " + salary + " Date hired: " + hireDate;
  }
}
