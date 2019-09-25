package artjom;

import java.util.Scanner;

public class StdinStdoutII {

	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		final int i = scan.nextInt();
		final double d = scan.nextDouble();
		scan.nextLine();
		final String text = scan.nextLine();

		System.out.println("String: " + text);
		System.out.println("Double: " + d);
		System.out.print("Int: " + i);
	}
}
