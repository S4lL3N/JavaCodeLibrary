import java.text.DecimalFormat;
/**Spherocylinder, creates a Spherocylinder object.
* Spherocylinder has label, radius, cylinderHeight, and count attributes and
* get/set label, get/set radius, get/set cylinderHeight, get/reset count 
* circumference, sufaceArea, volume, and toString methods. 
*
*
* Project 3 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/24/21
*/
public class Spherocylinder implements Comparable<Spherocylinder> {
   
   //instance variables
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
   
   //static variables
   private static int count = 0;
   
   //constuctor
   /**
   * Spherocylinder Constructor. 
   * @param labelIn the Spherocylinder name.
   * @param radiusIn the radius value.
   * @param cylinderHeightIn the cylinder height value.
   */ 
   public Spherocylinder(String labelIn, double radiusIn,
                                    double cylinderHeightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
      count++;
   }
   
   //getters and setters
   //Label
   /**
    * Get's Spherocylinder label.
    * @return label the Spherocylinder label/name.
    */
   public String getLabel() {
      return label;
   }
   /**
    * Set's Spherocylinder label/name value.
    * @return boolean if value isn't null return true.
    * @param labelIn the Spherocylinder label/name.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      
      label = labelIn.trim();
      return true;
   }
   
   //Radius
   /**
    * Get's Spherocylinder radius.
    * @return radius Spherocylinder's radius.
    */
   public double getRadius() {
      return radius;
   }
   /**
    * Set's Spherocylinder radius value.
    * @return boolean if value is greater than zero return true.
    * @param radiusIn the Spherocylinder lradius.
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      return false;
   }
   
   //CylinderHeight
   /**
    * Get's Spherocylinder CylinderHeight.
    * @return CylinderHeight Spherocylinder's cylinder height.
    */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   /**
    * Set's Spherocylinder cylinder height value.
    * @return boolean if value is greater than zero return true.
    * @param cylinderHeightIn the Spherocylinder cylinder height.
    */
   public boolean setCylinderHeight(double cylinderHeightIn) {
      if (cylinderHeightIn >= 0) {
         cylinderHeight = cylinderHeightIn;
         return true;
      }
      return false;
   }
   
   //methods
   /**
    * Calculates the circumference.
    * @return circumference the circumference of Spherocylinder. 
    */
   public double circumference() {
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }
   /**
    * Calculates the surface area.
    * @return surfaceArea the surface area of Spherocylinder. 
    */
   public double surfaceArea() {
      double surfaceArea = 2 * Math.PI * radius * (2 * radius + cylinderHeight);
      return surfaceArea;
   }
   /**
    * Calculates the volume.
    * @return volume the volume of Spherocylinder. 
    */
   public double volume() {
      double volume = Math.PI * Math.pow(radius, 2) 
                  * (4 * radius / 3 + cylinderHeight);
      return volume;
   }
   /**
    * toString returns a string of Spherocylinder data.
    * @return output Spherocylinder attribute data. 
    */
   public String toString() {
      DecimalFormat formatResult = new DecimalFormat("#,##0.0##");
      String output;
      output = "Spherocylinder \"" + getLabel() + "\"";
      output += " with radius " + getRadius() + " and";
      output += " cylinder height " + getCylinderHeight() + " has:\n";
      output += " \tcircumference = " + formatResult.format(circumference()) 
              + " units\n";
      output += " \tsurface area = " + formatResult.format(surfaceArea());
      output += " square units \n\tvolume = ";
      output += formatResult.format(volume());
      output += " cubic units"; 
      return output;
   }
   
   //Static Methods
   /**
    * Get's the total amount of Spherocylinders.
    * @return count the amount of Spherocylinders.
    */
   public static int getCount() {
      return count;
   }
   /**
    * resets the amount of Spherocylinders to zero.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * checks is objects are equal.
    * @return boolean if objects are euqal return true..
    * @param obj the object to compare.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                     && Math.abs(radius - d.getRadius()) < .000001
                     && Math.abs(cylinderHeight - d.getCylinderHeight())
                     < .000001);
      }
   }
   /**
    *This method is required by Checkstyle.
    * @return 0.
    */
   public int hashCode() {
      return 0;
   }
   
   /*
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                     Project 2
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   */
    /**
    * Compares Spherocylinder objects. 
    * @param obj A Spherocylinder object.
    * @return int O if equal, -1 if this.obj is smaller,
    * 1 if this.obj is larger.
    */
   public int compareTo(Spherocylinder obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0; //consider them equal and return 0.
      }
      else if (this.volume() < obj.volume()) {
         return -1; //return negative
      }
      else {
         return 1; //return positive
      }
   }

}
