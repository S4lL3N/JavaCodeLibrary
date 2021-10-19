import Algorithms.Selector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectorTest {

    @Test
    void min() {
        int[] list1 = {2,8,7,3,4};
        int[] list2 = {5,9,1,7,3};
        int[] list3 = {8,7,6,5,4};
        int[] list4 = {8,2,8,7,3,3,4};
        int expected1 = 2;
        int expected2 = 1;
        int expected3 = 4;
        int expected4 = 2;
        int actual1 = Selector.min(list1);
        int actual2 = Selector.min(list2);
        int actual3 = Selector.min(list3);
        int actual4 = Selector.min(list4);
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);
    }

    @Test
    void max() {
        int[] list1 = {2,8,7,3,4};
        int[] list2 = {2,9,1,7,3};
        int[] list3 = {8,7,6,5,4};
        int[] list4 = {8,2,8,7,3,3,4};
        int expected1 = 8;
        int expected2 = 9;
        int expected3 = 8;
        int expected4 = 8;
        int actual1 = Selector.max(list1);
        int actual2 = Selector.max(list2);
        int actual3 = Selector.max(list3);
        int actual4 = Selector.max(list4);
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);
    }

    @Test
    void kmin() {
        int[] list1 = {2,8,7,3,4};
        int[] list2 = {5,9,1,7,3};
        int[] list3 = {8,7,6,5,4};
        int[] list4 = {8,2,8,7,3,3,4};
        int expected1 = 2;
        int expected2 = 5;
        int expected3 = 8;
        int expected4 = 4;
        int actual1 = Selector.kmin(list1, 1);
        int actual2 = Selector.kmin(list2, 3);
        int actual3 = Selector.kmin(list3, 5);
        int actual4 = Selector.kmin(list4, 3);
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);

    }

    @Test
    void kmax() {
        int[] list1 = {2,8,7,3,4};
        int[] list2 = {5,9,1,7,3};
        int[] list3 = {8,7,6,5,4};
        int[] list4 = {8,2,8,7,3,3,4};
        int expected1 = 8;
        int expected2 = 5;
        int expected3 = 4;
        int expected4 = 4;
        int actual1 = Selector.kmax(list1, 1);
        int actual2 = Selector.kmax(list2, 3);
        int actual3 = Selector.kmax(list3, 5);
        int actual4 = Selector.kmax(list4, 3);
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);
    }

    @Test
    void range() {
        int[] list1 = {2,8,7,3,4};
        int[] list2 = {5,9,1,7,3};
        int[] list3 = {8,7,6,5,4};
        int[] list4 = {8,2,8,7,3,3,4};
        int[] expected1 = {2, 3, 4};
        int[] expected2 = {5, 3};
        int[] expected3 = {8, 7, 6, 5, 4};
        int[] expected4 = {7, 3, 3, 4};
        int[] actual1 = Selector.range(list1, 1,5);
        int[] actual2 = Selector.range(list2, 3, 5);
        int[] actual3 = Selector.range(list3, 4, 8);
        int[] actual4 = Selector.range(list4, 3 , 7);
        assertArrayEquals(expected1, actual1);
        assertArrayEquals(expected2,actual2);
        assertArrayEquals(expected3,actual3);
        assertArrayEquals(expected4,actual4);
    }

    @Test
    void ceiling() {
        int[] list1 = {2,8,7,3,4};
        int[] list2 = {5,9,1,7,3};
        int[] list3 = {8,7,6,5,4};
        int[] list4 = {8,2,8,7,3,3,4};
        int expected1 = 2;
        int expected2 = 7;
        int expected3 = 4;
        int expected4 = 7;
        int actual1 = Selector.ceiling(list1, 1);
        int actual2 = Selector.ceiling(list2, 7);
        int actual3 = Selector.ceiling(list3, 0);
        int actual4 = Selector.ceiling(list4, 5);
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);
    }

    @Test
    void floor() {
        int[] list1 = {2,8,7,3,4};
        int[] list2 = {5,9,1,7,3};
        int[] list3 = {8,7,6,5,4};
        int[] list4 = {8,2,8,7,3,3,4};
        int expected1 = 4;
        int expected2 = 1;
        int expected3 = 8;
        int expected4 = 4;
        int actual1 = Selector.floor(list1, 6);
        int actual2 = Selector.floor(list2, 1);
        int actual3 = Selector.floor(list3, 9);
        int actual4 = Selector.floor(list4, 5);
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);
    }
}
