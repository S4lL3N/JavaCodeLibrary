package Payday;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Payday {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String input = "";
        String[] tempArray;
        String tempString;
        String monString="";
        String dayString="";
        int year = 0;
        int month = 0;
        int day = 0;
        int twoWeeks = 14;
        int fourWeeks = 28;

        //get current date
        LocalDate today = LocalDate.now(); // Create a date object
        //System.out.println(today); // Display the current date

        //call the get year method
        year = getYear(today);

        //get month and day
        System.out.print("Enter the date of 2nd paycheck (i.e. MM-DD): ");
        input = cin.nextLine();
        tempArray = input.split("-");
        month = Integer.parseInt(tempArray[0]);
        day = Integer.parseInt(tempArray[1]);

        //System.out.println(month);
        //System.out.println(day);

        //Date currentDate = new Date();
        //System.out.println(currentDate);

        //calling the add2weeks method
        Add4Weeks(2020, month, day, twoWeeks);

    }//end main
    /*
//=====================================================================================================
        METHODS
//=====================================================================================================

     */
    private static int getYear(LocalDate today) {
        String[] tempArray;
        String tempString;
        int year;//get year
        tempArray = today.toString().split("-");
        tempString = tempArray[0];
        year = Integer.parseInt(tempString);
        //System.out.println(year);
        return year;
    }

    private static void Add4Weeks(int year, int month, int day, int noOfDays) {
        int counter = 0;
        String[] tempArray;
        String monString;
        String dayString;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        System.out.println(calendar);
        while (counter < 13){
            counter++;
            //calendar.setTime(currentDate);
            //System.out.println(noOfDays);
            calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
            //calendar.add(Calendar.WEEK_OF_MONTH,2);
            Date date = calendar.getTime();
            tempArray = date.toString().split(" ");
            //System.out.println(tempArray);
            monString = tempArray[1];
            dayString = tempArray[2];
            String nameDay = tempArray[0];
            System.out.println("Next : " + monString + " " + dayString + " " + nameDay);

        }
        /*
        //calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
        Date date = calendar.getTime();
        tempArray = date.toString().split(" ");
        monString = tempArray[1];
        dayString = tempArray[2];
        System.out.println("Next payday: " + monString + " " + dayString);

         */
    }
}
