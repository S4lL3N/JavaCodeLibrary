 /**
* InventoryApp class, the driver for the inventory app.
* creates a inventory item, a electronics item, 
* online article, and a online book. the program then 
* prints the object data.
*     
*
* Activity 4 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0.0;
   /**
      * InventoryItem Constructor. 
      * @param nameIn the name of item.
      * @param priceIn the price of item.
      */ 
   //constructor 
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
      
   }
/**
    * Gets inventory item name.
    * @return name of inventory item.
    */
   public String getName() {
      return name;
   }
   
 /**
    * Calculates the cost of inventory item.
    * @return price of inventory item.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
 /**
    * Sets the tax rate of inventory item.
    * @param taxRateIn the tax rate of inventory item.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
 /**
    * Outputs the inventory item data.
    * @return output of inventory item data.
    */
   public String toString() {
      String output = name + ": $" + calculateCost();
      return output;
   
   }
}