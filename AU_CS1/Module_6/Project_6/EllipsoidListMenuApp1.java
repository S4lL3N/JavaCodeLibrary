import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException; 
/**
* This is the Ellipsoid List Menu App Class, houses the main method 
* displays a menu of options, takes user input to read a file of ellipsoids
* data and adds it to an EllipsoidList opject, it also edits/deletes then 
* outputs calculations.
* 
* Project 6
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/29/21
*/
public class EllipsoidListMenuApp1 {
    /**
    * prompts user for file name and outputs results.
    * @param args Command line arguments – not used.
    * @throws FileNotFoundException if file not found.
    */
   public static void main(String[] args) throws FileNotFoundException {  
      Scanner scan = new Scanner(System.in);
      char choice = 'Q';
      String fileName = "";
      String listName = "*** no list name assigned ***";
      ArrayList<Ellipsoid> ellipsoids = new ArrayList<>();
      EllipsoidList ellipsoidList =  new EllipsoidList(listName, ellipsoids);
      String label;
      String valueA;
      String valueB;
      String valueC;
      Ellipsoid ellipsoid = null;
     
     
      System.out.println("Ellipsoid List System Menu\n"
         + "R - Read File and Create Ellipsoid List\n"
         + "P - Print Ellipsoid List\n"
         + "S - Print Summary\n"
         + "A - Add Ellipsoid\n"
         + "D - Delete Ellipsoid\n"
         + "F - Find Ellipsoid\n"
         + "E - Edit Ellipsoid\n"
         + "Q - Quit");
      
      
      
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]:");
         choice = scan.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'R':
               //prompt user for file to add.
               // test file =  Ellipsoid_data_1.txt
               System.out.print("\tFile name: "); 
               fileName = scan.nextLine();
               ellipsoidList = ellipsoidList.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "Ellipsoid List created\n");
               break;
               
            case 'P':
               System.out.println(ellipsoidList);
               break; 
               
            case 'S':
               System.out.println("\n" + ellipsoidList.summaryInfo() + "\n");
               break;   
               
            case 'A':
               //prompt user to add ellipsoid
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               System.out.print("\ta: ");
               valueA =  scan.nextLine();
               System.out.print("\tb: ");
               valueB =  scan.nextLine();
               System.out.print("\tc: ");
               valueC =  scan.nextLine();
               ellipsoidList.addEllipsoid(label, valueA, valueB, valueC);
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
               
            case 'D':
               //prompt use for label to find.
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               ellipsoid = ellipsoidList.deleteEllipsoid(label);
               if (ellipsoid == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + ellipsoid.getLabel() 
                     + "\" deleted\n");
               }
               break;
               
            case 'F':
               //prompt use for label to find.
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               ellipsoid = ellipsoidList.findEllipsoid(label);
               if (ellipsoid == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  System.out.print(ellipsoid + "\n\n");
               }
               break; 
               
            case 'E':
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               System.out.print("\ta: ");
               valueA =  scan.nextLine();
               System.out.print("\tb: ");
               valueB =  scan.nextLine();
               System.out.print("\tc: ");
               valueC =  scan.nextLine();
               ellipsoid = ellipsoidList.editEllipsoid(label, valueA, valueB, valueC);
               if (ellipsoid == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + ellipsoid.getLabel() 
                        + "\" successfully edited\n");
               }
               break;  
                
            case 'Q':
               break;
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (choice != 'Q');
   }
}