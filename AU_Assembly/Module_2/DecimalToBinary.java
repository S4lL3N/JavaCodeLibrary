import java.util.Scanner;
  /** 
* This program prompts the user to enter a positve integer between 0 up to 2^32 - 1 (4,294,967,295). 
* The program then preforms the bitwise operation to convert the deciaml to the binary equivalant
* of the interger.Then outputs a string representing the binary equivalent
* of the interger value.

*
* Programming Assignment 2 - Programming Exercise 3
* @author  Shae Allen – CPSC-3300-AO1 
* @version 8/22/21
*/
public class DecimalToBinary {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a positive integer between 0 - 2^32-1 (4,294,967,295) : ");
      int decimal = Integer.parseInt(scan.nextLine());
      conversion(decimal);
     
   }
   public static void conversion(int decimalIn) { 
      String binary = "";
      // Size of an integer is assumed to be 32 bits
      for (int i = 31; i >= 0; i--) {
         int k = decimalIn >> i;
         if ((k & 1) > 0)
            binary += "1";
         else
            binary += "0";
      }
         
         //remove unneeded 0s
      boolean first1 = false; 
      String result = "";
      for (int j = 0; j < binary.length(); j++) {
            //System.out.print("TEST = " + binary.charAt(j));
         char tempChar = binary.charAt(j);
         if(tempChar == '1') {
            first1 = true; 
         }
         if (first1 == true){
            result += binary.charAt(j);
         }
      }
       
      System.out.print("\n\tDecimal value = " + String.valueOf(decimalIn) + " \n\tBinary = " + result);
   
   }
}