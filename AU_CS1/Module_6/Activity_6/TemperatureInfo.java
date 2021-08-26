import java.util.ArrayList;
import java.util.Scanner;
 /**
* This is the TemperatureInfo Class, houses the main method.
* Prompts user for temperature input then displays a menu to
* check for high and low temperatures. 
* 
* Activity 6
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/28/21
*/

public class TemperatureInfo {
   /**
    *
    * prompts user for temperature then displys menu.
    * @param args Command line arguments – not used.
    */
   public static void main(String[] args) {
    
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<>();
      
      String tempInput = "";
      
      do {
         
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }   
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp,"
            + " [H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break; 
            case 'P':
               System.out.println(temps);
               break;   
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!"); 
         }
      } while (choice != 'E');
   }

}
