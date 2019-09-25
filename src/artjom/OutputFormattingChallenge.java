package artjom;

import java.util.Scanner;

public class OutputFormattingChallenge {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			final String s1 = scanner.next();
			final int x = scanner.nextInt();
			System.out.printf("%-15s", s1);
			System.out.printf("%03d%n", x);
		}
		System.out.println("================================");
	}
}
