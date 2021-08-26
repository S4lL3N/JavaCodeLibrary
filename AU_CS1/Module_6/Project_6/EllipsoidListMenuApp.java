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
public class EllipsoidListMenuApp {
    /**
    * prompts user for file name and outputs results.
    * @param args Command line arguments – not used.
    * @throws FileNotFoundException if file not found.
    */
   public static void main(String[] args) throws FileNotFoundException {  
      Scanner scan = new Scanner(System.in);
      char choice = 'Q';
      String input;
      String fileName;
      String label;
      String listName = "*** no list name assigned ***";
      double valueA;
      double valueB;
      double valueC;
      ArrayList<Ellipsoid> ellipsoids = new ArrayList<>();
      EllipsoidList ellipsoidList =  new EllipsoidList(listName, ellipsoids);
      int index;
      boolean found = false;
     
      displyConsoleMenu();
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]:");
         choice = scan.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'R':
               //prompt user for file to add.
               System.out.print("\tFile name: "); 
               fileName = scan.nextLine();
               ellipsoidList.readFile(fileName);
               
               
               System.out.println("\tFile read in and "
                  + "Ellipsoid List created\n");
               break;
            case 'P':
               System.out.println("\n" + ellipsoidList);
               break; 
            case 'S':
               System.out.println("\n" + ellipsoidList.summaryInfo() + "\n\n");
               break;   
            case 'A':
               //prompt user to add ellipsoid
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               System.out.print("\ta: ");
               input =  scan.nextLine();
               valueA =  Double.parseDouble(input);
               System.out.print("\tb: ");
               input =  scan.nextLine();
               valueB =  Double.parseDouble(input);
               System.out.print("\tc: ");
               input =  scan.nextLine();
               valueC =  Double.parseDouble(input);
               
               ellipsoidList.addEllipsoid(label, valueA, valueB, valueC);
               
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
            case 'D':
               //prompt user for label to delete.
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               index = -1;
               for (Ellipsoid value : ellipsoids) {
                  if (label.equalsIgnoreCase(value.getLabel())) {
                     found = true;
                     label = value.getLabel();
                     index = ellipsoids.indexOf(value);
                  }
               }
               if (!found) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               if (index >= 0) {
                  ellipsoids.remove(index);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               found = false;
               break;
            case 'F':
               //prompt use for label to find.
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               
               for (Ellipsoid value : ellipsoids) {
                  if (label.equalsIgnoreCase(value.getLabel())) {
                     found = true;
                     System.out.print(value + "\n\n");
                  }
               }
               if (!found) {
                  System.out.println("\t\"" + label + "\" not found");
               }
               found = false;
               break; 
            case 'E':
               // prompt user for label and data for edit.
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               
               System.out.print("\ta: ");
               input =  scan.nextLine();
               valueA =  Double.parseDouble(input);
               System.out.print("\tb: ");
               input =  scan.nextLine();
               valueB =  Double.parseDouble(input);
               System.out.print("\tc: ");
               input =  scan.nextLine();
               valueC =  Double.parseDouble(input);
               
               for (Ellipsoid value : ellipsoids) {
                  if (label.equalsIgnoreCase(value.getLabel())) {
                     found = true;
                     value.setA(valueA);
                     value.setB(valueB);
                     value.setC(valueC);
                     System.out.println("\t\"" + value.getLabel() 
                        + "\" successfully edited\n");
                  }
               }
               if (!found) {
                  System.out.println("\t\"" + label + "\" not found");
               }
               found = false;
               break;   
            case 'Q':
               break;
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (choice != 'Q');
   }
   /**
    * Outputs the console menu options. 
    */
   public static void displyConsoleMenu() {
   
      System.out.println("Ellipsoid List System Menu");
      System.out.println("R - Read File and Create Ellipsoid List");
      System.out.println("P - Print Ellipsoid List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Ellipsoid");
      System.out.println("D - Delete Ellipsoid");
      System.out.println("F - Find Ellipsoid");
      System.out.println("E - Edit Ellipsoid");
      System.out.println("Q - Quit");
   
   }
}