public class MidTerm {
    public static void main(String[] args){
        /**
         * Name: Shae Allen
         * Date: 10/28/2019
         * Project: Midterm Exam
         * Getting Started - This program will demonstrate the process/output paradigm. This program
         * takes yearly rain fall data for cities in TN in the form of a 2d array. The program uses
         * nested for loops, for each loops, and switch statements to calculate the average rain fall
         * for the city by year and the average for the state by month. The program also calculates
         * the months with the most/least rain fall for the year. The program formats the output so
         * the data will be easier to read.
         *
         */

        //2dArray
        int[][] precipitation = {
                {13, 14, 13, 11, 12, 12, 13, 11, 8, 9, 10, 11}, //Tri-cities rainfall for 12 months (Jan - Dec)
                {11, 10, 13, 10, 10, 11, 12, 10, 7, 8, 9, 11},  //Chattanooga rainfall for 12 months (Jan - Dec)
                {12, 11, 13, 11, 11, 11, 12, 10, 8, 7, 9, 11},  //Knoxville rainfall for 12 months (Jan - Dec)
                {10, 12, 11, 10, 10, 9, 9, 8, 6, 7, 9, 10},     //Memphis rainfall for 12 months (Jan - Dec)
                {11, 11, 12, 11, 11, 10, 10, 9, 8, 7, 9, 11},   //Nashville rainfall for 12 months (Jan - Dec)
                {11, 13, 12, 11, 11, 11, 12, 10, 8, 7, 10, 12}  //Oak Ridge rainfall for 12 months (Jan - Dec)
        };
        //--------------------------------------------------------------------------------------------------------------

        //calls the printRainFall method
        printRainFall(precipitation);

        //calls the stateAvg method
        stateAvg(precipitation);

    }//end main



    //------------------------------------------------------------------------------------------------------------------
    //----------METHODS-------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * this method prints out the formatted header and prints the information
     * out to the console.
     * @param args - args is not used in this application.
     */
    private static void printHeader(){
            //--------OUTPUT-----------------------------------------------------------
            System.out.printf("%15s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%10s%10s%10s\n",
                    "",
                    "Jan",
                    "Feb",
                    "Mar",
                    "Apr",
                    "May",
                    "Jun",
                    "Jul",
                    "Aug",
                    "Sep",
                    "Oct",
                    "Nov",
                    "Dec",
                    "Avg/Mon",
                    "Max Mon",
                    "Min Mon");
            System.out.printf("%15s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%10s%10s%10s\n",
                    "",
                    "---",
                    "---",
                    "---",
                    "---",
                    "---",
                    "---",
                    "---",
                    "---",
                    "---",
                    "---",
                    "---",
                    "---",
                    "-------",
                    "-------",
                    "-------");

    }//end printHeader method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * this method prints out the formatted footer and prints the information
     * out to the console.
     * @param args - args is not used in this application.
     */
    private static void printFooter(){
        //--------OUTPUT-----------------------------------------------
        System.out.printf("%15s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s%6s\n",
                "",
                "-----",
                "-----",
                "-----",
                "-----",
                "-----",
                "-----",
                "-----",
                "-----",
                "-----",
                "-----",
                "-----",
                "-----");
    }//end printFooter method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method uses a switch construct to convert the index position to a
     * string of the city and prints the information out to the console.
     * parameters = int i
     * @param args - args is not used in this application.
     */
    private static String convertIndexToCity(int i) {
        //--------OUTPUT-----------------------------------------------
        // switch statement assigns the name to the row using the "i" from the nested for loop (could use if statement)
        String city = " ";
        switch(i){
            case 0:
                city = "Tri-Cities: ";
                break;
            case 1:
                city = "Chattanooga: ";
                break;
            case 2:
                city = "Knoxville: ";
                break;
            case 3:
                city = "Memphis: ";
                break;
            case 4:
                city = "Nashville: ";
                break;
            case 5:
                city = "Oak Ridge: ";
                break;
        }//end switch
        return city;
    }//end convertIndexToName method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method uses a switch construct to convert the index position to a
     * string of the month and prints the information out to the console.
     * parameters = int i
     * @param args - args is not used in this application.
     */
    private static String convertIndexToMonth(int i) {
        //--------OUTPUT-----------------------------------------------
        // switch statement assigns the name to the row using the "i" from the nested for loop (could use if statement)
        String month = " ";
        switch(i){
            case 0:
                month = "Jan";
                break;
            case 1:
                month = "Feb";
                break;
            case 2:
                month = "Mar";
                break;
            case 3:
                month = "Apr";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "Jun";
                break;
            case 6:
                month = "Jul";
                break;
            case 7:
                month = "Aug";
                break;
            case 8:
                month = "Sep";
                break;
            case 9:
                month = "Oct";
                break;
            case 10:
                month = "Nov";
                break;
            case 11:
                month = "Dec";
                break;
        }//end switch
        return month;
    }//end convertIndexToName method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method prints out the 2d array data, calls the printHeader,
     * convertIndexToCity, calcAverage, maxRainFall, and minRainFall methods
     * and prints the information out to the console.
     * parameters = int[][] rain
     * @param args - args is not used in this application.
     */
    private static void printRainFall(int[][] rain){
        //--------PROCESS AND OUTPUT-----------------------------------------------
        //calls the printHeader method
        printHeader();

        //nested for loop to parse the array
        for(int i =0; i <rain.length; i++){
            //calls the convertIndexToCity and only formats the string once
            System.out.printf("%15s", convertIndexToCity(i));
            for(int j =0; j <rain[i].length; j++){

                //will print out the array (all in one line) formats once the "%6d" is for int
                System.out.printf("%6d",rain[i][j]);
            }//end nested for loop


            //calls the calcAverage method
            System.out.printf("%10.2f", calcAverage(rain[i]));


            //calls the max rain fall method
            //System.out.printf("%10d", maxRainFall(rain[i]));
            maxRainFall(rain[i]);

            //calls the min rain fall  method
            //System.out.printf("%10d", minRainFall(rain[i]));
            minRainFall(rain[i]);

            //will add a breaking point for each row
            System.out.println();

        }//end for loop
    }//end printRainFall method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method uses a for each loop to calculate the average rain fall for each city.
     * parameters = int[] rainFall
     * @param args - args is not used in this application.
     */
    private static double calcAverage(int[] rainFall){
        //-----PROCESS--------------------------------
        //variables
        double avg =0.0;
        int total = 0;

        //process
        //for each loop
        for(int rain : rainFall){
            total += rain;
            avg = (double)total / rainFall.length;
        }//end for each loop

        return avg;
    }//end calcAverage method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * this method uses a for each loop to determine the max amount of rain fall
     * and calls the parseForMonth method to assign the month to the value.
     * parameters = int[] rainFall
     * @param args - args is not used in this application.
     */
    private static int maxRainFall(int[] rainFall){
        //---------PROCESS------------------------
        //variables
        int tempRain = rainFall[0];
        //process
        for(int rain : rainFall){
            if (tempRain < rain){
                tempRain = rain;
            }//end if statement
        }//end for each loop
        //calls the parseForMonth method
        parseForMonth(rainFall,tempRain);
        return tempRain;
    }//end maxRainFall method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * this method uses a for each loop to determine the min amount of rain fall
     * and calls the parseForMonth method to assign the month to the value.
     * parameters = int[] rainFall
     * @param args - args is not used in this application.
     */
    private static int minRainFall(int[] rainFall){
        //---------PROCESS--------------------------------
        //variables
        int tempRain = rainFall[0];
        //process
        for(int rain : rainFall){
            if (tempRain > rain){
                tempRain = rain;
            }//end if statement
        }//end for each loop
        //calls the parseForMonth method
        parseForMonth(rainFall,tempRain);
        return tempRain;
    }//end minRainFall method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method uses a nester for loop to calculate the monthly averages of
     * rain fall by month, and calls the printFooter and calcAverage method and
     * prints the information to the console.
     * parameters = int[][] precipitation
     * @param args - args is not used in this application.
     */
    private static void stateAvg(int[][] precipitation) {
        //---------PROCESS AND OUTPUT--------------------
        //calls the printFooter method
        printFooter();
        //variables
        int[] tempArray = new int[6];
        System.out.printf("%15s", "State Avg: ");
        //for loop/nested for loop
        for(int j = 0; j < precipitation[0].length; j++) {
            for (int i = 0; i < precipitation.length; i++) {
                tempArray[i] = (precipitation[i][j]);
            }//end nested for loop
            //calls the calcAverage method
            System.out.printf("%6.2f", calcAverage(tempArray));
        }//end for loop
        System.out.println();
    }//end stateAvg method
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * this method uses a for loop to parse an array for the matching max/min
     * value and calls the convertIndexToMonth method to assign value to month
     * and prints it out to the console.
     * parameters =int[]rain, int value
     * @param args - args is not used in this application.
     */
    private static void parseForMonth(int[]rain, int value){
        //---------PROCESS AND OUTPUT-----------------------
        //for loop
        for (int i = 0; i < rain.length; i++){
                int tempValue = rain[i];
                    if (value == tempValue){
                        //calls the convertIndexToMonth method
                        System.out.printf("%10s", convertIndexToMonth(i));
                    }//end if statement
        }//end for loop
    }//end parseForMonth method
    //------------------------------------------------------------------------------------------------------------------
}//end class
