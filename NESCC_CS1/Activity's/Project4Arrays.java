import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Name: Shae Allen
 * Date: 10/01/2019
 * Project: Project 4 Arrays
 * Getting Started - This program will demonstrate the input/process/output paradigm. The program prompts the user
 *                   to enter the length of an array and uses a try/catch construct to check for proper input and uses
 *                   a while loop to continuously run the program until the user is finished. the program uses for loops
 *                   to parse an array. The program assigns random numbers between 1 and 999 to the array and outputs
 *                   the array to the console in various formats. The program passes the array to a series of methods
 *                   to sort from the lowest to the highest integer value, then shuffles the array by calling a swap
 *                   method that randomly changes the placement of integers in the array, and then parse the array for
 *                   the highest integer value and the lowest integer value.

 */
public class Project4Arrays {
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public static void main(String[] args) {

        //input object
        Scanner cin = new Scanner(System.in);

        //input string
        String input;

        //local variables
        boolean done = false;
        int arraySize = 0;
        int[] intArray;


        while (!done) {
            //__________INPUT_______________________________________
            //prompt user
            System.out.print("\nEnter the size of integer array: ");
            input = cin.nextLine();
            //_________PROCESS______________________________________
            //try/catch to verify proper input
            try {
                arraySize = Integer.parseInt(input);
            } catch (NumberFormatException err) {
                System.out.print("\n\t***Invalid integer***");
                System.out.print("\n Please enter a valid integer.\n");
                continue;
            }//end try/catch construct

            //_________PROCESS AND OUTPUT___________________________________
//todo      //----------------------LOAD ARRAY--------------------------------------------------------------------------
            //todo i think this is loading the array confirm what it is doing
            intArray = new int[arraySize];

            //loading the array
            //calling the load array method
            loadArray(intArray);
            //calling the printArray method and printing it out to console
            System.out.print("Original array: " + printArray(intArray));


//todo      //----------------------SORT ARRAY--------------------------------------------------------------------------
            //calling the sort array method
            //sorting the array
            Arrays.sort(intArray);//this is how to sort the array from min to max
            //print out the sorted array to the console
            System.out.print("\nSorted array: " + printArray(intArray));


//todo      //---------------------SHUFFLE ARRAY------------------------------------------------------------------------
            //shuffling the array
            //calling the shuffle array method
            shuffle(intArray);
            //print out the shuffled array to the console
            System.out.print("\nShuffled array: " + printArray(intArray));


//todo      //--------------------FIND MAXIMUM--------------------------------------------------------------------------
            //find maximum value in array
            //call the maxindex method
            //maxIndex(intArray);
            //print out max value to the console
            System.out.print("\nMaximum integer: " + maxIndex(intArray));


//todo      //--------------------FIND MINIMUM--------------------------------------------------------------------------
            //find minimum value in array
            //call the minIndex method
            //minIndex(intArray);
            //print out min value to the console
            System.out.print("\nMinimum integer: " + minIndex(intArray));



//todo      //--------------------RE-RUN PROGRAM -----------------------------------------------------------------------
            //prompt user to ask if they want to re-run the program.
            System.out.print("\n\nWould you like to run again: Y/N? ");
            input = cin.nextLine();
            //conditional if users inputs "n" or "N" break out of while loop
            if (input.equalsIgnoreCase("n")) {
                done = true;
            }// end if statement
            //----------------------------------------------------------------------------------------------------------


        }//end while loop
    }//end main method
            //_________PROCESS AND RETURN___________________________________
//todo      //------------OTHER METHODS---------------------------------------------------------------------------------

    /**
     * Description: This method generates random numbers to the user specified length of the array using a for loop.
     * parameters = the int[] intArray
     */
    private  static void loadArray(int[] intArray){
        //local variables
        Random random = new Random();
        int len = intArray.length;
        //process
        for (int i = 0; i < len; i++){
            intArray[i] = random.nextInt(1000);
        }//end for loop
    }//end loadArray method

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This method converts the array to a sprint to output to the console using a for each loop and a
     * string builder and returns the data back to main where the method is called.
     * parameters = the int[] intArray
     */
    private static String printArray(int[] intArray){
        //local variables
        StringBuilder sb = new StringBuilder();
        //String output = "";//was using instead of string builder ***DO NOT USE***
        //Process
        for (int value : intArray){
            sb.append(value + " ");
            //output += value + " "; //was using instead of string builder ***DO NOT USE*** //using this will take a lot longer use the string builder instead re-watch yuja video.***DO NOT USE***
        }//end for loop
        return sb.toString();
        //return output;//was using instead of string builder ***DO NOT USE***
    }//end printArray

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This method shuffles the array using a for loop by looping through the length of the array
     * multiplied by 1000. and generates a two random numbers between the range of the length of the array and sends
     * the data to the swap method to change the placement of the integer values based on the random numbers.
     * parameters = the int[] intArray
     */
    private static void shuffle(int[] intArray){
        //local variables
        Random random = new Random();
        int len = intArray.length;
        int shufflenumber = intArray.length * 1000;
        //process
        for (int i = 0; i < shufflenumber; i++){
            //variables
            int randA = random.nextInt(len);
            int randB = random.nextInt(len);
            //System.out.print("THIS IS THE RANDOM NUMBERS: " + randA + " " + randB + "\n");
            //Pass data to the swap method
            swap(intArray, randA, randB);
        }//end for loop
    }//end shuffle method

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This methods takes the data sent from the shuffle method and swaps the placement of the integers
     * according tp the random number generated by the shuffle method using a for loop.
     * parameters = the int[] intArray and int a(randA) and int b(randB)
     */
    private static  void swap(int[] intArray, int a , int b){
        //local variables
        int temp = intArray [a];
        //process
        intArray[a] = intArray[b];
        intArray[b] = temp;
    }//end swap method

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This method assigns the first integer in the array to a variable and then uses a for loop to
     * compare against each integer in the array swapping the integer in the variable for the highest integer value
     * then returns the data
     * parameters = the int[] intArray
     */
    private static int maxIndex(int[] intArray){
        //local variables
        int maxValue = intArray[0];
        //process
        for (int i = 1; i < intArray.length; i++ ){
            if (intArray[i] > maxValue){
            maxValue = intArray[i];
            }//end if statement
        }//end for loop
        //return data
        return maxValue;
    }//end maxIndex method

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This method assigns the first integer in the array to a variable and then uses a for loop to
     * compare against each integer in the array swapping the integer in the variable for the lowest integer value
     * then returns the data.
     * parameters = the int[] intArray
     */
    private static int minIndex(int[] intArray){
        //local variables
        int minValue = intArray[0];
        //process
        for (int i = 1; i < intArray.length; i++ ){
            if (intArray[i] < minValue){
                minValue = intArray[i];
            }//end if statement
        }//end for loop
        //return data
        return minValue;
    }//end minIndex method
    //------------------------------------------------------------------------------------------------------------------

}//end class
