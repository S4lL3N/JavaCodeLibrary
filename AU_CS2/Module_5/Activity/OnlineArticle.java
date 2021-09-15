/**
* OnlineArticle class, creates a online article for the inventory app.
* the class is derived from the OnlineTextItem class and also sets the
* word count of the article.
*     
*
* Activity 5 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
      * OnlineArticle Constructor. 
      * @param nameIn the name of item.
      * @param priceIn the price of item.
      */ 
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;   
   }
   /**
      * sets the word count of article. 
      * @param wordCountIn the word count of article.
      */ 
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}