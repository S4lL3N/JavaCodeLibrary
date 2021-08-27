import java.util.Scanner;
   /** 
* This program prompts the user to enter a character that represents a hexadecimal digit. 
* Recall that hexadecimal digit can be only 0-9 and A-F. The program accepts a type character
* as the input then outputs the decimal value of the character/hexadecimal digit. If the
* character is not a hexadecimal digit the program informs the user that the character
* is not a hexadecimal digit and doesn't have a decimal equivalent.
*
* Programming Assignment 1 - Programming Exercise 2
* @author  Shae Allen – CPSC-3300-AO1 
* @version 8/22/21
*/
public class Hexidecimal {
   public static void main(String[] args){
   //scanner for user input.
      Scanner scan = new Scanner(System.in);
      //user input.
      char input = 'X';
      int decimalValue = 0;
      //loop to prompt user for info to make calculations or exit program.
      do {
         //prompt user for character input.
         System.out.print("Enter a character that represents a hexadecimal digit: \n(press \"X\" to exit): ");
         input = scan.nextLine().toUpperCase().charAt(0);
         //switch statement to assign appropriate decimal value.
         switch (input) {
            case '0':
               decimalValue = 0;
               break;
            case '1':
               decimalValue = 1;
               break;
            case '2':
               decimalValue = 2;
               break; 
            case '3':
               decimalValue = 3;
               break;   
            case '4':
               decimalValue = 4;
               break;
            case '5':
               decimalValue = 5;
               break;
            case '6':
               decimalValue = 6;
               break;
            case '7':
               decimalValue = 7;
               break;
            case '8':
               decimalValue = 8;
               break;
            case '9':
               decimalValue = 9;
               break;
            case 'A':
               decimalValue = 10;
               break;
            case 'B':
               decimalValue = 11;
               break;
            case 'C':
               decimalValue = 12;
               break;
            case 'D':
               decimalValue = 13;
               break;
            case 'E':
               decimalValue = 14;
               break;
            case 'F':
               decimalValue = 15;
               break;
            case 'X':
               System.out.println("\nClosing Application...");
               break;
            default:
               //output for invalid input/not a hexadecimal number.
               System.out.println("The character " + input + " is invalid: " + input + " is not a hexadecimal digit.\n");
               decimalValue = -1; 
               break;
         }
         //Check if user input and output conversion. 
         if (decimalValue != -1 && input != 'X') {
            System.out.println("\tThe hexidecimal value of " + input + " equals a decimal value of "+ decimalValue + "\n");
         }
        //loops until user chooses to close program. 
      } while (input != 'X');
   }  
}
