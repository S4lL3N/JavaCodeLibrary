import java.util.Comparator;
 /**
* MonthlyCostComparator class, is a Comparator class.
* the class compares object based on monthly cost.
* 
*     
* Project 5 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/15/21
*/
public class MonthlyCostComparator implements Comparator<CloudStorage> {
/**
    * is the compare method of the class.
    * @param c1 is an examined object
    * @param c2 is an examined object
    * @return int
    */
   public int compare(CloudStorage c1, CloudStorage c2) {
      if (c1.monthlyCost() > c2.monthlyCost()) {
         return -1;
      }
      else if (c1.monthlyCost() < c2.monthlyCost()) {
         return 1;
      }
      else {
         return 0;
      }
   }

}