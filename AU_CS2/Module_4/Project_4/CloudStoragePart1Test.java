import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* CloudStoragePart1Test Class, tests the CloudStoragePart1 class methods.
*
*
* Project 4 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/08/21
*/   

public class CloudStoragePart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test the get count and reset count of cloud storage objs. **/
   @Test public void getCountTest() {
      CloudStoragePart1.main(null);
      Assert.assertEquals("get count failed", 5,
                                           CloudStorage.getCount(), .0001);
      CloudStorage.resetCount();
      Assert.assertEquals("get count failed", 0,
                                           CloudStorage.getCount(), .0001);
   }
   
}
