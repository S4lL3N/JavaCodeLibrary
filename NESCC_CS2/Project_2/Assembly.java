package ProjectTwo;

import java.util.ArrayList;
/**
 *
 * Purpose: Assembly class, creates assembly objects.
 * - Overloaded constructor
 * - Getter methods: getName, getParts
 * - Setter methods: N/A
 * - Public methods: addPartToAssembly, calculateTotalWeight, calculateTotalSurfaceArea, toString
 */

public class Assembly {
   private String name;
   private ArrayList<Part> parts = new ArrayList<>();

   public Assembly(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public ArrayList<Part> getParts() {
      return parts;
   }
   /**
    *  Method description: This method instantiates a new Part object and adds it to the parts ArrayList.
    *  Parameters: String partNumber, String serialNumber, int weight, double surfaceArea
    *  Return: N/A
    */
   public void addPartToAssembly(String partNumber, String serialNumber, int weight, double surfaceArea){
      parts.add(new Part(partNumber,serialNumber,weight,surfaceArea));
   
   }
   /**
    * Method description: This method uses a enhanced for loop to go through the parts array list and calculates to total weight of parts in assembly.
    * Parameters: N/A
    * Return: totalWeight
    */
   public int calculateTotalWeight(){
      int totalWeight = 0;
      for (Part value: parts){
         totalWeight += value.getWeight();
      }
      return totalWeight;
   
   }
   /**
    * Method description: This method uses a enhanced for loop to go through the parts array list and calculates to total surface area of parts in assembly.
    * Parameters: N/A
    * Return: totalSurfaceArea
    */
   public double calculateTotalSurfaceArea(){
      double totalSurfaceArea = 0.0;
      for(Part value: parts){
         totalSurfaceArea += value.getSurfaceArea();
      }
      return totalSurfaceArea;
   
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Assembly Name: ").append(getName());
      sb.append("\nTotal Weight: ").append(calculateTotalWeight());
      sb.append("\nTotal Surface Area: ").append(calculateTotalSurfaceArea()).append("\n");
      for(Part value : parts){
         sb.append(value);
      }
      return sb.toString();
   
   }
}
