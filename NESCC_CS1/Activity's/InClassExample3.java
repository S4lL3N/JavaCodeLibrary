
import java.util.Scanner;

public class InClassExample3 {
    public static void main(String[] args) {

        Scanner consoleIn = new Scanner(System.in);

        //will act like a print if you do not use a format
        //start with "%10s" = col 10 characters wide and a string
        System.out.printf("%10s","hello");

        System.out.printf("\n%10s%10s","hello", "world");

        // the - will join the two columns
        System.out.printf("\n%10s%-10s","hello","world");

        //the 10.2f adds a floating point value( it will round)
        System.out.printf("\n%10s%-10s%10.2f","hello","world\n", 3.141535560);

        //using the other method--- calling the return.
        System.out.printf(createHeader());



//----------------------------------------------------------------------------------------------------------------------
        String input = "";
        System.out.print("enter a single character:");
        input = consoleIn.nextLine();
        System.out.println(input.length());
        System.out.println(System.nanoTime());

        long startTime; // casting as a "long" value type
        long endTime; // casting as a "long" value type

        //create a character
        char charValue;



        startTime = System.nanoTime();// the start time in nano seconds
        // checks the length of the input
        System.out.println(input.length());

        if (input.length() == 0 ){
            System.out.println("Must enter a single character");
            System.exit(-1);
        }
        if (input.length() > 1){
            System.out.println("Must enter a single character");
            System.exit(-2);
        }


        // will find the character in the "0" place.
        System.out.println(input.charAt(0));


        //getting the input for the char.
        charValue =input.charAt(0);



        switch (charValue){
            // a character always uses single quotes *** must put a break
            case 'a':
                System.out.println("found lower case 'a'");
                break; // must use a break or it will continue to find cases
            case 'b':
                System.out.println("found a lower case 'b'");
                // must use a break or it will continue to find cases or it will find the 'b' as well
                break;

            //case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("found an lower case vowel");
                break;
        }//end switch

        switch ((int)charValue){
            case 97:
            case 101:
                break;
        }//end switch

        // print out the char value for ascii value 113
        System.out.println((char)113);

        //or  casting as an int will give the ascii value *** can use to check for correct input by using a range of ascii table
        System.out.println((int)input.charAt(0));

        // when the program ended in nano seconds
        endTime = System.nanoTime(); // when the program ended in nano seconds

        // how long it took the program to run
        System.out.println("time it took: " + (endTime - startTime) / 1000000000.0);


        //closing the the scanner
        consoleIn.close();



    }//end main


    //creates a new method
    public static String createHeader(){
        String output = "";
        output += "\n++++++++++++++\n";
        output += "    Welcome   \n";
        output += "++++++++++++++\n";

        //returns output
        return output;
    }//end create header

}// end class