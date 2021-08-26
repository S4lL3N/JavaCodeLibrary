import java.util.Scanner;
import java.util.ArrayList;
import java.io.File; // required for input file
import java.io.FileNotFoundException; // required for "throws" in main header


public class EllipsoidListApp {

   public static void main(String[] args) throws FileNotFoundException {
     //variables
      Scanner scan = new Scanner(System.in);
      String fileName;
      String input;
      String listName;
      String label;
      double valueA;
      double valueB;
      double valueC;
      ArrayList<Ellipsoid> ellipsoids = new ArrayList<>();
      
      
      //prompt user for file
      System.out.print("Enter file name: "); //Ellipsoid_data_1.txt
      fileName = scan.nextLine();
      
      //file scanner
      Scanner scanFile = new Scanner(new File(fileName));
      
      //get list name (ie first line)
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         label = scanFile.nextLine();
         
         input =scanFile.nextLine();
         valueA = Double.parseDouble(input);
         
         input =scanFile.nextLine();
         valueB = Double.parseDouble(input);
         
         input =scanFile.nextLine();
         valueC = Double.parseDouble(input);
         
         //instantiate object
         Ellipsoid ellipsoid = new Ellipsoid(label, valueA, valueB, valueC);
         ellipsoids.add(ellipsoid);
      }
      
      //close scanners
      scanFile.close();
      scan.close();
      
      EllipsoidList ellipsoidList = new EllipsoidList(listName, ellipsoids);
      
      
      
    
      System.out.println("\n" + ellipsoids);
      System.out.println("\n" + ellipsoidList.summaryInfo());
      System.out.println("\n" + ellipsoidList.numberOfEllipsoids());
      
      
      
      
      
   }

}