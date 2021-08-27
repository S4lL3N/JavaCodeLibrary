import java.util.Scanner;
/** 
* This program prompts the user to enter a character that represents a binary digit (a bit!). 
* Recall that a bit can be only 0 or 1. The program accepts a character as the input then outputs 
* the binary value of the character. If the character is not a bit the program informs the
* user that the character is not a bit and doesn't have a binary equivalent.
*
* Programming Assignment 1 - Programming Exercise 1
* @author  Shae Allen – CPSC-3300-AO1 
* @version 8/22/21
*/
public class Binary {
   public static void main(String[] args) {
     //scanner for user input.
      Scanner scan = new Scanner(System.in);
      //user input
      char input;
      //prompt user for character input.
      System.out.print("Enter a Character that represents a binary digit (a bit!): ");
      //check character for binary  equivalent.
      input = scan.next().charAt(0);
      if (input == '1' || input == '0'){
         //output binary  equivalent.
         System.out.print(input);
      }
      else {
         //Output no binary  equivalent.
         System.out.print("The character "+ input + " is invalid: " + input + " is not a bit.");
      }
      //close scanner
      scan.close();
   }
}
