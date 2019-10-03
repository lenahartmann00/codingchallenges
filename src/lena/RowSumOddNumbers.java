package lena;

/**
 * https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java
 */
public class RowSumOddNumbers {

    public static int rowSumOddNumbers(final int n) {
        final int lastNumberOfRowBefore = getLastNumberOfRowBefore(n);

        int result = 0;
        int lastNumber = lastNumberOfRowBefore;

        for (int i = 0; i < n; i++) {
            result += lastNumber + 2;
            lastNumber += 2;
        }

        return result;
    }

    private static int getLastNumberOfRowBefore(final int currentRow) {
        final int gaussSum = (currentRow * (currentRow - 1)) / 2;
        return 1 + 2 * (gaussSum - 1);
    }
}
