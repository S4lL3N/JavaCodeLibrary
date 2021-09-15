 /**
* OnlineBook class, creates a online book for the inventory app.
* the class is derived from the OnlineTextItem class and also sets the
* author of the book.
*     
*
* Activity 5 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/
public class OnlineBook extends OnlineTextItem {

   protected String author;
   
   /**
      * OnlineBook Constructor. 
      * @param nameIn the name of item.
      * @param priceIn the price of item.
      */ 
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
      * Set the aurthor of the book. 
      * @param nameIn the name of aurthor.
      */ 
   public void setAuthor(String nameIn) {
      author = nameIn;
   }
   
   /**
    * Outputs the online book data.
    * @return output of online book data.
    */
   public String toString() {
      String output = name + " - " + author + ": $" + calculateCost();
      return output;
   }
}