import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* CustomerTest Class, tests customer class methods.
* Tests setLoacation, setLocation(overloaded), getLocation, 
* changeBalance, getBalance, toString and compareTo methods. 
*
* Activity 2 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/26/21
*/

public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** test for setLoaction(locationIn) method. **/
   @Test public void setLocationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");    
      Assert.assertEquals("Change Location Failed",
                         "Boston, MA", cstmr.getLocation());
   }
   /** test for setLoaction(city,state)/overloaded method. **/
   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");    
      Assert.assertEquals("Change Location Failed",
                         "Atlanta, GA", cstmr.getLocation());
   }
   /** A test for changeBalance() method.  **/
   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);    
      Assert.assertEquals(100.0, cstmr.getBalance(), .000001);
   }
   /** A test for toString method. **/
   @Test public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999); 
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
   /** A test for compareTo() method EQUALS. **/
   @Test public void compareToTest1() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);  
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500); 
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   /** A test for compareTo() method LESS-THAN. **/
   @Test public void compareToTest2() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);  
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500); 
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
   /** A test for compareTo() method GREATER-THAN. **/
   @Test public void compareToTest3() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);  
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500); 
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}
