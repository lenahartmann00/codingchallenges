package lena;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
 * Instruction:
 * You have an array of numbers.
 * Your task is to sort ascending odd numbers but even numbers must be on their places.
 * <p>
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 * <p>
 * Example
 * <p>
 * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */
public class SortTheOdd {

    public static int[] sortArray(final int[] array) {
        // 1) Create list with sorted odd numbers of array
        final int[] oddNumbers = Arrays.stream(array)
                .filter(i -> i % 2 != 0)
                .sorted()
                .toArray();

        // 2) Iterate over input array: if odd number: replace it, if not: don't
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers[j++];
            }
        }

        return array;
    }
}
