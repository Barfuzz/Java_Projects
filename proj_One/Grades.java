package hb222xt_assign1;

import java.util.Scanner;
/**
 * A program to present the grade, based on user input.
 * User enters the total amount of marks, then the user is asked to enter obtained marks.
 * Then the program present the grades, based on an precentage calculation of obtained mark and total marks.
 */
public class Grades {
  public static void main(String[] args) {
    /**
     * Integers for total marks, obtained marks and total score
     */
    int totalMarks;
    int marksObtained;
    int total;
    /**
     * Ask for user input, total marks. If user input is non-integer or negative, program breaks.
     */
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter total marks: ");
    if (scan.hasNextInt()) {
      totalMarks = scan.nextInt();
      if (totalMarks < 0) {
        System.out.println("You cant enter an negative integer");
        System.exit(0);
      } 
      /**
       * Ask for user input, obtained marks. If more than total marks, program breaks.
       */
      System.out.print("Please enter obtained marks: ");
      if (scan.hasNextInt()) {
        marksObtained = scan.nextInt();
        if (marksObtained > totalMarks) {
          System.out.println("You cant have more obtained marks than totalmarks");
          System.exit(0);
        }
        /**
         * Calculates percentage of total marks.
         * Different statements based on percentage gives different outputs. 
         */
        total = marksObtained * 100 / totalMarks;
        if (total < 60) {
          System.out.println("You could not pass this time, please try again. Your grade is F");
        } else if (total >= 60 && total <= 69) {
          System.out.println("Congratulations, you have passed the course with an E");
        } else if (total >= 70 && total <= 74) {
          System.out.println("Gongratulations, you have passed the course with an D");
        } else if (total >= 75 && total <= 79) {
          System.out.println("Gongratulations, you have passed the course with an C");
        } else if (total >= 80 && total <= 89) {
          System.out.println("Gongratulations, you have passed the course with an B");
        } else if (total >= 90) {
          System.out.println("Gongratulations, you have passed the course with an A");
        }
      } else {
        System.out.println("You need to enter an Integer");
      }
    } else {
      System.out.println("You need to enter an Integer");
    }
    scan.close();
  }
}
