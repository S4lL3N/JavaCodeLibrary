  /**
* ItemsList class, creates a list of inventory items for the inventory app.
*     
*
* Activity 5
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/15/21
*/
public class ItemsList {

   private InventoryItem[] inventory;
   private int count;
   /**
   * ItemsList Constructor. 
   */ 
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0; 
   }
   /**
   * adds items to the list. 
   * @param itemIn the item to add to list. 
   */ 
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
   * calculates the total cost of items in list. 
   * @param electronicsSurcharge surcharge of electronic item.
   * @return total the total cost of items. 
   */  
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total; 
   }
   /**
    * Outputs the items in list data.
    * @return output of items in list data.
    */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n"; 
      }
      return output;
   }
}