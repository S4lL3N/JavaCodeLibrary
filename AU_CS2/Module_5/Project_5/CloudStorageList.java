import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
  /**
* CloudStorageList class, creates a cloud storage list object.
* The class has methods to get the cloud storage array and,
* get invalid recods. Methods to add to the cloud storage array
* and add invalid recods. along with a method to read a file, and
* generate a basic reports and reports based on name, and cost.
* 
*     
*
* Project 5 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/15/21
*/
public class CloudStorageList {

   //instance variables
   private CloudStorage[] csList;
   private String[] invalidRecords;
   /**
   * Cloud storage list constructor.
   */
   public CloudStorageList() {
      csList = new CloudStorage[0];
      invalidRecords = new String[0];
   }
   /**
   * gets the cloud storage array.
   * @return csList array of cloud storage objs.
   */
   public CloudStorage[] getCloudStorageArray() {
      return csList; 
   }
   /**
   * gets the invalidRecords array.
   * @return invalidRecords array of invalidRecords.
   */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
   /**
   * adds an object to the CloudStorage[] array.
   * @param objIn is the object to be added.
   */
   public void addCloudStorage(CloudStorage objIn) {
      csList = Arrays.copyOf(csList, csList.length + 1);
      csList[csList.length - 1] = objIn;
   }
   /**
     * adds an invalid record.
     * @param invalidRecordsIn is the invailid record. 
     */
   public void addInvalidRecord(String invalidRecordsIn) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invalidRecordsIn;
   }
   /**
      * reads in a file and adds objects to the array.
      * @param dataFile is the file name to read.
      * @throws FileNotFoundException if the file cannot be opened.
      */
   public void readFile(String dataFile) throws FileNotFoundException {
   
      Scanner fileScan = new Scanner(new File(dataFile));
      char identifier;
      
      
      while (fileScan.hasNext()) {
         String theline = fileScan.nextLine();
         Scanner linescan = new Scanner(theline);
         linescan.useDelimiter(",");
         identifier = linescan.next().charAt(0);
            
         switch(identifier) {
            case 'D':
               String name = linescan.next();
               double bstorage = Double.parseDouble(linescan.next());
               double servercost = Double.parseDouble(linescan.next());
               CloudStorage dfile = new DedicatedCloud(name,
                                                 bstorage, servercost);
               addCloudStorage(dfile);
               break;
               
            case 'S':
               String name1 = linescan.next();
               double bstorage1 = Double.parseDouble(linescan.next());
               double stored = Double.parseDouble(linescan.next());
               double limit = Double.parseDouble(linescan.next());
               CloudStorage sfile = new SharedCloud(name1,
                                        bstorage1, stored, limit);
               addCloudStorage(sfile);
               break;
               
            case 'C':
               String name2 = linescan.next();
               double bstorage2 = Double.parseDouble(linescan.next());
               double stored1 = Double.parseDouble(linescan.next());
               double limit1 = Double.parseDouble(linescan.next());
               CloudStorage cfile = new PublicCloud(name2,
                                        bstorage2, stored1, limit1);
               addCloudStorage(cfile);
               break;
               
            case 'P':
               String name3 = linescan.next();
               double bstorage3 = Double.parseDouble(linescan.next());
               double stored2 = Double.parseDouble(linescan.next());
               double limit2 = Double.parseDouble(linescan.next());
               CloudStorage pfile = new PersonalCloud(name3,
                                        bstorage3, stored2, limit2);
               addCloudStorage(pfile);
               break;
               
            default:
               String stringin = Character.toString(identifier);
                  //break;
         }
      }
   }
   
   /**
      * generates a report based on the order of the array.
      * @return String
      */
   public String generateReport() {
      String obs2 = "";
      for (int i = 0; i < csList.length; i++) {
         obs2 += csList[i] + "\n\n";
      }
      
      
      String report = "-------------------------------" 
                  + "\nMonthly Cloud Storage Report" 
                  + "\n-------------------------------"
                  + "\n" + obs2;
      return report;
   
   }
      
      /**
      * generates a report based on the names of objects.
      * @return String
      */
   public String generateReportByName() {
      Arrays.sort(getCloudStorageArray());
      String obs = "";
      
      for (int i = 0; i < csList.length; i++) {
         obs += csList[i] + "\n\n"; 
      
      }
      
      
      String namereport = "-----------------------------------------" 
                        + "\nMonthly Cloud Storage Report (by Name)"
                        + "\n-----------------------------------------"
                        +  "\n" + obs;
      return namereport;
   
   }
      
   /**
       * generates a report based on monthly cost.
       * @return String
       */
   public String generateReportByMonthlyCost() {
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator());
   
      String obs1 = "";
      for (int i = 0; i < csList.length; i++) {
         obs1 += csList[i] + "\n\n";
      
      }
   
   
      String costreport = "-------------------------------------------------"
                        + "\nMonthly Cloud Storage Report (by Monthly Cost)"
                        + "\n-------------------------------------------------"
                        + "\n" + obs1;
      return costreport;
   
   }
      
      
}