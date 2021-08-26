import java.util.Scanner;

 /**
* A program is needed that inputs values of type double for x and y and solves 
* for the result of the indicated expression when xy is not equal to zero.  
* If xy is equal to zero, then the equal to zero, then the result is zero. 
*
* Project 2
* @author  Shae Allen – CPSC-1210-AO1 
* @version 5/29/21
*/
public class Expression 
{
   /**
   *
    * Outputs given expression, and promts user for the values of x and y.
    * Then outputs the result of the expression.
    * @param args Command line arguments – not used.
    */
     
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double x = 0.0;
      double y = 0.0;
      double result = 0.0;
      
      //output the formula assigned to result.
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      
      //prompt user for the valuse of x.
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      
      //prompt user for the valuse of y.
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      //check the values of x and y for 0.
      if (x == 0 || y == 0) {
         System.out.println("result is \"undefined\"");
         //System.exit(0);
         
         /*
         ***to exit program and match requested output 
         otherwise it outputs "result = Infinity" afterwards.
         Webcat grading doesn't like this***.
         */
      }
      
      //calculation of the  expression.
      result = ((10 * x) + 32.6) * ((5 * y) - 1.567) / (x * y);
      
      //output the result. 
      System.out.print("result = " + result);
      
      //close scanner 
      userInput.close();
   
   }
}