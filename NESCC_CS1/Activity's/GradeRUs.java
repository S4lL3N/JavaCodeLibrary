import java.util.Scanner;

/**
 * Name: Will Smith
 * Date: 9/24/2019
 * Project: Troubleshooting lab 1 (Grades-R-Us)
 * Description: This application averages N number of grades enter by the user. The application
 *              must error check all inputs for non-integer values and out-of-bounds grades.
 *              If an input error is detected, the user should be allowed to reenter the value.
 *
 * Tests:
 *  input - number of grades: A
 *  output: re-prompt user for number of grades
 *
 *  input - number of grades: 3
 *  output: Enter grade 1: (input): a
 *  output: Enter grade 1: (input): 100
 *  output: Enter grade 2: (input): 101
 *  output: Enter grade 2: (input): 77
 *  output: Enter grade 3: (input): 82
 *  output: Grade average is: 86.33
 *
 *  Bugs:
 * 1. output to enter grades should not start at 0
 * 2. 0 and 100 should be valid grades
 * 3. Should not be allowed to enter a non-integer value for a grade //todo still need to fix !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
//ERRORS----------------------------------------------------------------------------------------------------------------
// add one to increment to get the first grade as 1 not 0
// not accepting 100 as a grade
// incorrect calculation of average

public class GradeRUs {
    /**
     * Description: enter point for all java applications
     * @param args - not used in this application
     */
    public static void main(String[] args) {

        int[] grades;
        Scanner cin = new Scanner(System.in);
        String input = "";
        int numberOfItems = 0;
        int aGrade = 0;
        int total = 0;

        while(true){
            System.out.print("How many grades would you like to enter? ");
            input = cin.nextLine();

            if(isValidInteger(input)){
                numberOfItems = Integer.parseInt(input);
            } else {
                continue;
            }

            grades = new int[numberOfItems];

            for(int i = 0; i < numberOfItems; i++){
                System.out.print("Enter grade " + (i + 1) + ": "); //todo ...// added 1 to i to make count start at one instead of zero
                input = cin.nextLine();
                if(isValidInteger(input)){
                    aGrade = Integer.parseInt(input);
                    if(isGradeInRange(aGrade)){
                        grades[i] = aGrade;
                    }else {
                        i--;
                    }
                }
            }

            for(int grade : grades){
                total += grade;
            }

            //todo ...// added a variable for grade average and moved the calculation from the string to the variable.
            double gradeAvg = 0.0;
            gradeAvg = (double)total / grades.length;

            //System.out.print("\nGrade Average is: %-3.2f\n\n" + total / grades.length); //todo ... //original code... not print f
            System.out.printf("\nGrade Average is: %-3.2f", gradeAvg); //todo ...// corrected line of code


            System.out.println("\n\nEnter another set of grades? (Y/N)"); //todo ... added two newline characters
            input = cin.nextLine();

            if(input.equalsIgnoreCase("n")){
                System.out.println("Thanks for using Grades-R-Us");
            }
        }


    }//end main method

    /**
     * Description: This method tests a string before conversion to an integer to be a +/- integer
     *              then return a true or false indicating if it passed the test.
     * @param value - String value representing an integer
     * @return - boolean value that is true if this is an integer, false otherwise
     */
    private static boolean isValidInteger(String value) {
        boolean validInteger = true;
        int minusCounter = 0;
        int len = value.length();
        if(len == 0){
            validInteger = false;
        }
        for (int i = 0; i < len; i++) {
            char aChar = value.charAt(i);
            if (aChar < 48 || aChar > 57) {
                if (aChar == 45 && i == 0) {
                    minusCounter++;
                } else {
                    validInteger = false;
                    break;
                }
            }//end if
        }//end for
        if (minusCounter > 1) {
            validInteger = false;
        }//end if
        return validInteger;
    }//end isValidInteger

    /**
     * Description:
     * @param gradeValue -
     * @return -
     */
    private static boolean isGradeInRange(int gradeValue){
        boolean results = true;
        if(gradeValue < 0 || gradeValue > 100){   //todo ... //removed the greater than or equal to, and the lesser than or equal to
            results = false;
        }
        return results;
    }

}
