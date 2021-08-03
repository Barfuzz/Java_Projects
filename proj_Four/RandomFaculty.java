/**
 * Date: 2021-07-19
 * Filename: RandomFaculity.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Class for the employees
 * Used for filling arraylist with objects of the employees
 */
class Employees {
  /**
   * Declaration of variables
   */
  String firstName;
  String lastName;
  String title;
  double salary;
  /**
   * Constructor
   * @param firstName String
   * @param lastName String
   * @param title String
   * @param salary Double
   */
  public Employees (String firstName, String lastName, String title, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.title = title;
    this.salary = salary;
  } 
  /**
   * Method toString used for print out
   */
  public String toString () {
    return firstName + " " + lastName + " " + title + " " + salary;
  }
}
/**
 * Program that creates a text file of 1000 lines with random facultys with random salaries.
 * The program then reads from the text file, sort out the associates and print out the associates with lowest and highest salaries.
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class RandomFaculty {

  public static void main(String[] args) {
    String[] titles = {"assistant", "associate", "full"}; // Array holding the titles
    /**
     * Declaration of variables
     */
    Random rand = new Random();
    int assistPayLow = 50000;
    int assistPayHigh = 80000;
    int associatePayLow = 60000;
    int associatePayHigh = 110000;
    int fullPayLow = 75000;
    int fullPayHigh = 130000;
    double assistantPayRandom;
    double associatePayRandom;
    double fullPayRandom;
    PrintWriter output = null;
    FileOutputStream fileOs;
    /**
     * Try catch, catch if file can not be written to.
     * Create a text file with 1000 lines and fill it with different faculty members with random salaries.
     * Using Math.random to generate random salaries within a given interval.
     */
    try {
      fileOs = new FileOutputStream("faculty.txt");
      output = new PrintWriter(fileOs);
      int n = 1000;
      String firstName = "FirstName";
      String lastName = "LastName";
      /**
       * For loop that write lines to faculty.txt until 1000 is reached, then loop breaks.
       * Random generator for both titles and salary.
       */
      for (int i = 1; i <= n; i++) {
        String title = titles[rand.nextInt(3)];
        assistantPayRandom = assistPayLow + (Math.random() * (assistPayHigh - assistPayLow));
        if (title.equals("assistant")) {
          output.println(firstName + i + " " + lastName + i + " " + title + " " + Math.round(assistantPayRandom * 100.0) / 100.0 );
        } else if (title.equals("associate")) {
          associatePayRandom = associatePayLow + (Math.random() * (associatePayHigh - associatePayLow));
          output.println(firstName + i + " " + lastName + i + " " + title + " " + Math.round(associatePayRandom * 100.0) / 100.0);
        } else {
          fullPayRandom = fullPayLow + (Math.random() * ( fullPayHigh - fullPayLow));
          output.println(firstName + i + " " + lastName + i + " " + title + " " + Math.round(fullPayRandom * 100.0) / 100.0);
        }       
      }
    } catch (IOException e) {
      System.out.println("Unable to write to file");
      System.exit(0);
    }
    /**
     * Declaration of variables, including the file to read from.
     */
    String file = "faculty.txt";
    double salary = 0;
    String nameOne;
    String nameTwo;
    String theTitle;
    BufferedReader br = null;
    /**
     * Arraylists to hold the Employees objects, and a double list used for comparison of salaries
     */
    ArrayList<Employees> associateList = new ArrayList<Employees>();
    ArrayList<Double> doubleList = new ArrayList<>();
    try {
      br = new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
    }
    String line;
    /**
     * While there is still lines to read from file, while loop continues, adding values to both arraylists
     * Creates a new Employees object for the associateList for each line read.
     */
    try {
      while ((line = br.readLine()) != null) {
        if (line.contains("associate")) {
          String employeeDetail[] = line.split(" "); // Split each value of the line 
          nameOne = employeeDetail[0];
          nameTwo = employeeDetail[1];
          theTitle = employeeDetail[2];
          salary = Double.valueOf(employeeDetail[3]);
          doubleList.add(salary);
          associateList.add(new Employees(nameOne, nameTwo, theTitle, salary));
        }
      }
      Collections.sort(doubleList); // Sort the list of salaries
    } catch (IOException e) {
      System.out.println("ERROR");
    }
    /**
     * Variables for getting the lowest and highest salaries of the associates
     */
    double low = doubleList.get(0);
    double high = doubleList.get(doubleList.size() - 1);
    System.out.println("List of associates: ");
    /**
     * Print out the result with the highest and lowest salary for associate.
     * If low equals the salary of employees object, print out.
     * If high equals the salary of employees object, print out.
     * Also print out all associates.
     */
    System.out.println("All associates:");
    for (Employees k : associateList) {
      System.out.println(k);
    }
    System.out.println("-------------------------------------------");
    System.out.println();
    for (Employees employees : associateList) {
      if (low == employees.salary) {
        System.out.println("The associate with the lowest salary: ");
        System.out.println();
        System.out.println(employees.toString());
        System.out.println("--------------------------------------");
        System.out.println();
      }
      if (high == employees.salary) {
        System.out.println("The associate with the highest salary: ");
        System.out.println();
        System.out.println(employees.toString());
        System.out.println("---------------------------------------");
        System.out.println();
      }
    }
  }
}
