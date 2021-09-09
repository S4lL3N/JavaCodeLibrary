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
public class InventoryApp {
/**
    * The driver for inventory app.
    * @param args not used.
    */
   public static void main(String[] args) {
   
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
      System.out.print(item1 + "\n" 
                     + item2 + "\n"
                     + item3 + "\n"
                     + item4 + "\n");
      
      
   } 
}