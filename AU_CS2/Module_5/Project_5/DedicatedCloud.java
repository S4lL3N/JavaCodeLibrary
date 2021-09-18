import java.text.DecimalFormat;
/**
* DedicatedCloud class, is derived from CloudStorage, and creates a cloud
* storage object. The class has methods to get and set the server cost
* and the monthly cost.
* 
*     
*
* Project 4 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/
public class DedicatedCloud extends CloudStorage {

   //instance variables 
   private double serverCost;
   
   /**
      * DedicatedCloud Constructor. 
      * @param nameIn the name of item.
      * @param baseStorageCostIn the base cost.
      * @param serverCostIn the server cost.
      */ 
   //constructor
   public DedicatedCloud(String nameIn, double baseStorageCostIn,
                                              double serverCostIn) {
      super(nameIn, baseStorageCostIn);
      serverCost = serverCostIn;
   }
   
 //methods 
 /**
    * Gets the  server cost .
    * @return serverCost the server cost.
    */ 
   public double getServerCost() {
      return serverCost;
   }
 /**
    * Sets the server cost.
    * @param serverCostIn the server cost.
    */
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
 /**
    * calculates the monthly cost.
    * @return total of the monthly cost.
    */ 
   public double monthlyCost() {
      double total = baseStorageCost + serverCost;  
      return total;
   }
 /**
    * Outputs the cloud storage data.
    * @return output of cloud storage data.
    */ 
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00"); 
      String output = super.toString();
      output += "\nServer Cost: " + costFormat.format(serverCost);
      return output;
   }
    
}