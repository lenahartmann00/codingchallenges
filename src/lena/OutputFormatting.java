package lena;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            final String s1 = sc.next();
            final int x = sc.nextInt();
            System.out.printf("%-15s", s1);
            System.out.printf("%03d%n", x);
        }
        System.out.println("================================");
    }

}
