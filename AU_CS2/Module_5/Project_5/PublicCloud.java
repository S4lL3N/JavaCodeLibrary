/**
* PublicCloud class, is derived from SharedCloud, and creates a cloud
* storage object. The class has methods to get the cost factor and also
* has a method to calculate the monthly cost.
* 
*     
*
* Project 4 
* @author  Shae Allen � CPSC-1220-AO1 
* @version 9/08/21
*/
public class PublicCloud extends SharedCloud {
   //constants
   /**
   * The cost factor for public cloud.
   */

   public static final double COST_FACTOR = 2.0;
   /**
      * PublicCloud Constructor. 
      * @param nameIn the name of item.
      * @param baseStorageCostIn the base cost.
      * @param dataStoredIn the data stored.
      * @param dataLimitIn the data stored.
      */ 
   public PublicCloud(String nameIn, double baseStorageCostIn,
                            double dataStoredIn, double dataLimitIn) {
                            
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }
   
 //methods 
 /**
    * Gets the cost factor.
    * @return PublicCloud.COST_FACTOR the cost factor of cloud storage.
    */
   public double getCostFactor() { 
      return PublicCloud.COST_FACTOR; }
   
 /**
    * calculates the monthly cost.
    * @return cost the monthly cost of cloud storage.
    */  
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * PublicCloud.COST_FACTOR;
   }
}