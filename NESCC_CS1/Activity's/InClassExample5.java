import java.util.Arrays;
import java.util.Scanner;


public class InClassExample5 {
    public static void main(String[] args) {
        /**
         * working with arrays
         ****THIS ISN"T WORKING PROPERLY RE-WATCH YUJA VIDEO*****
         */


        //input object
        Scanner cin = new Scanner(System.in);

        //input string
        String input;

        //local variables
        boolean done = false;
        int arraySize = 0;
        int[] intArray;

        while (true) {
            //prompt user for how many integers in the array
            System.out.print("Enter number of integers: ");
            input =cin.nextLine();
            //try/catch to check for proper input
            try{
                arraySize = Integer.parseInt(input);
            }catch (NumberFormatException err){
                System.out.println("invalid integer");
                continue;
            }//end catch

//----------------------------------------------------------------------------------------------------------------------
            //WORK ON THIS SECTION TO MAKE SURE I UNDERSTAND

            intArray = new int[arraySize];//??? this is loading the array

            //loading the array
            loadArray(intArray);//calling the load array method
            System.out.print("\n" + printArray(intArray));//calling the printArray method and printing it out

            //swap the array ***need to put in a method***
            int temp = intArray[2];
            intArray[2] = intArray[3];
            intArray[3] = temp;
            System.out.print("\n" + printArray(intArray));//print out the shuffled array

            //sorting the array ***need to put in a method***
            Arrays.sort(intArray);//this is how to sort the array
            System.out.print("\n" + printArray(intArray));// should print out the sorted array

            for (int i = 0; i < arraySize; i++){
                intArray[i] = i * 10; //where you'll use the random number gen

            }//end for loop

            for (int value : intArray){
                System.out.print(value + " ");
            }//end for loop
//----------------------------------------------------------------------------------------------------------------------
            //asking if user wants to re-run the program.
            System.out.println("Again: Y/N? ");
            input = cin.nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }// end if statement
//----------------------------------------------------------------------------------------------------------------------
        }//end while loop

    }//end main

//----------------------------------------------------------------------------------------------------------------------

    // other methods

    private  static void loadArray(int[] values){
        //put the random number gen in here!!!
        int len = values.length;
        for (int i = 0; i < len; i++){
            values[i] = i * 10;//random number generator goes here 0-1000
        }//end for loop
    }//end loadArray method

    private static String printArray(int[] values){
        StringBuilder sb = new StringBuilder();
        //String output = "";//was using instead of string builder ***DO NOT USE***
        for (int value : values){
            sb.append(value + " ");
            //output += value + " "; //was using instead of string builder ***DO NOT USE*** //using this will take a lot longer use the string builder instead re-watch yuja video.***DO NOT USE***
        }//end for loop
        return sb.toString();
        //return output;//was using instead of string builder ***DO NOT USE***
    }//end printArray

    private static void shuffle(int[] values){
        int shufflenumber = values.length * 1000;
        for (int i = 0; i < shufflenumber; i++){
            //swap (int[] values, int a, int b //*****moved to the swap method
            //swap (values, rand1, rand2);
        }//end for loop
    }//end shuffle method

    private static  void swap(int[] values, int a , int b){
        int temp = values [a];
        values[a] = values[b];
        values[b] = temp;
    }//end swap method

}//end class