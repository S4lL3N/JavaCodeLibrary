/**
* This is the NumberOperations, creates a UserInfo object.
* NumberOperation has a number attribute and getValue,  
* oddsUnder, powersTwoUnder, isGreater, and toString methods.
* 
* Activity 5
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/23/21
*/
public class NumberOperations {
   //Instance variables
   private int number;
   
   //constructor
   /**
   * UserInfo Constructor. 
   * @param numberIn the number.
   */ 
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   
   //getter
    /**
    * Get's number value.
    * @return output number value.
    */
   public int getValue() {
      return number; 
   }
  /**
    * Determines the odds under.
    * @return output number data. 
    */ 
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      } 
      return output;
   }
   /**
    * Determines the powers under two.
    * @return output number data. 
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; //concatenate output
         powers = powers * 2; //get the next power of 2 
      }
      return output;
   }
   /**
    * Determines if the number is greater.
    * @param compareNumber the number.
    * @return int 1 or 0. 
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    * toString returns a string of number data.
    * @return number number attribute data 
    */
   public String toString() {
      
      return number + " ";
   }

}
