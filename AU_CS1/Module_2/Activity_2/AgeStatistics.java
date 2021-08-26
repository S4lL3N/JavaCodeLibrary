import java.util.Scanner;

 /**
* The goal of this activity is to create a program that displays someone’s
* name, age, and gender, along with calculations for age in minutes and 
* centuries well as max heart rate based on age and gender. 
*
* Activity 2
* @author  Shae Allen – CPSC-1210-AO1 
* @version 5/29/21
*/
public class AgeStatistics 
{
   /**
   *
    * Prompts user for name, age, and gender then outputs calculations.
    * @param args Command line arguments – not used.
    */
     
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   
      //prompt user for their name.
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //prompt user for their age.
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //prompt user for gender. 
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //converting age to minutes.
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      
      //converting age to centuries.
      System.out.println("\tYour age in centuries is "
         + ageInYears / 100.0 + " centuries.");
         
      //display max heart rate.
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) { //calculate female max heart rate.
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else { //calculate male heart rate.
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      
      System.out.println(maxHeartRate + " beats per minute.");
   
   }
}
