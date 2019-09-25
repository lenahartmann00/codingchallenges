package lena;

import java.util.Scanner;

public class StdInStdout2 {
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int a = scan.nextInt();
        final int b = scan.nextInt();
        final int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.print(c);
    }
}
