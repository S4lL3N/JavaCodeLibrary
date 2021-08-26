import java.util.Scanner;
/**
* This is the driver class for the Ellipsoid Class.
* The program prompts user for the name/label and
* three values. Then checks values are greater than 0,
* and instantiates ellipsoid object. 
*
* Project 4
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/15/21
*/

public class EllipsoidApp {
   /**
    *
    * prompts user for data and outputs results.
    * @param args Command line arguments – not used.
    */
   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      String label;
      double a, b, c;
   
      //prompt user for a, b, c values
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      
      //label
      System.out.print("\tlabel: "); 
      label = scan.nextLine();
      
      //A
      System.out.print("\ta: ");    
      a = Double.parseDouble(scan.nextLine());
      if (a > 0) {
         //B
         System.out.print("\tb: ");   
         b = Double.parseDouble(scan.nextLine());
         
         if (b > 0) {
            //C
            System.out.print("\tc: ");
            c = Double.parseDouble(scan.nextLine());
            
            if (c > 0) {
               //instantiate object
               Ellipsoid ellipsoid = new Ellipsoid(label, a, b, c);
            
               //output
               System.out.print("\n" + ellipsoid);
               //close scanner
               scan.close();
            }
            else {
               System.out.print("Error: axis value must be positive.\n");
            }
         }
         else {
            System.out.print("Error: axis value must be positive.\n");
         }
      }
      else {
         System.out.print("Error: axis value must be positive.\n");
      }
   }
}