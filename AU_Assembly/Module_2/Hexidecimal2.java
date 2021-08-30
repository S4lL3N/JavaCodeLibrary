import java.util.Scanner;
   /** 
* This program prompts the user to enter a String that represents a 4 digit hexadecimal number. 
* Recall that hexadecimal digit can be only 0-9 and A-F. The program accepts a type String
* as the input then outputs the binsry and decimal value of the String/hexadecimal digit. If the
* character is not a hexadecimal digit the program informs the user that the character
* is not a hexadecimal digit and doesn't have a decimal equivalent.
*
* Programming Assignment 2 - Programming Exercise 2
* @author  Shae Allen – CPSC-3300-AO1 
* @version 8/29/21
*/
public class Hexidecimal2 {
   public static void main(String[] args){
   //scanner for user input.
      Scanner scan = new Scanner(System.in);
      //user input.
      String input = "X";
      int decimalValue = 0;
      String binary = "";
      boolean done = false;
      
      //loop to prompt user for info to make calculations or exit program.
      do {
         //prompt user for character input.
         System.out.print("\nEnter a String that represents a 4 digit hexadecimal number: ");
         input = scan.nextLine();
         char[] temp = new char[input.length()]; 
         
         for (int i = 0; i < input.length(); i++) {
            temp[i] = input.charAt(i);
         }
            
         for (int i = 0; i < 4; i++) {
            //switch statement to assign appropriate binary value.
            char switchChar = temp[i];
            
            switch (switchChar) {
               case '0':
                  
                  binary += "0000";
                  break;
               case '1':
                  
                  binary += "0001";
                  break;
               case '2':
                  
                  binary += "0010";
                  break; 
               case '3':
                  
                  binary += "0011";
                  break;   
               case '4':
                  
                  binary += "0100";
                  break;
               case '5':
                  
                  binary += "0101";
                  break;
               case '6':
                 
                  binary += "0110";
                  break;
               case '7':
                  
                  binary += "0111";
                  break;
               case '8':
                  binary += "1000";
                  break;
               case '9':
               
                  binary += "1001";
                  break;
               case 'A':
               
                  binary += "1010";
                  break;
               case 'B':
                  binary += "1011";
                  break;
               case 'C':
                  binary += "1100";
                  break;
               case 'D':
                  binary += "1101";
                  break;
               case 'E':
                  binary += "1110";
                  break;
               case 'F':
                  binary += "1111";
                  break;
               default:
                  //output for invalid input/not a hexadecimal number.
                  System.out.println("The String " + input + " is invalid: " + input + " is not a hexadecimal digit.\n"); 
                  break;
            }
             
         } 
         
         
         //reverse string
         StringBuilder reversedInput = new StringBuilder();
         reversedInput.append(binary);
      
         // reverse StringBuilder input1
         reversedInput.reverse();
         int decimal = 0;
         //raise to the power of index
         for (int i = 0; i < binary.length(); i++) {
            if(reversedInput.charAt(i) == '1') {
               decimal += Math.pow(2,i);
            }
         }
         //output data
         System.out.print("\n\tThe binary value = "+binary);
         System.out.print("\n\tThe Decimal value = "+ decimal + "\n\n");
         binary = "";
         decimal = 0;
         System.out.print("Would you like to convert another hexadecimal digit? (Y or N)");
         String strDone = scan.nextLine();
         if (strDone.equals("n") || strDone.equals("N") || strDone.equals("no")){
            done = true;
         }
      
      } while (!done);  
   }

}

