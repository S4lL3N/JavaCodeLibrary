import java.text.DecimalFormat;
/**
* This is the Ellipsoid Class, creates a Ellipsoid object.
* Ellipsoid has label, a, b, and c, attributes and has methods to 
* calculate the surface area and volume along with getters and setters.
* 
* Project 5
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/15/21
*/

public class Ellipsoid {
   //Instance variables
   private String label = "";
   private double a, b, c = 0.0;
   

   //constructor
   /**
   * Ellipsoid Constructor. 
   * @param labelIn the label for the ellipsoid.
   * @param aIn  the a for the calculations.
   * @param bIn  the a for the calculations.
   * @param cIn  the a for the calculations.
   */ 
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) {
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   } 

   //Methods
   //Getters and setters
    /**
    * Get's the label.
    * @return label the ellipsoid label.
    */
   public String getLabel() {
      return label;
   }
   /**
    * Set's the label for the ellipsoid.
    * @param labelIn label title
    * @return boolean true if data != null.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      } 
   }
    /**
    * Get's the a value.
    * @return a the a value.
    */
   public double getA() {
      return a;
   }
   
   /**
    * Set's the a value.
    * @param aIn the a value.
    * @return boolean true if value is greater than 0.
    */
   public boolean setA(double aIn) {
      if (aIn > 0) {
         a = aIn; 
         return true;
      }
      else {
         return false;
      }
      
   }
    /**
    * Get's the b value.
    * @return b the b value.
    */
   public double getB() {
      return b;
   }
   
   /**
    * Set's the b value.
    * @param bIn the b value.
    * @return boolean true if value is greater than 0.
    */
   public boolean setB(double bIn) {
      if (bIn > 0) {
         b = bIn; 
         return true;
      }
      else {
         return false;
      }
   }
     /**
    * Get's the c value.
    * @return c the c value.
    */
   public double getC() {
      return c;
   }
   
   /**
    * Set's the c value.
    * @param cIn the c value.
    * @return boolean true if value is greater than 0.
    */
   public boolean setC(double cIn) {
      if (cIn > 0) {
         c = cIn; 
         return true;
      }
      else {
         return false;
      } 
   }
   
   //volume
   /**
    * Calculates the volume.
    * @return volume ellipsoid volume data. 
    */
   public double volume() {
      double volume;
      volume = (4 * Math.PI * a * b * c) / 3;
      return volume;
   }
   
    //surface area
    /**
    * Calculates the surface area.
    * @return surfaceArea ellipsoid surface area data. 
    */
   public double surfaceArea() {
      double surfaceArea;
      double temp;
      
      temp = a * b;
      surfaceArea = Math.pow(temp, 1.6);
      temp = a * c;
      surfaceArea += Math.pow(temp, 1.6);
      temp = b * c;
      surfaceArea += Math.pow(temp, 1.6);
      temp = surfaceArea / 3;
      surfaceArea = Math.pow(temp, 1 / 1.6);
      temp = 4 * Math.PI * surfaceArea;
      
      surfaceArea = temp;
      return surfaceArea;
   }
   //toString
   /**
    * toString returns a string of the input/output data.
    * @return output ellipsoid attribute data 
    */
   public String toString() {
      DecimalFormat formatResult = new DecimalFormat("#,##0.0###");
      String output;
      output = "Ellipsoid \"" + getLabel() + "\"";
      output += " with axes a = " + getA() + ",";
      output += " b = " + getB() + ",";
      output += " c = " + getC();
      output += " units has:" + "\n\tvolume = " + formatResult.format(volume());
      output += " cubic units \n\tsurface area = ";
      output += formatResult.format(surfaceArea());
      output += " square units";  
       
      return output;
   }
}
