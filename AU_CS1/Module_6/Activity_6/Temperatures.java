import java.util.ArrayList;
/**
* This is the Temperatures Class, creates a Temperature list object.
* Temperatures has a array list attribute and has methods to 
* calculate the low and high temperatures plus getters and setters.
* 
* Activity 6
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/28/21
*/
public class Temperatures {
   //instance variables
   private ArrayList<Integer> temperatures = new ArrayList<>();
   
   
   //constructor
    /**
   * Temperature Constructor. 
   * @param temperaturesIn array list a for the temperatures.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   //getters and setters
   /**
    * Get's the low temperature.
    * @return low the lowest temperature in the list.
    */
   public int getLowTemp() {
   
      if (temperatures.isEmpty()) {
         return 0;
      }
      else {
         int low = temperatures.get(0);
         for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) < low) {
               low = temperatures.get(i);
            }
         }
         return low;
      }
   }
   /**
    * Get's the high temperature.
    * @return high the highest temperature in the list.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
   //methods
   /**
    * Checks the input temperature againts the list.
    * @param lowIn temperature to be compared.
    * @return lowIn the lower temperature after compared.
    */
   public int lowerMinimum(int lowIn) {
   
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
    * Checks the input temperature againts the list.
    * @param highIn temperature to be compared.
    * @return highIn the higher temperature after compared.
    */
   public int higherMaximum(int highIn) {
   
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   //to string
   /**
    * toString returns a string of the attribute data.
    * @return String attribute data 
    */
   public String toString() {
   
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
   
}