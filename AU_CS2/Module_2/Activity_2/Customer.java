/**
* Customer Class, creates a customer object.
* Customer has customerName, customerLocation and customerBalance attributes and
* setLoacation, setLocation(overloaded), getLocation, changeBalance, getBalance,
* toString and compareTo methods. Customer class objects implements comparable 
* to be able to compare the customer objects.
*
*
* Activity 2 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/26/21
*/
public class Customer implements Comparable<Customer> {

   //instance variables 
   private String customerName = "";
   private String customerLocation = "";
   private double customerBalance = 0.0;
   
   //constructor
   /**
   * Customer Constructor. 
   * @param nameIn the customer name.
   */ 
   public Customer(String nameIn) {
      customerName = nameIn;
      customerLocation = "";
      customerBalance = 0;
   }
    /**
    * Set's customer location.
    * @param locationIn the customer location.
    */
   public void setLocation(String locationIn) {
      customerLocation = locationIn;
   }
    /**
    * Set's customer location.
    * @param city the customer city.
    * @param state the customer state.
    */
   public void setLocation(String city, String state) {
      customerLocation = city + ", " + state;
   }
   /**
    * Changes the customer balance.
    * @param amount the customer balance amount.
    */
   public void changeBalance(double amount) {
      customerBalance = customerBalance + amount;   
   }
   /**
    * Gets custome location.
    * @return customerLocation String of customer location.
    */
   public String getLocation() {
      return customerLocation;   
   }
   /**
    * Gets customer balance.
    * @return customerBalance double of customer balance.
    */
   public double getBalance() {
      return customerBalance;
   }
   /**
    * toString returns a string of customer data.
    * @return output customer attribute data. 
    */
   public String toString() {
      String output = customerName;
      output += "\n" + customerLocation;
      output += "\n$" + customerBalance;
      return output;
   }
   /**
    * Compares customer objects. 
    * @param obj A customer object.
    * @return int O if equal, -1 if this.obj is smaller,
    * 1 if this.obj is larger.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.customerBalance - obj.getBalance()) < 0.000001) {
         return 0; //consider them equal and return 0.
      }
      else if (this.customerBalance < obj.getBalance()) {
         return -1; //return negative
      }
      else {
         return 1; //return positive
      }
   }
   
}
