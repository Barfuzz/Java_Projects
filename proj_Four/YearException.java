/**
 * Date: 2021-07-15
 * Filename: YearException.java
 * Author: Henrik Bergsten
 */
package hb222xt_assign4;
/**
 * Class YearException that extends the Exception class.
 * Syntax from https://www.codejava.net/java-core/exception/how-to-create-custom-exceptions-in-java
 * 
 * @version 1.00, Jul 2021
 * @author Henrik Bergsten
 */
public class YearException extends Exception {
  /**
   * Constructor with error message, wich is called in main method with e.getMessage()
   */
  public YearException () {
    super("Wrong year");
  }
}
