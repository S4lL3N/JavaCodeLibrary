import java.util.ArrayList;

public class EllipsoidList {

   //instance variables):
   private String listName;
   private ArrayList<Ellipsoid> ellipsoids = new ArrayList<>();

   //constructor
   public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> ellipsoidsIn){
      listName = listNameIn;
      ellipsoids = ellipsoidsIn;
   }

   public String getName() {
      return listName;
   }
   public int numberOfEllipsoids() {
      return ellipsoids.size();
   }
   public double totalVolume() {
   
      return 0.0;
   }
   public double totalSurfaceArea() {
   
      return 0.0;
   }
   public double averageVolume() {
      return 0.0;
   }
   public double averageSurfaceArea() {
   
      return 0.0;
   }
   public String toString() {
      String output;
      output = getName();
      
      return output;
   }
   public String summaryInfo() {
      String output;
      output = "----- Summary for Ellipsoid Test List -----";
      output += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      output += "\nTotal Volume:" + totalVolume()
         + " cubic units";
      output += "\nTotal Surface Area:" + totalSurfaceArea()
         + " square units";
      output += "\nAverage Volume:" + averageVolume()
         + " cubic units";
      output += "\nAverage Surface Area:" + averageSurfaceArea() 
         + " square units";
      return output;
   }
}