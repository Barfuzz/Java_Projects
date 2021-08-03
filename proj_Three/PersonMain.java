/**
 * Date: 2021-07-04
 * Filename: PersonMain.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign3;
/**
 * Class PersonMain, creates new object of Person.java and subclasses.
 * Overriding method toString() for printing out each subclass
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class PersonMain {
  public static void main(String[] args) {
    Person p = new Person ("Harry", "Bridgestreet 15", "07000345213", "Harry@Barry.com");
    System.out.println(p.toString());
    Student s = new Student ("Mandy", "Horrorway 2", "098-2345214", "Mandy@Sandy.com", "Senior");
    System.out.println(s.toString());
    Employee e = new Employee("Carla", "Boygate 432", "5432-12345", "Calra@SithGate.com", 25.0, "2001-12-21");
    System.out.println(e.toString());
    Faculty f = new Faculty("Barry", "Goldenstate 44", "0100-2345212", "Barry@Sanfran.com", 12.5, "2008-01-20", "9-16", "Master officer");
    System.out.println(f.toString());
    Staff staff = new Staff("Cassandra", "Fifthstreet 5", "+4523496543", "Cassy@newway.com", 10.4, "1994-05-01", "CEO");
    System.out.println(staff.toString());
  }
}
