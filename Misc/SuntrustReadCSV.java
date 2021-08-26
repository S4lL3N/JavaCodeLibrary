import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
//==========================================================================================================
        //variables
        String csvFile = "October.csv"; //file name  November
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ","; //split on
        int counter = 0;

        double debitTotal = 0.0;
        String totalSpent;

        String workGasStation = " KROGER FU 31 M             BRIS";
        double workGasTotal = 0.0;
        String gasWork;

        double credits = 0.0;
        String deposits;

//==========================================================================================================
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                counter++;

                // use comma as separator
                String[] transactions = line.split(cvsSplitBy);
                /*
                System.out.println("transactions " +
                        "[Date= " + transactions[0] + " ," +
                        " Debit Amount=" + transactions[3] +
                        " Description=" + transactions[2] + "]");

                 */
                //------------------------------------------------------------------------------------------
                //to skip the header
                if(counter > 1) {
                    debitTotal += Double.parseDouble(transactions[3]);
                    credits += Double.parseDouble(transactions[4]);

                    //to check for kroger gas transactions and calculate total
                    if(transactions[2].equals(workGasStation)){
                        //System.out.println("the discription = workGasStation");
                        workGasTotal += Double.parseDouble(transactions[3]);
                    }//end if statement
                }//end if statement
                //------------------------------------------------------------------------------------------
            }//end while loop

//==========================================================================================================
           //output to console
            totalSpent = String.format ("%.2f", debitTotal);
            gasWork = String.format ("%.2f", workGasTotal);
            deposits = String.format("%.2f", credits);

            System.out.print(
                    "\nTotal Debits: " + totalSpent
                    + "\nTotal Work Gas: " + gasWork
                    + "\nTotal deposits: " + deposits);
//==========================================================================================================

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
