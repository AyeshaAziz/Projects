/**
 * Problem Statement:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
package numbers;

import java.util.Scanner;

/**
 * @author ayesha aziz
 *
 */
public class MultiplesOf3and5 {

  private static int number;
  private static int sum = 0;
  
  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the upper limit for the sum value: ");
    
    number = reader.nextInt();
    
    for (int i = 0; i < number; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum = sum + i;
      }
    }
    System.out.println("The sum of all multiples of 3 and 5 below " + number + " are: " + sum); 
    
    reader.close();
  }
}
