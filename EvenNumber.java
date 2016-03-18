package bitManipulation;

/**
 * @author ayesha aziz
 *
 */
import java.util.Scanner;

public class EvenNumber {
  
  public static void main(String[] args) {

    int number;
    
    //Take input from the user.
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    number = input.nextInt();

    // if the msb = 0 then the number is even. 
    
    if ((number&1)==0) {
         
    System.out.println("Number: " + number + " is an Even number." );
     } else {
       System.out.println("Number: " + number + " is an Odd number." );
     }
    input.close();
  }
}
