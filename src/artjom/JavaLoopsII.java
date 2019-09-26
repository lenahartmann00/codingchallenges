package artjom;

import java.util.*;
import java.util.stream.Collectors;

// Java Loop II from hackerrank.com
public class JavaLoopsII {

    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int countOfLines = scanner.nextInt();
        final Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < countOfLines; i++) {
            final List<Integer> list = new ArrayList<>();
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                int x = a;
                for (int k = 0; k <= j; k++) {
                    x = x + (int) Math.pow(2, k) * b;
                }
                list.add(x);
            }
            map.put(i, list);
        }

        // stream joining of strings for pretty print of lines
        map.keySet().forEach(integer -> {
            final String collect = map.get(integer).stream().map(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(collect);
        });
    }
}