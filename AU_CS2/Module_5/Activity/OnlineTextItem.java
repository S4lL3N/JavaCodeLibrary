/**
* OnlineTextItem class, creates a online text item for the inventory app.
* the class is derived from the InventoryItem class and also calculates the
* cost of the item.
*     
*
* Activity 5 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/
public abstract class OnlineTextItem extends InventoryItem {
   /**
      * OnlineTextItem Constructor. 
      * @param nameIn the name of item.
      * @param priceIn the price of item.
      */ 
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   /**
      * calculates the cost of item plus shipping. 
      * @return price the cost of item.
      */  
   public double calculateCost()  {
      return price;
   }
}