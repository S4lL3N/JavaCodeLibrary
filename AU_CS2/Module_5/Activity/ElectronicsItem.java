/**
* ElectronicsItem class, creates a electronic item for the inventory app.
* the class is derived from the InventoryItem class and also calculates
* the cost of item including shipping.
*     
*
* Activity 5 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/
public class ElectronicsItem extends InventoryItem {
/**
    *constant shipping costs by weight.
    */
   public static final double SHIPPING_COST = 1.5;
   protected double weight = 0;
   /**
      * ElectronicsItem Constructor. 
      * @param nameIn the name of item.
      * @param priceIn the price of item.
      * @param weightIn the weight of item.
      */ 
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
      * calculates the cost of item plus shipping. 
      * @return the cost of item plus shipping.
      */   
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }

}