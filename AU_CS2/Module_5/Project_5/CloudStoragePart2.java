import java.io.FileNotFoundException;
/**
* CloudStoragePart2 class, is the driver for the cloud storage app.
*   
*
* Project 5 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/15/21
*/ 
public class CloudStoragePart2 {
   /**
   * main method generates a basic report, a report sorted by name,
   * and a report sorted by cost.
   * @param args the file to parse.
   * @throws FileNotFoundException if the file cannot be found/opened.
   */
   public static void main(String[] args) throws FileNotFoundException {
      
      if (args.length > 0) {
         String filenamein = args[0];
         CloudStorageList listobject1 = new CloudStorageList();
         listobject1.readFile(filenamein);
         
         String report1 = listobject1.generateReport();
         String report2 = listobject1.generateReportByName();
         String report3 = listobject1.generateReportByMonthlyCost();
            
         System.out.print(report1 + report2 + report3);
      }
      else {
         System.out.print("File name expected as command line argument."
                     + "\nProgram ending." + "\n");
         
      }
         
      
      
   }   
   
}