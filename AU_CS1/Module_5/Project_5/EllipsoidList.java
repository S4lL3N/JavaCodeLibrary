import java.util.ArrayList;
import java.text.DecimalFormat;
 /**
* This is the Ellipsoid List Class, creates a Ellipsoid list object.
* Ellipsoid has name and array list attributes and has methods to 
* calculate the total surface area and total volume along with their
* averages plus getters and setters.
* 
* Project 5
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/25/21
*/
public class EllipsoidList {

   //instance variables):
   private String listName;
   private ArrayList<Ellipsoid> ellipsoids = new ArrayList<>();

   //constructor
    /**
   * Ellipsoid Constructor. 
   * @param listNameIn the name for the ellipsoidList.
   * @param ellipsoidsIn array list a for the ellipsoids.
   */
   public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> ellipsoidsIn) {
      listName = listNameIn;
      ellipsoids = ellipsoidsIn;
   }
   
   //project 6
   
   public String readFile(String fileNameIn) {
      System.out.print("working");
      return "";
   }
   
   
   
    /**
    * Get's the name.
    * @return listName the ellipsoid name.
    */
   public String getName() {
      return listName;
   }
    /**
    * Get's the number of ellipsoids.
    * @return ellipsoids.size() the total ellipsoids.
    */
   public int numberOfEllipsoids() {
      return ellipsoids.size();
   }
   /**
    * Calculates the total volume.
    * @return total ellipsoid total volume data. 
    */
   public double totalVolume() {
      int index = 0;
      double total = 0.0;
      while (index < ellipsoids.size()) {
         total += ellipsoids.get(index).volume();
         index++;
      }
      return total;
   }
   /**
    * Calculates the total surface area.
    * @return total ellipsoid surface area data. 
    */
   public double totalSurfaceArea() {
      int index = 0;
      double total = 0.0;
      while (index < ellipsoids.size()) {
         total += ellipsoids.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   /**
    * Calculates the average volume.
    * @return average the avg ellipsoid volume data. 
    */
   public double averageVolume() {
      double average;
      double total = totalVolume();
      if (total == 0) {
         return 0.0;
      }
      else {
         average = total / ellipsoids.size();
         return average;
      }
   }
   /**
    * Calculates the average  surface area.
    * @return average the avg ellipsoid surface area data. 
    */
   public double averageSurfaceArea() {
      double average;
      double total = totalSurfaceArea();
      if (total == 0) {
         return 0.0;
      }
      else {
         average = total / ellipsoids.size();
         return average;
      }
      
   }
    /**
    * toString returns a string of the attribute data.
    * @return output ellipsoid attribute data 
    */
   public String toString() {
      String output;
      int index = 0;
      output = getName() + "\n\n";
      while (index < ellipsoids.size()) {
         output += ellipsoids.get(index);
         output += "\n\n";
         index++;
      }
      return output;
   }
   /**
    * summaryInfo() output a string of the attribute data.
    * @return output ellipsoid list attribute summary. 
    */
   public String summaryInfo() {
      DecimalFormat formatResult = new DecimalFormat("#,##0.0##");
      String output;
      output = "----- Summary for " + getName() + " -----";
      output += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      output += "\nTotal Volume: " 
         + formatResult.format(totalVolume()) + " cubic units";
      output += "\nTotal Surface Area: " 
         + formatResult.format(totalSurfaceArea()) + " square units";
      output += "\nAverage Volume: " 
         + formatResult.format(averageVolume()) + " cubic units";
      output += "\nAverage Surface Area: " 
         + formatResult.format(averageSurfaceArea()) + " square units";
      return output;
   }
}