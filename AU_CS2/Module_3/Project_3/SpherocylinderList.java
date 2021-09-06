import java.text.DecimalFormat;
/**
* SpherocylinderList, creates a SpherocylinderList object.
* SpherocylinderList has ListName, scList, and scNumber attributes.
* SpherocylinderList class has methods to get the name, calculate
* total/average surface area and volume, the number of Spherocylinder objs.
* along with methods to find, edit and delete Spherocyliner objects from
* the SpherocylinderListand find the Spherocylinder with the largest volume.
* 
*
*
* Project 3 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/31/21
*/
public class SpherocylinderList {
//instance variables 
   private String listName = "";
   private  Spherocylinder[]  scList;
   private int scNumber = 0;
   
//constructor
/**
* SpherocylinderList construtor.
* @param listNameIn is name.
   * @param scListIn is array of Spherocylinder objs. 
 * @param scNumberIn number of Spherocylinder objs.
   */
   public SpherocylinderList(String listNameIn, 
                     Spherocylinder[] scListIn, int scNumberIn) {
                                                      
      listName = listNameIn;
      scList = scListIn;
      scNumber = scNumberIn;
         
   }
/**
* gets the liat name.
   * @return listName of list name.
   */
   public String getName() {
      return listName;
   }
/**
* gets the number of objects in list.
   * @return scNumber the number of objects in list.
   */
   public int numberOfSpherocylinders() {
      return scNumber;
   }
/**
* calculates the total surface area.
   * @return surfaceArea the total surface area.
   */
   public double totalSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < scNumber) {
         surfaceArea += scList[i].surfaceArea();
         i++;
      }
      return surfaceArea;
   }
/**
* calculates the total volume.
   * @return volume the total volume.
   */
   public double totalVolume() {
      double volume = 0;
      int i = 0;
      while (i < scNumber) {
         volume += scList[i].volume();
         i++;
      }
      return volume;
   }
/**
* calculates the average surface area.
   * @return surfaceArea the average surface area.
   */
   public double averageSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < scNumber) {
         surfaceArea += scList[i].surfaceArea();
         i++;
      }
      if (scNumber > 0) {
         surfaceArea /= scNumber;
      }
      return surfaceArea;
   }
/**
* calculates the average volume.
   * @return volume the average volume.
   */ 
   public double averageVolume() {
      double volume = 0;
      int i = 0;
      while (i < scNumber) {
         volume += scList[i].volume();
         i++;
      }
      if (scNumber > 0) {
         volume /= scNumber;
      }
      return volume;
   }
   
  /**
  * toString returns a string of Spherocylinder data.
  * @return output SpherocylinderList attribute data. 
  */
   public String toString() {
      DecimalFormat formatter = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + listName + " -----\n"
            + "Number of Spherocylinders: " + scNumber + "\n"
            + "Total Surface Area: " + formatter.format(totalSurfaceArea())
            + "\nTotal Volume: " + formatter.format(totalVolume()) + "\n"
            + "Average Surface Area: " + formatter.format(averageSurfaceArea())
            + "\nAverage Volume: " + formatter.format(averageVolume());
            
      return output;
   }
   
/**
* gets the list.
   * @return sclist the Spherocylinder List.
   */
   public Spherocylinder[] getList() {
      return scList;
   }
/**
* adds the Spherocylinder to list.
* @param labelIn is label.
   * @param radiusIn is radius. 
 * @param cylinderHeightIn is height.
   */
   public void addSpherocylinder(String labelIn, double radiusIn,
                                 double cylinderHeightIn) {
      Spherocylinder sc = new Spherocylinder(labelIn,
                                           radiusIn, cylinderHeightIn);
      scList[scNumber] = sc;
      scNumber++;
   }
/**
* searchs the the list by name.
* @param labelIn is label.
   * @return found the found Spherocylinder or null .
   */
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder sc = new Spherocylinder("", 0, 0);
      boolean found = false;
      for (int i = 0; i < scNumber; i++) {
         if (scList[i].getLabel().toUpperCase().equals(labelIn.toUpperCase())) {
            sc = scList[i];
            found = true;
         }
      }  
      if (found) {
         return sc;
      }
      else {
         return null;
      }
   }
/**
* searchs the the list by name then deletes.
* @param labelIn is label.
   * @return sc the deleted Spherocylinder.
   */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
   
      Spherocylinder sc = findSpherocylinder(labelIn);
         
      for (int i = 0; i < scNumber; i++) {
         if (scList[i].getLabel().toUpperCase()
               .equals(labelIn.toUpperCase())) {
            sc = scList[i];
            for (int j = i; j < scNumber - 1; j++) {
               scList[j] = scList[j + 1];
            }
            scList[scNumber - 1] = null; // overwrite duplicate at end
            scNumber--;
            break;
         }
      }
      return sc;
   }
   
   /**
   * edits spherocylinder in list.
   * @param labelIn is label.
   * @param radiusIn is radius. 
   * @param cylinderHeightIn is height.
   * @return true if edited.
   */
      
   public boolean editSpherocylinder(String labelIn, 
                     double radiusIn, double cylinderHeightIn) {
      boolean edited = false;
      for (int i = 0; i < scNumber; i++) {
         if (scList[i].getLabel().toUpperCase()
               .equals(labelIn.toUpperCase())) {
            scList[i].setRadius(radiusIn);
            scList[i].setCylinderHeight(cylinderHeightIn);
            edited = true;
         }
      }
         
      return edited;
   }
      
   /**
   * finds spherocylinder with largest volume in list.
   * @return largest the largest in list or null. 
   */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      
      if (scNumber > 0) {
         Spherocylinder largest = scList[0];
         
         for (int i = 0; i < scNumber; i++) {
            if (scList[i].volume() > largest.volume()) {
               largest = scList[i];
            }
         }
         return largest; 
      }
      else {
         return null;
      }
         
   }
   
}
