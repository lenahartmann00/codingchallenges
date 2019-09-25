package artjom;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaLoopsI {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		final int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		showMultiplicationTableFor(n);
		scanner.close();
	}

	private static void showMultiplicationTableFor(final int n) {
		IntStream.rangeClosed(1, 10).forEach(value -> {
			int result = value * n;
			System.out.println(n + " x " + value + " = " + result);
		});
	}
}
