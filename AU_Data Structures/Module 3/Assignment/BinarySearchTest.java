
import java.util.Comparator;
import BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    public static final Comparator<Integer> intCompare =
            new Comparator<Integer>() {
                public int compare(Integer left, Integer right) {
                    return left - right;
                }
            };

    @Test
    void firstIndexOf() {
        Integer[] arr = {1,2,3,4};
        Integer key = 2;
        int expected = 1;
        int actual = BinarySearch.firstIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }
    @Test
    void firstIndexOf2() {
        Integer[] arr = {0,0,0,0};
        Integer key = 0;
        int expected = 0;
        int actual = BinarySearch.firstIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }
    @Test
    void firstIndexOf3() {
        Integer[] arr = {1,2,3,4};
        Integer key = 1;
        int expected = 0;
        int actual = BinarySearch.firstIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }
    @Test
    void firstIndexOf4() {
        Integer[] arr = {1,2,3,4};
        Integer key = 4;
        int expected = 3;
        int actual = BinarySearch.firstIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }
    @Test
    void firstIndexOf5() {
        Integer[] arr = {1,2,3,4};
        Integer key = 5;
        int expected = -1;
        int actual = BinarySearch.firstIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }


    @Test
    void lastIndexOf() {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        Integer key = 3;
        int expected = 2;
        int actual = BinarySearch.lastIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }
    @Test
    void lastIndexOf2() {
        Integer[] arr = {0,0,0,0};
        Integer key = 0;
        int expected = 3;
        int actual = BinarySearch.lastIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }
    @Test
    void lastIndexOf3() {
        Integer[] arr = {1,2,3,4};
        Integer key = 1;
        int expected = 0;
        int actual = BinarySearch.lastIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }
    @Test
    void lastIndexOf4() {
        Integer[] arr = {1,2,3,4};
        Integer key = 4;
        int expected = 3;
        int actual = BinarySearch.lastIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }
    @Test
    void lastIndexOf5() {
        Integer[] arr = {1, 2, 3, 4};
        Integer key = 5;
        int expected = -1;
        int actual = BinarySearch.lastIndexOf(arr, key, intCompare);
        assertEquals(expected, actual);
    }

}
