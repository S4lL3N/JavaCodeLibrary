/**
* This is the UserInfo Class, creates a UserInfo object.
* UserInfo has name, age, location, and status attributes.
* 
* Activity 4
* @author  Shae Allen – CPSC-1210-AO1 
* @version 6/15/21
*/
public class UserInfo {
   //Instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

   //Constructor 
   /**
   * UserInfo Constructor. 
   * @param firstNameIn the users first name.
   * @param lastNameIn  the users last name.
   */ 
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   
   //Methods
   /**
    * toString returns a strng od user data.
    * @return output UserInfo attribute data 
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName +  "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }

//Getter's and Setter's
   /**
    * Set's user location.
    * @param locationIn UserInfo loacation data.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
    /**
    * Get's user location.
    * @return location UserInfo location data.
    */
   public String getLocation() {
      return location;
   }
   /**
    * Checks if age is greater than 0, then sets age.
    * @param ageIn UserInfo age data.
    * @return age UserInfo age data.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * Get's user age.
    * @return age UserInfo age data.
    */  
   public int getAge() {
      return age;
   }
    /**
    * Set user statusto Offline.
    */
   public void logOff() {
      status = OFFLINE;
   }
   /**
    * Set user status to Online.
    */
   public void logOn() {
      status = ONLINE;
   }
}
