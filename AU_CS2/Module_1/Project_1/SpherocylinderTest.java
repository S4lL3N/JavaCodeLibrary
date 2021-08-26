import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
/**
* SpherocylinderTest Class, tests the Spherocylinder class methods.
* Tests the get/set label, get/set radius, get/set/ cylinder height,
* circumfence, surface area, volume, get/reset count and the to string 
* methods.
*
* Project 1 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/22/21
*/

public class SpherocylinderTest {
   //GETTER And SETTER tests
   /** Label tests. **/
   @Test public void labelTest() {
      //get label test
      Spherocylinder sc = new Spherocylinder("", 1.5, 1.5);
      Assert.assertEquals("getLabel() Failed ", "", sc.getLabel());
      //set label test
      sc.setLabel("test   ");
      Assert.assertEquals("setLabel() Failed ", "test", sc.getLabel());
      //null test
      Assert.assertEquals("set label to null_Failed ", 
                              false, sc.setLabel(null));
   }
   
   
   /** Radius tests. **/
   @Test public void radiusTest() {
      //getRadius() test
      Spherocylinder sc = new Spherocylinder("test", 1.5, 2.5);
      Assert.assertEquals("getRadius() Failed ", 1.5, sc.getRadius(), .000001);
      //setRadiusTest()
      sc.setRadius(500.00);
      Assert.assertEquals("setRadius() Failed ",
                               500.00, sc.getRadius(), .000001);
      //negativeRadiusTest()
      Assert.assertEquals("negative radius Failed ", false, sc.setRadius(-3.0));
   }
   
   
   /** Cylinder tests. **/
   @Test public void cylinderHeightTest() {
     //getCylinderTest()
      Spherocylinder sc = new Spherocylinder("test", 5.0, 6.0);
      Assert.assertEquals("getCylinderHeight() Failed ",
                            6.0, sc.getCylinderHeight(), .000001);
      //setCylinderTest()
      sc.setCylinderHeight(2500.00);
      Assert.assertEquals("setCylinderHeight Failed ",
                               2500.00, sc.getCylinderHeight(), .000001);
      //negativeCylinderTest()
      Assert.assertEquals("negative cylinder height Failed ",
                                       false, sc.setCylinderHeight(-3.0));
   }
   
   
   //METHOD tests
   /** circumference test. **/
   @Test public void circumferenceTest() {
      Spherocylinder sc = new Spherocylinder("circumferenceTest", 0.5, .25);
      Assert.assertEquals("Small ex_circumference test failed ",
                                           3.142, sc.circumference(), .001);
      sc.setRadius(10.8);
      sc.setCylinderHeight(10.1);
      Assert.assertEquals("Med ex_circumference test failed ",
                                           67.858, sc.circumference(), .001);
      sc.setRadius(98.32);
      sc.setCylinderHeight(99.0);
      Assert.assertEquals("Large ex_circumference test failed ",
                                           617.763, sc.circumference(), .001);
   }
   /** surface area tests. **/
   @Test public void surfaceAreaTest() {
      Spherocylinder sc = new Spherocylinder("surfaceArea Test", 0.5, .25);
      Assert.assertEquals("Small ex_surface area test failed ",
                                              3.927, sc.surfaceArea(), .001);
      sc.setRadius(10.8);
      sc.setCylinderHeight(10.1);
      Assert.assertEquals("Med ex_surface area test failed ",
                                           2151.111, sc.surfaceArea(), .001);
      sc.setRadius(98.32);
      sc.setCylinderHeight(99.0);
      Assert.assertEquals("Large ex_surface area test failed ",
                                           182635.388, sc.surfaceArea(), .001);
   }
   /** volume tests. **/
   @Test public void volumeTest() {
      Spherocylinder sc = new Spherocylinder("volume Test", 0.5, .25);
      Assert.assertEquals("Small ex_volume test failed ",
                                                       0.72, sc.volume(), .001);
      sc.setRadius(10.8);
      sc.setCylinderHeight(10.1);
      Assert.assertEquals("Med ex_volume test failed ",
                                                   8977.666, sc.volume(), .001);
      sc.setRadius(98.32);
      sc.setCylinderHeight(99.0);
      Assert.assertEquals("Large ex_volume test failed ",
                                               6987754.655, sc.volume(), .001);
   }
   /** get count test. **/
   @Test public void getCountTest() {
      Spherocylinder.resetCount();
      Assert.assertEquals("getCount() Failed: ", 0, Spherocylinder.getCount());
      Spherocylinder sc = new Spherocylinder("volume Test", 0.5, .25);
      Assert.assertEquals("getCount() Failed: ", 1, Spherocylinder.getCount());
   }
   /** reset count test. **/
   @Test public void resetCountTest() {
      Spherocylinder.resetCount();
      Assert.assertEquals("getCount() Failed: ", 0, Spherocylinder.getCount());
      Spherocylinder sc = new Spherocylinder("volume Test", 0.5, .25);
      Assert.assertEquals("getCount() Failed: ", 1, Spherocylinder.getCount());
      Spherocylinder.resetCount();
      Assert.assertEquals("getCount() Failed: ", 0, Spherocylinder.getCount());
   }
   /** to string test. **/
   @Test public void toStringTest() {
   //Small example
      Spherocylinder sc = new Spherocylinder("Small Example", 0.5, .25);
      Assert.assertTrue(sc.toString().contains("\"Small Example\""));
      Assert.assertTrue(sc.toString().contains("0.5"));
      Assert.assertTrue(sc.toString().contains(".25"));
      Assert.assertTrue(sc.toString().contains("3.142"));
      Assert.assertTrue(sc.toString().contains("3.927"));
      Assert.assertTrue(sc.toString().contains("0.72"));
      //Medium example
      Spherocylinder sc1 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Assert.assertTrue(sc1.toString().contains("\"Medium Example\""));
      Assert.assertTrue(sc1.toString().contains("10.8"));
      Assert.assertTrue(sc1.toString().contains("10.1"));
      Assert.assertTrue(sc1.toString().contains("67.858"));
      Assert.assertTrue(sc1.toString().contains("2,151.111"));
      Assert.assertTrue(sc1.toString().contains("8,977.666"));
      //large example
      Spherocylinder sc2 = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertTrue(sc2.toString().contains("\"Large Example\""));
      Assert.assertTrue(sc2.toString().contains("98.32"));
      Assert.assertTrue(sc2.toString().contains("99.0"));
      Assert.assertTrue(sc2.toString().contains("617.763"));
      Assert.assertTrue(sc2.toString().contains("182,635.388"));
      Assert.assertTrue(sc2.toString().contains("6,987,754.655"));
   }
   /** tests equals() True. **/
   @Test public void equalsTrueTest() {
      Spherocylinder sc = new Spherocylinder("equalsTest", 1.5, 1.5);
      Spherocylinder obj = new Spherocylinder("equalsTest", 1.5, 1.5);
      boolean test = false;
      test = sc.equals(obj);
      Assert.assertTrue(test);
   }
    /** tests equals false. **/
   @Test public void equalsFalseTest() {
      Spherocylinder sc = new Spherocylinder("test", 1.5, 1.5);
      String testObj = "";
      boolean test = sc.equals(testObj);
      Assert.assertFalse(test);
   }
   /** tests equals() False. **/
   @Test public void equalsFalseLabelTest() {
      Spherocylinder sc = new Spherocylinder("equalsTest", 1.5, 1.5);
      Spherocylinder obj = new Spherocylinder("", 0, 0);
      boolean test = false;
      test = sc.equals(obj);
      Assert.assertFalse(test);
   }
   /** tests equals() label. **/
   @Test public void equalsLabelTest() {
      Spherocylinder sc = new Spherocylinder("equalsTest", 1.5, 1.5);
      Spherocylinder obj = new Spherocylinder("equalsTest#2", 1.5, 1.5);
      boolean test = false;
      test = sc.equals(obj);
      Assert.assertFalse(test);
   }
   /** tests equals() radius. **/
   @Test public void equalsRadiusTest() {
      Spherocylinder sc = new Spherocylinder("equalsTest", 1.5, 1.5);
      Spherocylinder obj = new Spherocylinder("equalsTest", 5.5, 1.5);
      boolean test = false;
      test = sc.equals(obj);
      Assert.assertFalse(test);
   }
   /** tests equals() cylinder height. **/
   @Test public void equalsCylinderHeightTest() {
      Spherocylinder sc = new Spherocylinder("equalsTest", 1.5, 1.5);
      Spherocylinder obj = new Spherocylinder("equalsTest", 1.5, 5.5);
      boolean test = false;
      test = sc.equals(obj);
      Assert.assertFalse(test);
   }
   /** test hashCode(). **/
   @Test public void hashCodeTest() {
      Spherocylinder sc = new Spherocylinder("test", 1.5, 1.5);
      int testReturn = sc.hashCode();
      Assert.assertEquals(0, testReturn, .00001);
   }
   
}
