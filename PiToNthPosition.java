/**
 * 
 */
package Numbers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ayesha aziz
 *
 */

public class PiToNthDigit {
  
  final static BigDecimal PI = new BigDecimal(
      "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");

  /**
   * @param args
   */

  public static void main(String[] args) {

    System.out.println("Please enter the number of decimal places you want to see the value of PI (Maximum vaklue is 100).");
    Scanner scanner = new Scanner(System.in);
    
    boolean notANumber = true;
    int number = 0;
    
    //validates the user input to just proceed with a number.
    
    while (notANumber) {
      
      try {
        number = scanner.nextInt();
        notANumber = false;
      } catch (Exception e) {
        System.out.println();
        System.out.println("Please enter a number in between 1 and 100");
        
        scanner = new Scanner(System.in);
      }
    }
    
    // validates the range.
    int minNum = 1;
    int maxNum = 100;
    if ((number < minNum || number > maxNum) && notANumber == false) {
      System.out.println();
      System.out.println("Please enter a number in between 1 and 100");
      
    }

    //defining a pattern to be displayed.
      String pattern = "#.";
      
    //add the additional 0 to the pattern so that the pi value can be printed out.
      
      for (int i = 0; i <= number; i++) {
        pattern = pattern + "0";
      }
      //pass the pattern to the formatter to get a specified format
      
      DecimalFormat format = new DecimalFormat(pattern);
      
      System.out.println();
      System.out.println("PI to " + number + "decimal places is: " + format.format(PI) );
      
      scanner.close();
  }

}
