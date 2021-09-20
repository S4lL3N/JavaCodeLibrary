/**
* Division class, creates a Division object.
* the class contains two methods for division,
* one integer division the other floating point/decimal.
*   
*
* Activity 6
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/20/21
*/ 
public class Division {
   /**
    * Calculates integer division.
    * @param numerator the numerator.
    * @param denominator the ominator.
    * @return int the result of division.
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
 /**
 * Calculates floating point/decimal division.
    * @param numerator the numerator.
    * @param denominator the denominator.
    * @return double the result of division.
    * @throws IllegalArgumentException if denominator is zero.
    */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator cannot be zero.");
      }
      return (double) numerator / denominator;
   }

}
