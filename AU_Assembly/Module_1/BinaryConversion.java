import java.util.Scanner;
/** 
* This program prompts the user to enter a double that represents a positve integer between
* 0 up to 2^32 - 1 (4,294,967,295). the program then preforms the method of successive division by 2 to calculate
* the binary equivalant of the interger.Then outputs a string representing the binary equivalent
* of the interger value.

*
* Programming Assignment 1 - Programming Exercise 3
* @author  Shae Allen – CPSC-3300-AO1 
* @version 8/22/21
*/
public class BinaryConversion {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      double userInput;
      System.out.print("Enter a positive integer between 0 - 2^32-1 (4,294,967,295) : ");
      userInput = scan.nextInt();
      conversion(userInput);  
   }
   /**
    * Converts interger value to binary, using the
    * successive division by 2 method.
    * @param decimalNumber the integer  value to convert.
    */
   public static void conversion (double decimalNumber) {
      String number = Double.toString(decimalNumber);
      double temp;
      double mod;
      String output = "";
      /* loop while number is greater than zero divide by two,
       and if there is a remainder the bit in that position is equal to 1.
       if there is no remainder the value of the bin in that position is 0.
       */   
      while (decimalNumber > 0) {
         temp = decimalNumber / 2; 
         mod = decimalNumber % 2;
         if (mod != 0) {
            output = "1" + output;
         }
         else {
            output = "0" + output;
         }
         //cast double as a integer to remove remainder.
         decimalNumber = (int)temp;
      }
      //output the integer value as binary.
      System.out.print("Decimal " + number + " in binary = " + output);
   }
}