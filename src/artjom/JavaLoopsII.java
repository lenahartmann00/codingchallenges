package artjom;

import java.util.*;
import java.util.stream.IntStream;

// Java Loop II from hackerrank.com
public class JavaLoopsII {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int countOfLines = in.nextInt();
        final Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < countOfLines; i++) {
            final int a = in.nextInt();
            final int b = in.nextInt();
            final int n = in.nextInt();
            map.put(i, Arrays.asList(a, b, n));
        }

        calculateResult(map);
        in.close();
    }

    private static void calculateResult(Map<Integer, List<Integer>> map) {
        IntStream.range(0, map.size()).forEach(value -> {
            int a = map.get(value).get(0);
            final int b = map.get(value).get(1);
            final int n = map.get(value).get(2);
            int operand = 1;
            for (int j = 0; j < n; j++) {
                final int currentS = a + b * operand;
                operand = operand * 2;
                a = currentS;
                System.out.print(currentS + " ");
            }
            System.out.println();
        });
    }
}