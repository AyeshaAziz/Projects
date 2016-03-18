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

   evenCheckWithAndOperator(number);
   evenCheckWithShiftOperator(number);
    
    input.close();
  }
  
  public static void evenCheckWithAndOperator(int number) {

    System.out.println("==== Using AND Operator ====" );

    // if the msb = 0 then the number is even. 
    
    if ((number&1)==0) {
         
    System.out.println("Number " + number + ": is an Even number." );
     } else {
       System.out.println("Number " + number + ": is an Odd number." );
     }
  }
/*
 * Lets do this 2 >> 1
  2 means 010 so now we need to shift right side by 1 place
  010
  -----
  001
  Here we added one "0" to the left side to shift right 
  So the value became 1
  Now will try left shift  001 >> 1
  001
  ----
  010
  010<<1=001(1) and 001 >> 001=010(2)
  By this we can say if a (number >>1)<<1 gives same then that is even number. result=input
  Lets check for odd number 3
  011>>1=001 which is 1 and 001<<1=010 which is 2 so (3>>1)>>1=2 so result!=input
 */
  public static void evenCheckWithShiftOperator(int number) {
    
    System.out.println();
    System.out.println("==== Using Shift Operator ====" );

    if ((number>>1)<<1 == number) {
      System.out.println("Number " + number + ": is an Even number." );
    } else {
      System.out.println("Number " + number + ": is an Odd number." );
    }
   }
}
