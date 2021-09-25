/**
* The InvalidCategoryException, defines a new subclass of the exception class.
*     
*
* Project 6 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/24/21
*/
public class InvalidCategoryException extends Exception {
/**
   * the constructor for the new exception.
   * @param categoryIn  the category.
   */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   
   }

}