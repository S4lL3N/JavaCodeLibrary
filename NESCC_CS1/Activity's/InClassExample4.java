import java.util.Scanner;

public class InClassExample4 {
    public static void main (String[] args){

        //loops---for loop, while loop, for each loop
        //use counters either "i,j,k,"
/**
 //--------------------------------------------------------------------------------------------------------------
 String myString = "hello world";
 for(int i = 0; i < myString.length(); i++){
 System.out.print(myString.charAt(i));//prints out each character.
 }//end for loop
 //--------------------------------------------------------------------------------------------------------------
 for(int i = 0; i < 5; i++){
 System.out.print(i);//counts total loops
 }//end for loop
 //--------------------------------------------------------------------------------------------------------------
 int count =0;
 int length = myString.length();

 while(count < length){
 System.out.print(count);//counts total loops
 count++;
 }//end while loop
 //---------------------------------------------------------------------------------------------------------------
 */

/**
 Scanner cin = new Scanner(System.in);
 String input = "";
 int numberOfTests = 0;
 int [] grades;
 int grade;
 int total = 0; //for adding the grades together
 double gradeAvg = 0.0;

 System.out.print("how many test scores do you have: ");
 input =cin.nextLine();
 numberOfTests = Integer.parseInt(input);

 grades = new int[numberOfTests];

 for (int i = 0; i < grades.length; i++){
 System.out.print("Enter a grade: ");
 input = cin.nextLine();
 grade = Integer.parseInt(input);
 grades [i] = grade;//adds grade to array
 }//end for loop

 //for each loop
 for (int aGrade : grades){
 //System.out.print(aGrade);
 total += aGrade;
 }//end for each loop

 gradeAvg = (double)total / grades.length;

 System.out.printf("your grade average is: %-10.2f", gradeAvg);
 */
        //--------------------------------------------------------------------------------------------------------------

        //this is for the isValidInt method below-----------------------------------------------------------------------
        Scanner cin2 = new Scanner(System.in);
        String input2 = "";
        int intValue;
        boolean done = false;

        while (!done) {
            System.out.print("Enter an integer: ");
            input2 = cin2.nextLine();

            boolean results = isValidInt(input2);

            if (results == true) {
                try {
                    intValue = Integer.parseInt(input2);
                    System.out.print("Good integer");
                } catch (NumberFormatException err) {
                    System.out.println("not a valid integer");
                }//end try/catch
            } else {
                System.out.print("Not an integer");
            }//end of if else statement

            System.out.print("would you like to continue? Y or N: ");
            input2 =cin2.nextLine();

            if(input2.equalsIgnoreCase("n")){
                done = true;
            }//end if statement

        }//end while loop

    }//end main

    // -----------------------------------------------------------------------------------------------------------------

    //methods and arrays
    // signature of a method:
    // name, data types of parameters , order of parameters, and number of parameters
    // return is not apart of the signature

    //snake case = "is_numeric"

    public static boolean isValidInt(String value){

        boolean results = true;

        for (int i = 0; i < value.length(); i++){
            char aChar = value.charAt(i);

            if (aChar < 48 || aChar > 57){
                //checking for ascii range of integer and for a negative in the 0 place or first character of array
                if (aChar == 45 && i == 0){
                    continue;
                }else{
                    results =false;
                    break;
                }//end of nested if else statement
            }//end if statement
        }//end for loop

        //returns to the main method
        return results;

    }//end isValidInt method
}//end class
