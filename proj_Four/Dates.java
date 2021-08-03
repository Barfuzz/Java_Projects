package hb222xt_assign4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Dates {
  /**
   * Declaration of variables
   */
  private int month;
  private int day;
  private int year;

  /**
   * Default constructor
   */
  public Dates () {
    month = 1;
    day = 1;
    year = 1000;
  }
  /**
   * Constructor that takes three arguments; month, day and year
   */
  public Dates (int theMonth, int theDay, int theYear) {
    month = theMonth;
    day = theDay;
    year = theYear;
  }

  /**
   * Setter for month
   * @param m, int the month
   */
  public void setMonth (int m) {
    this.month = m;
  }
  /**
   * Getter for month
   * @return int, the month
   */
  public int getMonth () {
    return this.month;
  }
  /**
   * Setter for day
   * @param d, int the day
   */
  public void setDay (int d) {
    this.day = d;
  }
  /**
   * Getter for day
   * @return int, the day
   */
  public int getDay () {
    return this.day;
  }
  /**
   * Setter for year
   * @param y int, the year
   */
  public void setYear (int y) {
    this.year = y;
  }
  /**
   * Getter for year
   * @return int, the year
   */
  public int getYear () {
    return this.year;
  }
  /**
   * Method that check the date if it is leap year or not.
   * Formula for calulating leap year taken from https://newbedev.com/java-algorithm-for-leap-year-java-code-example
   * @param int y, the year
   * @return Boolean
   */
  public static boolean leapYear (int y) {
    if (y % 4 != 0) {
      return false;
    } else if (y % 400 == 0) {
      return true;
    } else if (y % 100 == 0) {
      return false;
    } else {
      return true;
    }
  }
  /**
   * Method for verifying the day entered by user is valid
   * @return Boolean
   */
  public boolean checkDay () {
    // Check for months with 31 days
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && day >= 1 && day <= 31) {
      return true;
      // and for months with 30 days
    } else if (month == 4 || month == 6 || month == 9 || month == 11 && day >= 1 && day <= 30) {
      return true;
    } else if (month == 2 && day >= 1 && day <= 28) {
      return true;
      // Uses leayYear method to check if leapyear.
    } else if (month == 2 && day >= 1 && day <= 29 && leapYear(year)) {
      return true;
    }
    return false;
  }
  /**
   * Method to verify the month entered by user is valid
   * @return Boolean
   */
  public boolean checkMonth () {
    if (month >= 1 && month <= 12) {
      return true;
    }
    return false;
  }
  /**
   * Method to verify the year entered by the user is valid
   * @return
   */
  public boolean checkYear () {
    if (year >= 1000 && year <= 2500) {
      return true;
    }
    return false;
  }
  /**
   * Method that throw exception if checkday is false
   * @throws DayException
   */
  public void validDay () throws DayException {
    if (!checkDay()) {
      throw new DayException();
    }
  }
  /**
   * Method that throw exception if checkmonth is false
   * @throws MonthException
   */
  public void validMonth () throws MonthException {
    if (!checkMonth()) {
      throw new MonthException();
    }
  }
  /**
   * Method that throw exception if checkyear is false
   * @throws YearException
   */
  public void validYear () throws YearException {
    if (!checkYear()) {
      throw new YearException();
    }
  }
  /**
   * Method for printing out the date with the name of the month
   * 
   * @return String, the date
   */
  public String toString () {
    if (month == 1) {
      return "January " + day + ", " + year;
    } else if (month == 2) {
      return "February " + day + ", " + year;
    } else if (month == 3) {
      return "March " + day + ", " + year;
    } else if (month == 4) {
      return "April " + day + ", " + year; 
    } else if (month == 5) {
      return "May " + day + ", " + year;
    } else if (month == 6) {
      return "June " + day + ", " + year;
    } else if (month == 7) {
      return "July " + day + ", " + year;
    } else if (month == 8) {
      return "August " + day + ", " + year;
    } else if (month == 9) {
      return "September " + day + ", " + year;
    } else if (month == 10) {
      return "October " + day + ", " + year;
    } else if (month == 11) {
      return "November " + day + ", " + year;
    } else if (month == 12) {
      return "December " + day + ", " + year;
    } else
    return "Something went wrong";
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /**
     * Declaration of variables
     */
    String theDate = "";
    boolean dayChecked = false;
    boolean monthChecked = false;
    boolean yearChecked = false;

    System.out.print("Enter date in format MM/DD/YYYY: ");
    theDate = scan.nextLine();

    /**
     * Using StringTokenizer to seperate month, day and year by removing "/" and save month, day and year into seperate variables
     * https://www.javatpoint.com/string-tokenizer-in-java
     */
    StringTokenizer theToken = new StringTokenizer(theDate, "/");
    String theMonth = theToken.nextToken();
    String theDay = theToken.nextToken();
    String theYear = theToken.nextToken();

    /**
     * Using parseInt to convert strings to int and save them into new variables.
     */
    int theMonthInt = Integer.parseInt(theMonth);
    int theDayInt = Integer.parseInt(theDay);
    int theYearInt = Integer.parseInt(theYear);

    /**
     * New object dates with int variables as parameters
     */
    Dates dates = new Dates(theMonthInt, theDayInt, theYearInt);

    /**
     * While loop that continue as long as the month is not valid.
     * If not valid, MonthException is cast and user is prompted to enter month again
     */
    while(!monthChecked) {
      try {
        dates.validMonth();
        monthChecked = true;
      } catch (MonthException e) {
        System.out.print(e.getMessage() + ", try again: ");
        dates.setMonth(scan.nextInt());
      }
    }
    /**
     * While loop that continue as long as the day is not valid.
     * If not valid, DayException is cast an user is prompted to enter day again
     */
    while(!dayChecked) {
      try {
        dates.validDay();
        dayChecked = true;
      } catch (DayException e) {
        System.out.print(e.getMessage() + ", try again: ");
        dates.setDay(scan.nextInt());
      }
    }
    /**
     * While loop that continues as long as the year is not valid.
     * If not valid, YearException is cast an user is promted to enter year again
     */
    while(!yearChecked) {
      try {
        dates.validYear();
        yearChecked = true;
      } catch (YearException e) {
        System.out.print(e.getMessage() + ", try again: ");
        dates.setYear(scan.nextInt());
      }
    }
    /**
     * Using toString method to print out the date enter by the user in format e.g January 1, 2021
     */
    System.out.println("The date is " + dates.toString());
    scan.close();
  }
}
