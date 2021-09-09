/**
* CloudStoragePart1 class, is the driver for the cloud storage app.
* instantiates each of the cloud storage objects then outputs data
* to the console.
* 
*     
*
* Project 4 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/
public class CloudStoragePart1 {
/**
    * The driver for cloud storage app.
    * @param args not used.
    */
   public static void main(String[] args) {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      
      System.out.print("\n");
      System.out.print(c1 + "\n\n"
                     + c2 + "\n\n"
                     + c3 + "\n\n"
                     + c4 + "\n\n"
                     + c5);
                     
   }
}