import java.io.FileNotFoundException;
/**
* CloudStoragePart1 class, is the driver for the cloud storage app.
* instantiates each of the cloud storage objects then outputs data
* to the console.
* 
*     
*
* Project 6 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/24/21
*/
public class CloudStoragePart3 {
/**
   * main method generates a basic report, a report sorted by name,
   * a report sorted by cost and invalid records.
   * @param args the file to parse.
   * @throws FileNotFoundException if the file cannot be found/opened.
   */
   public static void main(String[] args) {
   
      try {
      
         if (args.length > 0) {
            CloudStorageList cList = new CloudStorageList();
            
            String file = args[0];
            cList.readFile(file);
            String report1 = cList.generateReport();
            String report2 = cList.generateReportByName();
            String report3 = cList.generateReportByMonthlyCost();
            String report4 = cList.generateInvalidRecordsReport();
         
            System.out.print(report1 + report2 + report3 + report4);
         }
         else {
            System.out.print("File name expected as command line"
                        + " argument." + "\nProgram ending.\n");
         
         }
      
      }
      catch (FileNotFoundException e) {
         System.out.print("*** Attempted to read file: " 
                        + e.getMessage() + "\n");
      
      }
   }
}