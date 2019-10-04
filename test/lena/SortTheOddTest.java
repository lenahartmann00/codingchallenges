package lena;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTheOddTest {

    @Test
    public void sortArray1() {
        assertArrayEquals(new int[]{1, 3, 4, 6, 8, 9}, SortTheOdd.sortArray(new int[]{9, 1, 4, 6, 8, 3}));
    }

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, SortTheOdd.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, SortTheOdd.sortArray(new int[]{5, 3, 1, 8, 0}));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }
}