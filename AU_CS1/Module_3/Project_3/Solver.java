
import java.util.Scanner;
import java.text.DecimalFormat;
/**
*  This program takes user input and solves for x for
*  a given expression. The program uses the pow(),
*  sqrt(), and abs(). 
*
* Project 3 part 1
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/8/21
*/
public class Solver 
{  /**
    *
    * Prompts user for input and solves for x.
    * @param args Command line arguments – not used.
    */

   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double xValue;
      double result;
      double numerator;
      double denominator;
      String outputResult;
      String temp;
      int charactersLeft;
      int charactersRight;
      int stringIndex;
      int stringLen;
      DecimalFormat formatResult = new DecimalFormat("#,##0.0####");
      
      
      //prompt user for input, store value for x
      System.out.print("Enter a value for x: ");
      xValue = Double.parseDouble(userInput.nextLine());
      
      //calculations
      numerator = 11 * Math.pow(xValue, 4); 
      numerator += 9 * Math.pow(xValue, 3); 
      numerator += 7 * Math.pow(xValue, 2);
      numerator += 5 * xValue + 4;
      numerator = Math.sqrt(Math.abs(numerator));
      
      denominator = 2 * xValue + 4;
      
      result = numerator / denominator;
      
      //get index of decimal and length
      outputResult = Double.toString(result);
      stringIndex = outputResult.indexOf(".");
      stringLen = outputResult.length();
      
      //left characters
      temp = outputResult.substring(0, stringIndex);
      charactersLeft = temp.length();
      //right characters
      temp = outputResult.substring(stringIndex);
      charactersRight = temp.length() - 1;
      
      //output
      System.out.println("Result: " + outputResult);
      System.out.println("# of characters to left of decimal point: "
         + charactersLeft);
      System.out.println("# of characters to right of decimal point: " 
         + charactersRight);
      System.out.println("Formatted Result: " + formatResult.format(result));
      
      //close scanner 
      userInput.close();
   }
}
