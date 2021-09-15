   /**
* InventoryListApp class, the driver for the inventory app.
* creates a inventory list item, a electronics item, 
* online article, and a online book. the program then 
* prints the object data.
*     
*
* Activity 5
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/15/21
*/
public class InventoryListApp {
/**
    * The driver for inventory list app.
    * @param args not used.
    */
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(.05);
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.print(myItems.toString());
      
      System.out.print("\nTotal: " + myItems.calculateTotal(2.0));
   }
}