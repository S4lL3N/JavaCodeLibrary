
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class addDates {
	private static int numberOfChecksToSavings;
	//int numberOfChecksToSavings = 0;


	public static void main(String[] args) {
		getStartDate();

		salaryAndSavings(numberOfChecksToSavings);

	}//end main

	private static void salaryAndSavings(int numberOfChecksToSavings) {
		double salary = 3800 * 13;
		//int numberOfChecksToSavings = 0;
		double amountSaved = 0;
		//numberOfChecksToSavings = 2;
		Scanner cin = new Scanner(System.in);
		String input;
		System.out.print("\n\nEnter the amount you plan save a month: ");
		input = cin.nextLine();
		amountSaved = Double.parseDouble(input);
		amountSaved = (13 - numberOfChecksToSavings) * amountSaved;
		amountSaved += 1400 * numberOfChecksToSavings;
		System.out.print("\nTotal Earned: " + salary);
		System.out.print("\nTotal amount saved: " + amountSaved);
	}

	private static void getStartDate() {
		Scanner cin = new Scanner(System.in);
		String input;
		String[] temp;
		String tempStr;
		int year = 0;
		int month =0;
		int day = 0;

		//gets the current year to send with the user input
		Calendar getYear = new GregorianCalendar();
		tempStr = getYear.getTime().toString();
		temp = tempStr.split(" ");
		year = Integer.parseInt(temp[5]);

		//prompt user for start date
		System.out.print("Enter start date (MM-DD): ");
		input = cin.nextLine();
		//System.out.println(input);
		temp = input.split("-");
		month = Integer.parseInt(temp[0]) - 1;
		day = Integer.parseInt(temp[1]);

		System.out.print("\n============================================================\n");

		//calls the findPaydays method
		FindPaydays(year, month, day);
	}//end getStartDate

	private static int FindPaydays(int year, int month, int day) {
		//objects
		SimpleDateFormat sdf = new SimpleDateFormat();
		//Calendar cal = new GregorianCalendar(2019, 11, 16); //hard coded
		Calendar cal = new GregorianCalendar(year, month, day); //user input received from get start method

		//variables
		int counter = 0;
		int counterTwo = 0;
		String[] temp;
		String tempStr;
		int tempInt = 0;
		int january = 0;

		//get start date
		//System.out.print("Start date: " + sdf.format(cal.getTime()));

		while (counter < 13){
			counter++;
			//add the days

			System.out.print("\nAdding Days....");
			cal.add(Calendar.DAY_OF_MONTH, 28);


			//get the end date
			System.out.print("\n---------------------------------------------------------");
			System.out.print("\nPaycheck #2 received on: " + sdf.format(cal.getTime()) + " counter: " + counter);
			System.out.print("\n----------------------------------------------------------");

			//parse the date for the day for if else statement.
			tempStr = sdf.format(cal.getTime());
			temp = tempStr.split("/");
			tempStr = temp[1];
			tempInt = Integer.parseInt(tempStr);

			if (tempInt < 7){
				//change the start date and all goes to savings
				System.out.print("\n\t\tAll to savings on: " + sdf.format(cal.getTime()));
				//todo subtract a 2 weeks from date above and that will be the check that goes to savings
				//changing the order  of paychecks received
				cal.add(Calendar.DAY_OF_MONTH, 14);
				System.out.print("\n\t\tChanged Paycheck #2 date to: " + sdf.format(cal.getTime()));
				counterTwo++;


			}//end if statement

			//break the loop if reaches the january twice
			if (Integer.parseInt(temp[0]) == 1){
				january += 1;
				if(january > 1){
					break;
				}

			}//end if statement

			//test code
			//System.out.print("\t tempStr= " +tempStr + " tempInt= " + tempInt);


		}//end while loop
		//return counter;
		numberOfChecksToSavings = counterTwo;
		return numberOfChecksToSavings;
	}// end findPaydays method


}//end class