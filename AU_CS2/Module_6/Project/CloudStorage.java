import java.text.DecimalFormat;
/**
* CloudStorage class, is abstract and creates a cloud storage object.
* The class has methods to get and set the name and base storage cost.
* The class also has methods that get and reset the count and to calculate
* the monthly cost of the cloud storage service. 
* 
*     
*
* Project 5 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/15/21
*/
public abstract class CloudStorage implements Comparable<CloudStorage> {

   //Instance variabales 
   protected String name;
   protected double baseStorageCost;
   
   //class variables 
   protected static int count; 
   
   /**
      * CloudStorage Constructor. 
      * @param nameIn the name of cloud storage.
      * @param baseStorageCostIn the price of service.
      */ 
   //constructor 
   public CloudStorage(String nameIn, double baseStorageCostIn) {
      name = nameIn;
      baseStorageCost = baseStorageCostIn;
      count++;
   }
   
 //methods 
 /**
    * Gets cloud storage name.
    * @return name of cloud storage.
    */
   public String getName() {
      return name;
   }
   
 /**
    * Sets cloud storage name.
    * @param nameIn the name of cloud storage.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
 /**
    * Gets cloud storage base cost.
    * @return baseStorageCost cost of cloud storage.
    */
   public double getBaseStorageCost() {
      return baseStorageCost;
   }
   
 /**
    * Sets cloud storage base cost.
    * @param baseStorageCostIn cost of cloud storage.
    */
   
   public void setBaseStorageCost(double baseStorageCostIn) {
      baseStorageCost = baseStorageCostIn;
   }
   
 /**
    * Gets the number of cloud storage objects.
    * @return count number of cloud storage objects.
    */
   public static int getCount() {
      return count;
   }
   
 /**
    * Resets the number of cloud storage objects.
    */
   public static void resetCount() {
      count = 0;
   }
   
 /**
    * Outputs the cloud storage data.
    * @return output of cloud storage data.
    */
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
      
      String output = name + " (" + this.getClass() + ") " 
                     + "Monthly Cost: " 
                     + costFormat.format(monthlyCost()) + "\n"
                     + "Base Storage Cost: " 
                     + costFormat.format(getBaseStorageCost());
                     
      return output;
   }
   /**
   * Abstract method to calculate the monthly cost of service.
   * @return monthlyCost the monthly cost of the service.
   */
   public abstract double monthlyCost();
   
   
   //project 5 additions
    /**
    *  compares two cloudstorage objects.
       * @return int
       * @param other is the object to compare.
    */
   public int compareTo(CloudStorage other) {
      return name.toLowerCase().compareTo(other.getName().toLowerCase());
   }
   
}