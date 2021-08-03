/**
 * Date: 2021-07-10
 * Filename: Numbers.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign4;

import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;
/**
 * Program that reads the values from the file numbers.txt and store them in array.
 * There after, the average of the numbers are calculated, as the standard deviation.
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class Numbers {
  public static void main(String[] args) throws IOException { 
    /**
     * Declaration of variables and the input stream for reading the file numbers.txt
     * Try and catch if the file is not found.
     */
    int[] theArray = new int[22];
    String file = "numbers.txt";
    Scanner inputStream = null;
    int k = 0;
    try {
      inputStream = new Scanner(new FileInputStream(file));
    } catch (FileNotFoundException e) {
      System.out.println("File " + file + " was not found");
      System.out.println("or could not be opened");
      System.exit(0);
    }
    /**
     * Printwriter to create a txt file, analysis.txt
     * Try and catch if unable to write to file
     */
    PrintWriter output = null;
    FileOutputStream fileOS;
    try {
      fileOS = new FileOutputStream("analysis.txt");
      output = new PrintWriter(fileOS);
    } catch (FileNotFoundException e) {
      System.out.println("Error writing to file analysis.txt");
      System.exit(0);
    }
    /**
     * While there´s still number to read, add to array
     */
    while (inputStream.hasNext()) {
      theArray[k] = inputStream.nextInt();
      k++;
    }

    /**
     * Calculate and print average to console and analysis.txt
     */
    int sum = IntStream.of(theArray).sum(); // Calculate the sum of the array
    double average = sum / theArray.length;
    String averageOutput = "Average: " + average;
    System.out.println(averageOutput);
    output.println(averageOutput);

    /**
     * Formula for caclulating the standard deviation of the numbers in the array
     */
    double powerSumOne = 0;
    double powerSumTwo = 0;
    double stdDeviation = 0;
    for (int i = 0; i < theArray.length; i++) {
      powerSumOne += theArray[i];
      powerSumTwo += Math.pow(theArray[i], 2);
      stdDeviation = Math.sqrt(i * powerSumTwo - Math.pow(powerSumOne, 2)) / i;
    }
    /**
     * Print out standard deviation to console and to analysis.txt
     */
    String devOutput = "Standard deviation: " + stdDeviation;
    output.println(devOutput);
    System.out.println(devOutput);
    
    /**
     * Close in and out stream
     */
    inputStream.close();
    output.close();
  }

}
