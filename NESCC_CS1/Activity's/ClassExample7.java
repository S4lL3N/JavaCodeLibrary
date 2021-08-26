public class ClassExample7 {
    public static void main(String[] args){
        /**
         EXAM IS NEXT WEEK!!!!

         exam will be similar to connectFour project.
         Will have printf / formatting //printf s=space, d=int, f=float.

         */

        //2d array
        int [][] grades ={
                {77,88,63,100,55}, //bob
                {70,48,63,90,66}, //jill
                {71,81,2,93,77}, //jane
                {83,83,82,88,88} //jim
        };

        //prints out the number of rows in the array
        //System.out.println(grades.length);
        //prints out hte number or columns
        //System.out.println(grades[0].length);

        printgrades(grades);

        //print the class max grade
        System.out.println(maxClassgrade(grades));
        //----------------------------------------------------------------------------------------------------------------
        int counter = 0;
        while(counter < grades[0].length) {

            int[] tempArray = new int[4];
            // will parse the column
            for (int i = 0; i < grades.length; i++) {
                tempArray[i] = (grades[i][0]);
            }//end for loop

            System.out.println(maxGrade(tempArray));
            counter++;
        }
        //--------------------------------------------------------------------------------------------------------------
    }//end main

    private static void printgrades(int[][] values){
        printHeader();

        //nested for loop to parse the array
        for(int i =0; i <values.length; i++){
            //calls the convert index To name and only formats the string once
            System.out.printf("%15s", convertIndexToName(i));
            for(int j =0; j <values[i].length; j++){

                //will print out the array (all in one line) formats once the "%10d" is for int
                System.out.printf("%10d",values[i][j]);
            }//end nested for loop


            //calls the calcAverage method
            System.out.printf("%10.2f", calcAverage(values[i]));

            //calls the max grade method
            System.out.printf("%10d", maxGrade(values[i]));

            //will add a breaking point for each row
            System.out.println();

        }//end for loop
    }//end method

    //------------------------------------------------------------------------------------------------------------------
    private static double calcAverage(int[] grades){
        double avg =0.0;
        int total = 0;

        //for each loop
        for(int grade: grades){
            total += grade;
            avg = (double)total / grades.length;
        }

        return avg;
    }//end method

    //------------------------------------------------------------------------------------------------------------------
    private static int maxGrade(int[] grades ){

        int tempGrade = grades[0];

        for(int grade : grades){
            if (tempGrade < grade){
                tempGrade = grade;
            }//end if statement

        }//end for each loop
        return tempGrade;
    }//end method

    //------------------------------------------------------------------------------------------------------------------
    private static int maxClassgrade(int[][] grades){
        int tempGrade = grades[0][0];

        for(int [] gradeArray : grades ){
            for(int grade : gradeArray){
                if (tempGrade < grade){
                    tempGrade = grade;
                }//end if statement

            }//end nested for loop
        }//end for each loop
        return tempGrade;
    }//end method


    //------------------------------------------------------------------------------------------------------------------
    private static void printHeader() {
        System.out.printf("%10s%10s%10s%10s%10s%10s%10s\n",
                "",
                "grade-1",
                "grade-2",
                "grade-3",
                "grade-4",
                "grade-5",
                "Average");
        System.out.printf("%10s%10s%10s%10s%10s%10s%10s\n",
                "",
                "-------",
                "-------",
                "-------",
                "-------",
                "-------",
                "-------");
    }

    //----------------------------------------------------------------------------------------------------------------------
    private static String convertIndexToName(int i) {
        // switch statement assigns the name to the row using the "i" from the nested for loop (could use if statement)
        String name = " ";
        switch(i){
            case 0:
                name = "bob: ";
                break;
            case 1:
                name = "jill: ";
                break;
            case 2:
                name = "jane: ";

                break;
            case 3:
                name = "jim: ";
                break;
        }//end switch
        return name;
    }//end method


}//end class