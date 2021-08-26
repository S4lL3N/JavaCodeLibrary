/**
* This is the driver class that houses the main method.
* The program creates two instances of the UserInfo 
* object/class along with class methods.
*
* Activity 4
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/15/21
*/
public class UserInfoDriver {
   /**
    *
    * Creates two instances of the UserInfo Class.
    * @param args Command line arguments – not used.
    */
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}