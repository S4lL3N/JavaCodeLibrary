import java.util.ArrayList;
import java.text.DecimalFormat;  
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
         if (index < ellipsoids.size() - 1) {
            output += "\n\n";
         }
         else{
            output += "\n";
         } 
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
   
   /*
   ****************************************************************************
   Project 6 additions
   ****************************************************************************
   */
   
    /**
    * Get's the arraylist of ellipsoids.
    * @return ellipsoids the arraylist ellipsoids.
    */
   public ArrayList getList(){
      return ellipsoids;
   }
   
   /**
    * Scans in a file of ellipsoids and adds to list.
    * @param fileNameIn the name for the ellipsoidList.
    * @return ellipsoidsList the ellipsoid list object. 
    */
   public EllipsoidList readFile(String fileNameIn) 
                                    throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String input;
      listName = scanFile.nextLine();
      String label;
      double valueA, valueB, valueC;
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         input = scanFile.nextLine();
         valueA = Double.parseDouble(input);
         input = scanFile.nextLine();
         valueB = Double.parseDouble(input);
         input = scanFile.nextLine();
         valueC = Double.parseDouble(input);
         
         Ellipsoid ellipsoid = new Ellipsoid(label, valueA, valueB, valueC);
         ellipsoids.add(ellipsoid);
      }
     
      scanFile.close();
      EllipsoidList ellipsoidsList= new EllipsoidList(listName, ellipsoids);
            
      return ellipsoidsList;
   }
   /**
    * Creates a ellipsoid and adds it to the list.
    * @param labelIn the name for the ellipsoid.
    * @param valueAIn value "a" for the ellipsoid.
    * @param valueBIn value "b" for the ellipsoid.
    * @param valueCIn value "c" for the ellipsoid.
    */
   public void addEllipsoid(String labelIn, String valueAIn,String valueBIn,String valueCIn) {
   
      String label = labelIn;
      double valueA =  Double.parseDouble(valueAIn); 
      double valueB =  Double.parseDouble(valueBIn); 
      double valueC =  Double.parseDouble(valueCIn);
      
      Ellipsoid ellipsoid = new Ellipsoid(label, valueA, valueB, valueC);
      ellipsoids.add(ellipsoid);
   }
   /**
    * Searches the ellipsoidList for label name.
    * @param labelIn the name to seach for.
    * @return foundEllipsoid the found ellipsoid object. 
    */
   public Ellipsoid findEllipsoid(String labelIn) {
      Ellipsoid foundEllipsoid = null;
      for (Ellipsoid value : ellipsoids) {
         if (labelIn.equalsIgnoreCase(value.getLabel())) {
            foundEllipsoid = value;
         }
      }
      return foundEllipsoid;
   }
   /**
    * Searches the ellipsoidList for label name then deletes.
    * @param labelIn the name to seach for.
    * @return foundEllipsoid the found/deleted ellipsoid object. 
    */
   public Ellipsoid deleteEllipsoid(String labelIn) {
      int index = -1;
      Ellipsoid foundEllipsoid = null;
      for (Ellipsoid value : ellipsoids) {
         if (labelIn.equalsIgnoreCase(value.getLabel())) {
            foundEllipsoid = value;
            index = ellipsoids.indexOf(value);
         }
      }
      if (index >= 0) {
         ellipsoids.remove(index);
      }
      return foundEllipsoid;
   }
    /**
    * Edits a ellipsoid in the list.
    * @param labelIn the name for the ellipsoid.
    * @param valueAIn value "a" for the ellipsoid.
    * @param valueBIn value "b" for the ellipsoid.
    * @param valueCIn value "c" for the ellipsoid.
    * @return foundEllipsoid the edited ellipsoid object.
    */
   public Ellipsoid editEllipsoid(String labelIn, String valueAIn,String valueBIn,String valueCIn) {
      Ellipsoid foundEllipsoid = null;
      double valueA =  Double.parseDouble(valueAIn); 
      double valueB =  Double.parseDouble(valueBIn); 
      double valueC =  Double.parseDouble(valueCIn);
      
      for (Ellipsoid value : ellipsoids) {
         if (labelIn.equalsIgnoreCase(value.getLabel())) {
            value.setA(valueA);
            value.setB(valueB);
            value.setC(valueC);
            foundEllipsoid = value;
         }
      }
      return foundEllipsoid;
   }
    
}