/**
 * Date: 2021-07-04
 * Filename: Person.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * General class Person
 * @version 1.00, Jun 2021
 * @author Henrik Bergsten
 */
public class Person {
  /**
   * Declaration of variables
   */
  String name;
  String adress;
  String phoneNumber;
  String email;
  
  /**
   * Constructor 
   * @param name String
   * @param adress String
   * @param phoneNumber String
   * @param email String
   */
  public Person (String name, String adress, String phoneNumber, String email) {
    this.name = name;
    this.adress = adress;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
  /**
   * Get methods for Person class
   * @return String: name, adress, phonenumber and email
   */
  public String getName () {
    return name;
  }
  public String getAdress () {
    return adress;
  }
  public String getPhoneNumber () {
    return phoneNumber;
  }
  public String getEmail () {
    return email;
  }
  @Override
  public String toString () {
    return "Name: " + getName() + " Adress: " + getAdress() + " Phonenumber: " + getPhoneNumber() + " Email: " + getEmail();
  }
}
