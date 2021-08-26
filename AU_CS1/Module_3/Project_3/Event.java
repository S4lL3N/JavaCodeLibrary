
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
* The purpose of this program is to accept coded event information as input 
* that includes the date, time, price, discount, section, row, seat, followed
* by the description of the event. Then output the parsed data in the 
* requested format. 
*
* Project 3 part 2
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/8/21
*/
public class Event 
{  /**
    *
    * prompts user for input and outputs formatted data.
    * @param args Command line arguments – not used.
    */

   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      DecimalFormat dFormatCurrency = new DecimalFormat("$#,##0.00");
      DecimalFormat dFormatDiscount = new DecimalFormat("0%");
      DecimalFormat dFormatPrize = new DecimalFormat("0000");
      Random random = new Random();
      String input;
      int temp;
      double dTemp;
      String event;
      String date;
      String month;
      String day;
      String year;
      String time;
      String hours;
      String mins;
      String section;
      String row;
      String seat;
      String price;
      double dPrice;
      String discount;
      double dDiscount;
      String cost;
      String prizeNumber;
      
      
      
      //prompt user for input
      System.out.print("Enter your event code: ");
      input = userInput.nextLine();
      input = input.trim();
      
      
      //check input
      temp = input.length();
      if (temp < 26) {
         System.out.println("\nInvalid Event Code."
            + " \nEvent code must have at least 26 characters.");
      }
      else {
         //parse data and format
         event = input.substring(25);
         
         date = input.substring(0, 8);
         month = date.substring(0, 2);
         day = date.substring(2, 4);
         year = date.substring(4);
         date = month + "/" + day + "/" + year;
         
         time = input.substring(8, 12);
         hours = time.substring(0, 2);
         mins = time.substring(2);
         time = hours + ":" + mins;
         
         price = input.substring(12, 17);
         discount = input.substring(17, 19);
         dPrice = Double.parseDouble(price);
         dDiscount = Double.parseDouble(discount);
         dPrice = dPrice / 100;
         dDiscount = dDiscount / 100;
         dTemp = dPrice - (dPrice * dDiscount);
         cost = dFormatCurrency.format(dTemp);
         
         section = input.substring(19, 21);
         row = input.substring(21, 23);
         seat = input.substring(23, 25);
        
        //random number / prize number
         temp = random.nextInt(9999) + 1;
         prizeNumber = Integer.toString(temp); 
         
         //output
         System.out.print("\nEvent: " + event);
         System.out.print("   Date: " + date);
         System.out.println("   Time: " + time);
         System.out.print("Section: " + section);
         System.out.print("   Row: " + row);
         System.out.println("   Seat: " + seat);
         System.out.print("Price: " + dFormatCurrency.format(dPrice));
         System.out.print("   Discount: " + dFormatDiscount.format(dDiscount));
         System.out.println("   Cost: " + cost);
         System.out.print("Prize Number: " + prizeNumber);
      }
   
      //close scanner 
      userInput.close();
   }
}
