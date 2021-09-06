import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* SpherocylinderListTest Class, tests the SpherocylinderList class methods.
*
*
* Project 3 
* @author  Shae Allen – CPSC-1220-AO1 
* @version 8/31/21
*/
public class SpherocylinderListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   
   /** test getName. **/
   @Test public void getNameTest() {
      Spherocylinder[] sc = new Spherocylinder[1];
      SpherocylinderList scList  = new SpherocylinderList("TEST", sc, 0);
      Assert.assertEquals("GetNameTest Failed ", "TEST", scList.getName());
   }
   
  
   /** test numberOfSpherocylinders. **/
   @Test public void numberOfSpherocylindersTest() {
      Spherocylinder[] sc = new Spherocylinder[1];
      SpherocylinderList scList  = new SpherocylinderList("TEST", sc, 1);
      Assert.assertEquals("numberOfSpherocylinders Failed ", 1,
                                        scList.numberOfSpherocylinders());
   }
   
     /**  test totalSurfaceArea. **/
   @Test public void totalSurfaceAreaTest() {
      Spherocylinder sc1 = new Spherocylinder("sc1 surfaceArea Test",
                                              0.5, .25);
      Assert.assertEquals("sc1 surface area test failed ",
                                              3.927, sc1.surfaceArea(), .001);
                                         
      Spherocylinder sc2 = new Spherocylinder("sc2 surfaceArea Test",
                                           10.8, 10.1);
      Assert.assertEquals("sc2 surface area test failed ",
                                          2151.111, sc2.surfaceArea(), .001);
   
      Spherocylinder sc3 = new Spherocylinder("sc3 surfaceArea Test",
                                           98.32, 99.0);
      Assert.assertEquals("sc3 surface area test failed ",
                                         182635.388, sc3.surfaceArea(), .001);
         
      Spherocylinder[] sc = new Spherocylinder[3];
      sc[0] = sc1;
      sc[1] = sc2;
      sc[2] = sc3;
         
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 3);
      Assert.assertEquals("totalSurfaceArea Failed", 184790.426,
                                           scList.totalSurfaceArea(), .001);
   }
   
    /**  test totalVolume. **/
   @Test public void totalVolumeTest() {
      Spherocylinder sc1 = new Spherocylinder("sc1 Volume Test", 0.5, .25);
      Assert.assertEquals("Small ex_volume test failed ",
                                                    0.72, sc1.volume(), .001);
                                         
      Spherocylinder sc2 = new Spherocylinder("sc2 Volume Test", 10.8, 10.1);
      Assert.assertEquals("Med ex_volume test failed ",
                                                8977.666, sc2.volume(), .001);
   
      Spherocylinder sc3 = new Spherocylinder("sc3 Volume Test", 98.32, 99.0);
      Assert.assertEquals("Large ex_volume test failed ",
                                             6987754.655, sc3.volume(), .001);
         
      Spherocylinder[] sc = new Spherocylinder[3];
      sc[0] = sc1;
      sc[1] = sc2;
      sc[2] = sc3;
         
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 3);
      Assert.assertEquals("totalVolume Failed", 6996733.041,
                                                 scList.totalVolume(), .001);
   }
    
     /**  test avgSurfaceArea. **/
   @Test public void avgSurfaceAreaTest() {
   
      Spherocylinder sc1 = new Spherocylinder("sc1 surfaceArea Test",
                                           0.5, .25);
      Assert.assertEquals("sc1 surface area test failed ",
                                              3.927, sc1.surfaceArea(), .001);
                                         
      Spherocylinder sc2 = new Spherocylinder("sc2 surfaceArea Test",
                                                                  10.8, 10.1);
      Assert.assertEquals("sc2 surface area test failed ",
                                           2151.111, sc2.surfaceArea(), .001);
   
      Spherocylinder sc3 = new Spherocylinder("sc3 surfaceArea Test",
                                                                 98.32, 99.0);
      Assert.assertEquals("sc3 surface area test failed ",
                                         182635.388, sc3.surfaceArea(), .001);
         
      Spherocylinder[] sc = new Spherocylinder[3];
      
      sc[0] = sc1;
      sc[1] = sc2;
      sc[2] = sc3;
         
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 3);
      Assert.assertEquals("avg SurfaceArea Failed", 61596.80867,
                                           scList.averageSurfaceArea(), .001);
                                           
      Spherocylinder[] sc22 = new Spherocylinder[5];  
      SpherocylinderList scList2 = new SpherocylinderList("TEST2", sc22, 0);
      Assert.assertEquals("avg SurfaceArea Failed", 0.0,
                                           scList2.averageSurfaceArea(), .001);
   }
   
    /**  test avgVolume. **/
   @Test public void avgVolumeTest() {
      Spherocylinder sc1 = new Spherocylinder("sc1 Volume Test", 0.5, .25);
      Assert.assertEquals("Small ex_volume test failed ",
                                                    0.72, sc1.volume(), .001);
                                         
      Spherocylinder sc2 = new Spherocylinder("sc2 Volume Test", 10.8, 10.1);
      Assert.assertEquals("Med ex_volume test failed ",
                                                8977.666, sc2.volume(), .001);
   
      Spherocylinder sc3 = new Spherocylinder("sc3 Volume Test", 98.32, 99.0);
      Assert.assertEquals("Large ex_volume test failed ",
                                             6987754.655, sc3.volume(), .001);
                                               
      Spherocylinder[] sc = new Spherocylinder[3];
      sc[0] = sc1;
      sc[1] = sc2;
      sc[2] = sc3;
         
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 3);
      Assert.assertEquals("avg Volume Failed", 2332244.347,
                                           scList.averageVolume(), .001);
                                           
      Spherocylinder[] sc22 = new Spherocylinder[5];
      SpherocylinderList scList2 = new SpherocylinderList("TEST2", sc22, 0);
      Assert.assertEquals("avg SurfaceArea Failed", 0.0,
                                           scList2.averageVolume(), .001); 
   }
   
     /**  test toString. **/
   @Test public void toStringTest() {
      Spherocylinder sc1 = new Spherocylinder("sc1 Volume Test", 0.5, .25);
      Assert.assertEquals("Small ex_volume test failed ",
                                                   0.72, sc1.volume(), .001);
                                            
      Spherocylinder sc2 = new Spherocylinder("sc2 Volume Test", 10.8, 10.1);
      Assert.assertEquals("Med ex_volume test failed ",
                                               8977.666, sc2.volume(), .001);
   
      Spherocylinder sc3 = new Spherocylinder("sc3 Volume Test", 98.32, 99.0);
      Assert.assertEquals("Large ex_volume test failed ",
                                             6987754.655, sc3.volume(), .001);
            
      Spherocylinder[] sc = new Spherocylinder[3];
      sc[0] = sc1;
      sc[1] = sc2;
      sc[2] = sc3;
            
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 3);
               
      String output = "----- Summary for TEST -----\n"
                     + "Number of Spherocylinders: 3\n"
                     + "Total Surface Area: 184,790.426\n"
                     + "Total Volume: 6,996,733.041\n"
                     + "Average Surface Area: 61,596.809\n"
                     + "Average Volume: 2,332,244.347";
            
      Assert.assertEquals("toString Failed", output, scList.toString());
           
      Assert.assertTrue(scList.toString().contains("----- Summary" 
                                                   + " for TEST -----"));
      Assert.assertTrue(scList.toString().contains("Number of "
                                                   + "Spherocylinders: 3"));
      Assert.assertTrue(scList.toString().contains("Total Surface"
                                                   + " Area: 184,790.426"));
      Assert.assertTrue(scList.toString().contains("Total Volume:"
                                                   + " 6,996,733.041"));
      Assert.assertTrue(scList.toString().contains("Average Surface"
                                                   + " Area: 61,596.809"));
      Assert.assertTrue(scList.toString().contains("Average Volume:"
                                                   + " 2,332,244.347"));
   
   }
   
   /**  test getList. **/
   @Test public void getListTest() {
      Spherocylinder[] sc = new Spherocylinder[1];
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 0);
      Assert.assertArrayEquals(sc, scList.getList());
   }
   
   /**  test addSpherocylinder. **/
   @Test public void addSpherocylinderTest() {
      Spherocylinder[] sc = new Spherocylinder[1];
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 0);
      scList.addSpherocylinder("Test", 4.20, 4.20);
      Assert.assertEquals(1, scList.numberOfSpherocylinders(), .0001);
      
   }
   
    /**  test findSpherocylinder true.**/
   @Test public void findSpherocylinderTrueTest() {
      Spherocylinder[] sc = new Spherocylinder[5];
                         
      Spherocylinder sc1 = new Spherocylinder("sc1", 0.5, .25);
      Spherocylinder sc2 = new Spherocylinder("sc2", 10.8, 10.1);
      Spherocylinder sc3 = new Spherocylinder("sc3", 98.32, 99.0);
      
      sc[0] = sc1;
      sc[1] = sc2;
      sc[2] = sc3;
                             
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 3);
      
      Spherocylinder findTest1 = scList.findSpherocylinder("sc1");
      Spherocylinder findTest2 = scList.findSpherocylinder("sc2");
      Spherocylinder findTest3 = scList.findSpherocylinder("sc3");
      
      Assert.assertEquals(sc[0], findTest1);
      Assert.assertEquals(sc[1], findTest2);
      Assert.assertEquals(sc[1], findTest2);
   }
      
      
    /**  test findSpherocylinder false .**/
   @Test public void findSpherocylinderFailTest() {
      Spherocylinder[] sc = {new Spherocylinder("Test", 4.20, 4.20)};
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 1);
      Spherocylinder find = scList.findSpherocylinder("Fail");
      Assert.assertEquals(null, find);
   }

   
   /**  test deleteSpherocylinder true. **/
   @Test public void deleteSpherocylinderTrueTest() {
      Spherocylinder[] sc = new Spherocylinder[6];
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 0);
         
      scList.addSpherocylinder("sc1", 4.20, 4.20);
      scList.addSpherocylinder("sc2", 0, 0);
      scList.addSpherocylinder("sc3", 1, 2);
      scList.addSpherocylinder("sc4", 2, 2);
         
      Assert.assertEquals(4, scList.numberOfSpherocylinders());
   
      scList.deleteSpherocylinder("sc3");
      Assert.assertEquals(3, scList.numberOfSpherocylinders());
      
      scList.deleteSpherocylinder("sc2");
      Assert.assertEquals(2, scList.numberOfSpherocylinders());
      
      Assert.assertEquals(null, sc[2]);
      Assert.assertEquals(null, sc[3]);
      
   }
   
   /**  test deleteSpherocylinder false. **/
   @Test public void deleteSpherocylinderFailTest() {
      Spherocylinder[] sc = new Spherocylinder[5];
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 0);
         
      scList.addSpherocylinder("Test", 4.20, 4.20);
      scList.addSpherocylinder("Delete", 0, 0);
         
      Assert.assertEquals(2, scList.numberOfSpherocylinders());
   
      scList.deleteSpherocylinder("failDeleteTEST");
      Assert.assertEquals(2, scList.numberOfSpherocylinders());
      
   }
   
   /**  test editSpherocylinder true. **/
   @Test public void editSpherocylinderTrueTest() {
      Spherocylinder[] sc = {new Spherocylinder("Test", 1, 1)};
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 1);
      boolean found = false;
      found = scList.editSpherocylinder("Test", 4.20, 4.20);
      Assert.assertTrue(found);
   }
      
      /**  test editSpherocylinder false. **/
   @Test public void editSpherocylinderFalseTest() {
      Spherocylinder[] sc = {new Spherocylinder("Test", 1, 1)};
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 1);
      boolean found = false;
      found = scList.editSpherocylinder("Fail", 4.20, 4.20);
      Assert.assertFalse(found);
   }
   
   /**  test findSpherocylinderWithLargestVolume. **/
   @Test public void findSpherocylinderWithLargestVolumeTrueTest() {
      Spherocylinder[] sc = new Spherocylinder[5];
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 0);
      scList.addSpherocylinder("Test", 4.20, 4.20);
      scList.addSpherocylinder("Test2", 0, 0);
      scList.addSpherocylinder("Test3", 1, 1);
      Spherocylinder largestVol = scList.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(sc[0], largestVol);
      
      scList.deleteSpherocylinder("Test");
      scList.deleteSpherocylinder("Test2");
      scList.deleteSpherocylinder("Test3");
      Assert.assertEquals(0, scList.numberOfSpherocylinders());
      
      scList.addSpherocylinder("Test", 1.0, 1.0);
      scList.addSpherocylinder("Test2", 5.0, 5.0);
      scList.addSpherocylinder("Test3", 6, 6);
      largestVol = scList.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(sc[2], largestVol);
   }
    
   /**  test findSpherocylinderWithLargestVolume null. **/
   @Test public void findSpherocylinderWithLargestVolumeNullTest() {
      Spherocylinder[] sc = new Spherocylinder[2];
      SpherocylinderList scList = new SpherocylinderList("TEST", sc, 0);
      Assert.assertEquals(null, scList.findSpherocylinderWithLargestVolume());
   }    
}
