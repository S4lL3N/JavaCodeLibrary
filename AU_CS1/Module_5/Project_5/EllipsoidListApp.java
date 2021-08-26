import java.util.Scanner;
import java.util.ArrayList;
import java.io.File; 
import java.io.FileNotFoundException; 
  /**
* This is the Ellipsoid List App Class, houses the main method 
* takes user input of a file of ellipsoids and adds them to an array list
* then output calculations.
* 
* Project 5
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/25/21
*/

public class EllipsoidListApp {
   /**
    *
    * prompts user for file name and outputs results.
    * @param args Command line arguments – not used.
    * @throws FileNotFoundException if file not found.
    */
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
      System.out.print("Enter file name: "); 
      fileName = scan.nextLine();
      
      //file scanner
      Scanner scanFile = new Scanner(new File(fileName));
      
      //get list name (ie first line)
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         label = scanFile.nextLine();
         
         input = scanFile.nextLine();
         valueA = Double.parseDouble(input);
         
         input = scanFile.nextLine();
         valueB = Double.parseDouble(input);
         
         input = scanFile.nextLine();
         valueC = Double.parseDouble(input);
         
         //instantiate ellipsoid object
         Ellipsoid ellipsoid = new Ellipsoid(label, valueA, valueB, valueC);
         ellipsoids.add(ellipsoid);
      }
      
      //close scanners
      scanFile.close();
      scan.close();
      
      //instantiate list object
      EllipsoidList ellipsoidList = new EllipsoidList(listName, ellipsoids);
      
      //output data
      System.out.println("\n" + ellipsoidList);
      System.out.println(ellipsoidList.summaryInfo());
   }

}