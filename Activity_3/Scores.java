/**
* Scores Class, creates a Scores object.
* integer array numbers attribute and findEvens, findOdds,
* calculateAverage, and reverseString methods.    
*
* Activity 3 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/31/21
*/

public class Scores {
   private int[] numbers;
   
  //constuctor
   /**
   * Scores Constructor. 
   * @param numbersIn the scores.
   */ 
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
   * finds the even numbers in list. 
   * @return evens the even scores.
   */ 
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      } 
      
      return evens;
   }
    /**
   * finds the odd numbers in list. 
   * @return odds the odd scores.
   */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      } 
      return odds;
   }
   /**
   * calculates the average of the numbers in list. 
   * @return result the average of scores.
   */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
         
      }
      return sum / Double.valueOf(numbers.length);
   }
  /**
  * toString returns a string of scores data.
  * @return result Scores attribute data. 
  */
   public String toString() {
      String result = "";
     
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   /**
   * reverse the string of numbers/scores. 
   * @return result the reversed string of numbers/scores.
   */
   public String toStringInReverse() {
      String result = "";
      
      for (int j = numbers.length - 1; j >= 0; j--) {
         result += numbers[j] + "\t";
      }
      return result; 
   }
   
}