import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelectorTest {

    static Comparator<Integer> ascendingInteger =
            new Comparator<Integer>() {
                public int compare(Integer i1, Integer i2) {
                    return i1.compareTo(i2);
                }
            };

    @Test
    void min() {
        /*
        [2, 8, 7, 3, 4] 2
        [5, 9, 1, 7, 3] 1
        [8, 7, 6, 5, 4] 4
        [8, 2, 8, 7, 3, 3, 4] 2
         */
        List<Integer> a = new ArrayList<Integer>(List.of(2, 8, 7, 3, 4));
        int expected = 2;
        int actual = Selector2.min(a, ascendingInteger);
        assertEquals(expected, actual);

    }
    @Test
    void min2() {
        /*
        [2, 8, 7, 3, 4] 2
        [5, 9, 1, 7, 3] 1
        [8, 7, 6, 5, 4] 4
        [8, 2, 8, 7, 3, 3, 4] 2
         */
        List<Integer> a = new ArrayList<Integer>(List.of(5, 9, 1, 7, 3));
        int expected = 1;
        int actual = Selector2.min(a, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void min3() {
        /*
        [2, 8, 7, 3, 4] 2
        [5, 9, 1, 7, 3] 1
        [8, 7, 6, 5, 4] 4
        [8, 2, 8, 7, 3, 3, 4] 2
         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 7, 6, 5, 4));
        int expected = 4;
        int actual = Selector2.min(a, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void min4() {
        /*
        [2, 8, 7, 3, 4] 2
        [5, 9, 1, 7, 3] 1
        [8, 7, 6, 5, 4] 4
        [8, 2, 8, 7, 3, 3, 4] 2
         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 2, 8, 7, 3, 3, 4));
        int expected = 2;
        int actual = Selector2.min(a, ascendingInteger);
        assertEquals(expected, actual);
    }


    @Test
    void max() {
        List<Integer> a = new ArrayList<Integer>(List.of(2, 8, 7, 3, 4));
        int expected = 8;
        int actual = Selector2.max(a, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void max2() {
        List<Integer> a = new ArrayList<Integer>(List.of(5, 9, 1, 7, 3));
        int expected = 9;
        int actual = Selector2.max(a, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void max3() {
        List<Integer> a = new ArrayList<Integer>(List.of(8, 7, 6, 5, 4));
        int expected = 8;
        int actual = Selector2.max(a, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void max4() {
        List<Integer> a = new ArrayList<Integer>(List.of(8, 2, 8, 7, 3, 3, 4));
        int expected = 8;
        int actual = Selector2.max(a, ascendingInteger);
        assertEquals(expected, actual);
    }

    @Test
    void kmin() {
        /*
        coll	                k	kmin(coll, k, comp)
        [2, 8, 7, 3, 4]	        1	   2
        [5, 9, 1, 7, 3]	        3	   5
        [8, 7, 6, 5, 4]	        5	   8
        [8, 2, 8, 7, 3, 3, 4]	3	   4

         */
        List<Integer> a = new ArrayList<Integer>(List.of(2, 8, 7, 3, 4));
        int key = 1;
        int expected = 2;
        int actual = Selector2.kmin(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void kmin2() {
        /*
        coll	                k	kmin(coll, k, comp)
        [2, 8, 7, 3, 4]	        1	   2
        [5, 9, 1, 7, 3]	        3	   5
        [8, 7, 6, 5, 4]	        5	   8
        [8, 2, 8, 7, 3, 3, 4]	3	   4

         */
        List<Integer> a = new ArrayList<Integer>(List.of(5, 9, 1, 7, 3));
        int key = 3;
        int expected = 5;
        int actual = Selector2.kmin(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void kmin3() {
        /*
        coll	                k	kmin(coll, k, comp)
        [2, 8, 7, 3, 4]	        1	   2
        [5, 9, 1, 7, 3]	        3	   5
        [8, 7, 6, 5, 4]	        5	   8
        [8, 2, 8, 7, 3, 3, 4]	3	   4

         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 7, 6, 5, 4));
        int key = 5;
        int expected = 8;
        int actual = Selector2.kmin(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void kmin4() {
        /*
        coll	                k	kmin(coll, k, comp)
        [2, 8, 7, 3, 4]	        1	   2
        [5, 9, 1, 7, 3]	        3	   5
        [8, 7, 6, 5, 4]	        5	   8
        [8, 2, 8, 7, 3, 3, 4]	3	   4

         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 2, 8, 7, 3, 3, 4));
        int key = 3;
        int expected = 4;
        int actual = Selector2.kmin(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }


    @Test
    void kmax() {
        /*
        coll	                k	kmax(coll, k, comp)
        [2, 8, 7, 3, 4]	        1	   8
        [5, 9, 1, 7, 3]	        3	   5
        [8, 7, 6, 5, 4]	        5	   4
        [8, 2, 8, 7, 3, 3, 4]	3	   4

         */
        List<Integer> a = new ArrayList<Integer>(List.of(2, 8, 7, 3, 4));
        int key = 1;
        int expected = 8;
        int actual = Selector2.kmax(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void kmax2() {
        /*
        coll	                k	kmax(coll, k, comp)
        [2, 8, 7, 3, 4]	        1	   8
        [5, 9, 1, 7, 3]	        3	   5
        [8, 7, 6, 5, 4]	        5	   4
        [8, 2, 8, 7, 3, 3, 4]	3	   4

         */
        List<Integer> a = new ArrayList<Integer>(List.of(5, 9, 1, 7, 3));
        int key = 3;
        int expected = 5;
        int actual = Selector2.kmax(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void kmax3() {
        /*
        coll	                k	kmax(coll, k, comp)
        [2, 8, 7, 3, 4]	        1	   8
        [5, 9, 1, 7, 3]	        3	   5
        [8, 7, 6, 5, 4]	        5	   4
        [8, 2, 8, 7, 3, 3, 4]	3	   4

         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 7, 6, 5, 4));
        int key = 5;
        int expected = 4;
        int actual = Selector2.kmax(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void kmax4() {
        /*
        coll	                k	kmax(coll, k, comp)
        [2, 8, 7, 3, 4]	        1	   8
        [5, 9, 1, 7, 3]	        3	   5
        [8, 7, 6, 5, 4]	        5	   4
        [8, 2, 8, 7, 3, 3, 4]	3	   4

         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 2, 8, 7, 3, 3, 4));
        int key = 3;
        int expected = 4;
        int actual = Selector2.kmax(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }


    @Test
    void range() {
        /*
        The range method
        This method selects all values from a given collection that are greater than or equal to low and less than or equal to high.

                   coll	         low	high	range(coll, low, high, comp)
        [2, 8, 7, 3, 4]	          1	     5	        [2, 3, 4]
        [5, 9, 1, 7, 3]	          3      5	        [5, 3]
        [8, 7, 6, 5, 4]	          4	     8	        [8, 7, 6, 5, 4]
        [8, 2, 8, 7, 3, 3, 4]	  3	     7	        [7, 3, 3, 4]
         */
        List<Integer> a = new ArrayList<Integer>(List.of(2, 8, 7, 3, 4));
        Integer low = 1;
        Integer high = 5;
        Collection<Integer> expected = new ArrayList<Integer>(List.of(2,3,4));
        Collection<Integer> actual = Selector2.range(a, low, high, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void range2() {
        /*
        The range method
        This method selects all values from a given collection that are greater than or equal to low and less than or equal to high.

                   coll	         low	high	range(coll, low, high, comp)
        [2, 8, 7, 3, 4]	          1	     5	        [2, 3, 4]
        [5, 9, 1, 7, 3]	          3      5	        [5, 3]
        [8, 7, 6, 5, 4]	          4	     8	        [8, 7, 6, 5, 4]
        [8, 2, 8, 7, 3, 3, 4]	  3	     7	        [7, 3, 3, 4]
         */
        List<Integer> a = new ArrayList<Integer>(List.of(5, 9, 1, 7, 3));
        Integer low = 3;
        Integer high = 5;
        Collection<Integer> expected = new ArrayList<Integer>(List.of(5,3));
        Collection<Integer> actual = Selector2.range(a, low, high, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void range3() {
        /*
        The range method
        This method selects all values from a given collection that are greater than or equal to low and less than or equal to high.

                   coll	         low	high	range(coll, low, high, comp)
        [2, 8, 7, 3, 4]	          1	     5	        [2, 3, 4]
        [5, 9, 1, 7, 3]	          3      5	        [5, 3]
        [8, 7, 6, 5, 4]	          4	     8	        [8, 7, 6, 5, 4]
        [8, 2, 8, 7, 3, 3, 4]	  3	     7	        [7, 3, 3, 4]
         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 7, 6, 5, 4));
        Integer low = 4;
        Integer high = 8;
        Collection<Integer> expected = new ArrayList<Integer>(List.of(8,7,6,5,4));
        Collection<Integer> actual = Selector2.range(a, low, high, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void range4() {
        /*
        The range method
        This method selects all values from a given collection that are greater than or equal to low and less than or equal to high.

                   coll	         low	high	range(coll, low, high, comp)
        [2, 8, 7, 3, 4]	          1	     5	        [2, 3, 4]
        [5, 9, 1, 7, 3]	          3      5	        [5, 3]
        [8, 7, 6, 5, 4]	          4	     8	        [8, 7, 6, 5, 4]
        [8, 2, 8, 7, 3, 3, 4]	  3	     7	        [7, 3, 3, 4]
         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 2, 8, 7, 3, 3, 4));
        Integer low = 3;
        Integer high = 7;
        Collection<Integer> expected = new ArrayList<Integer>(List.of(7,3,3,4));
        Collection<Integer> actual = Selector2.range(a, low, high, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void range5() {
        List<Integer> a = new ArrayList<>(List.of(8, 2, 8, 7, 3, 3, 4));
        Integer low = 0;
        Integer high = 0;
        boolean actual = false;
        try {
            Selector2.range(a, low, high, ascendingInteger);
        }
        catch (NoSuchElementException e) {
            actual = true;
        }
        assertTrue(actual);
    }


    @Test
    void ceiling() {
        /*
        coll	                key	    ceiling(coll, key, comp)
        [2, 8, 7, 3, 4]	         1	       2
        [5, 9, 1, 7, 3]	         7	       7
        [8, 7, 6, 5, 4]          0	       4
        [8, 2, 8, 7, 3, 3, 4]	 5	       7
         */
        List<Integer> a = new ArrayList<Integer>(List.of(2, 8, 7, 3, 4));
        int key = 1;
        int expected = 2;
        int actual = Selector2.ceiling(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void ceiling2() {
        /*
        coll	                key	    ceiling(coll, key, comp)
        [2, 8, 7, 3, 4]	         1	       2
        [5, 9, 1, 7, 3]	         7	       7
        [8, 7, 6, 5, 4]          0	       4
        [8, 2, 8, 7, 3, 3, 4]	 5	       7
         */
        List<Integer> a = new ArrayList<Integer>(List.of(5, 9, 1, 7, 3));
        int key = 7;
        int expected = 7;
        int actual = Selector2.ceiling(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void ceiling3() {
        /*
        coll	                key	    ceiling(coll, key, comp)
        [2, 8, 7, 3, 4]	         1	       2
        [5, 9, 1, 7, 3]	         7	       7
        [8, 7, 6, 5, 4]          0	       4
        [8, 2, 8, 7, 3, 3, 4]	 5	       7
         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 7, 6, 5, 4));
        int key = 0;
        int expected = 4;
        int actual = Selector2.ceiling(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void ceiling4() {
        /*
        coll	                key	    ceiling(coll, key, comp)
        [2, 8, 7, 3, 4]	         1	       2
        [5, 9, 1, 7, 3]	         7	       7
        [8, 7, 6, 5, 4]          0	       4
        [8, 2, 8, 7, 3, 3, 4]	 5	       7
         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 2, 8, 7, 3, 3, 4));
        int key = 5;
        int expected = 7;
        int actual = Selector2.ceiling(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }

    @Test
    void floor() {
        /*
        coll	                key	    floor(coll, key, comp)
        [2, 8, 7, 3, 4]	         6	       4
        [5, 9, 1, 7, 3]	         1	       1
        [8, 7, 6, 5, 4]          9	       8
        [8, 2, 8, 7, 3, 3, 4]	 5	       4
         */
        List<Integer> a = new ArrayList<Integer>(List.of(2, 8, 7, 3, 4));
        int key = 6;
        int expected = 4;
        int actual = Selector2.floor(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void floor2() {
        /*
        coll	                key	    floor(coll, key, comp)
        [2, 8, 7, 3, 4]	         6	       4
        [5, 9, 1, 7, 3]	         1	       1
        [8, 7, 6, 5, 4]          9	       8
        [8, 2, 8, 7, 3, 3, 4]	 5	       4
         */
        List<Integer> a = new ArrayList<Integer>(List.of(5, 9, 1, 7, 3));
        int key = 1;
        int expected = 1;
        int actual = Selector2.floor(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void floor3() {
        /*
        coll	                key	    floor(coll, key, comp)
        [2, 8, 7, 3, 4]	         6	       4
        [5, 9, 1, 7, 3]	         1	       1
        [8, 7, 6, 5, 4]          9	       8
        [8, 2, 8, 7, 3, 3, 4]	 5	       4
         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 7, 6, 5, 4));
        int key = 9;
        int expected = 8;
        int actual = Selector2.floor(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }
    @Test
    void floor4() {
        /*
        coll	                key	    floor(coll, key, comp)
        [2, 8, 7, 3, 4]	         6	       4
        [5, 9, 1, 7, 3]	         1	       1
        [8, 7, 6, 5, 4]          9	       8
        [8, 2, 8, 7, 3, 3, 4]	 5	       4
         */
        List<Integer> a = new ArrayList<Integer>(List.of(8, 2, 8, 7, 3, 3, 4));
        int key = 5;
        int expected = 4;
        int actual = Selector2.floor(a, key, ascendingInteger);
        assertEquals(expected, actual);
    }

}
