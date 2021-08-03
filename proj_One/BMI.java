package hb222xt_assign1;

import java.util.Scanner;

/**
 * A program that calculates the body mass index.
 * User inputs weight and height in pounds and inches.
 * Numbers are converted into kilograms and meters, then it calculates the BMI using a BMI-formula and prints the result
 */

public class BMI {
  public static void main(String[] args) {
    double weight;
    double height;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter weight in pounds: ");
    weight = scan.nextDouble();
    System.out.print("Enter height in inches: ");
    height = scan.nextDouble();
    double weightConvert = weight * 0.45359237;
    double heightConvert = height * 0.0254;
    double bmi = weightConvert / (heightConvert * heightConvert);
    System.out.printf("BMI is " + "%.4f", bmi);
    scan.close();
  }
}
