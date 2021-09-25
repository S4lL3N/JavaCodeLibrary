import java.text.DecimalFormat;
/**
* SharedCloud class, is derived from CloudStorage, and creates a cloud
* storage object. The class has methods to get and set the data stored 
* and the data limit along with the overage. The class also has a method
* to calculate the monthly cost.
* 
*     
*
* Project 4 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/

public class SharedCloud extends CloudStorage {

   //instance variables 
   protected double dataStored;
   protected double dataLimit;
   
   //constants 
   /**
   * The cost factor for shared cloud.
   */
   public static final double COST_FACTOR = 1.0;
   
   /**
      * SharedCloud Constructor. 
      * @param nameIn the name of item.
      * @param baseStorageCostIn the base cost.
      * @param dataStoredIn the data stored.
      * @param dataLimitIn the data stored.
      */ 
   //constructor
   public SharedCloud(String nameIn, double baseStorageCostIn,
                            double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn);
      dataStored = dataStoredIn;
      dataLimit = dataLimitIn;
   }
   
   //methods
 /**
    * Gets the data stored.
    * @return dataLimit the amount  of data stored.
    */
   public double getDataStored() {
      return dataStored;
   }
 /**
    * Sets the amount of data stored.
    * @param dataStoredIn the amount of data.
    */
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   }
 /**
    * Gets the data limit.
    * @return dataLimit the limit  of cloud storage.
    */
   public double getDataLimit() {
      return dataLimit;
   }
 /**
    * Sets the data limit.
    * @param dataLimitIn the limit of cloud storage.
    */
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
 /**
    * Gets the cost factor.
    * @return sharedCloud.COST_FACTOR the cost factor of cloud storage.
    */ 
   public double getCostFactor() { 
      return SharedCloud.COST_FACTOR; }
   
 /**
    * calculates the data overage.
    * @return over if the overage is greater than 0.
    */ 
   public double dataOverage() {
      double over = dataStored - dataLimit;
      if (over < 0) {
         return 0.0;
      }
      else {
         return over;
      }   
   }
   
 /**
    * calculates the monthly cost.
    * @return cost the monthly cost of cloud storage.
    */  
   public double monthlyCost() {
      double cost = baseStorageCost + dataOverage() * SharedCloud.COST_FACTOR;
      return cost;
   }
 /**
    * Outputs the cloud storage data.
    * @return output of cloud storage data.
    */

   public String toString() {
      DecimalFormat dataFormat = new DecimalFormat("0.000");
     
      String output = super.toString();
     
      output += "\nData Stored: " + dataFormat.format(getDataStored()) + " GB\n"
             + "Data Limit: " + dataFormat.format(getDataLimit()) + " GB\n"
             + "Overage: " + dataFormat.format(dataOverage()) + " GB\n" 
             + "Cost Factor: " + getCostFactor();
      return output;
   }
 
   
}