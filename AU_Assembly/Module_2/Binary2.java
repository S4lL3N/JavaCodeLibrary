import java.util.Scanner;
/** 
* This program prompts the user to enter a String that represents a 16 bit binary digit. 
* Recall that a bit can be only 0 or 1. The program accepts a character as the input then outputs 
* the binary value of the string. 
*
* Programming Assignment 2 - Programming Exercise 1
* @author  Shae Allen – CPSC-3300-AO1 
* @version 8/29/21
*/
public class Binary2 {
   public static void main(String[] args) {
     //scanner for user input.
      Scanner scan = new Scanner(System.in);
      //user input
      String input;
      //prompt user for character input.
      System.out.print("Enter a string that represents a 16-bit  binary digit: ");
      //check character for binary  equivalent.
      input = scan.nextLine();
      int decimal = 0;
      
      //reverse string
      StringBuilder reversedInput = new StringBuilder();
      reversedInput.append(input);
   
      // reverse StringBuilder input1
      reversedInput.reverse();
      
      //raise to the power of index
      for (int i = 0; i < input.length(); i++) {
         if(reversedInput.charAt(i) == '1') {
            decimal += Math.pow(2,i);
         }
      }
      System.out.print("\nDEC = "+decimal);
      //close scanner
      scan.close();
   }
}
