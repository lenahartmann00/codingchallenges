package lena;

import java.util.Scanner;

public class Stdin_and_Stdout {

	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);

		//Get input
		final int i = scan.nextInt();
		final double d = scan.nextDouble();
		scan.nextLine(); //Recall nextLine() to wait for line input
		final String s = scan.nextLine();

		scan.close();

		// Output
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.print("Int: " + i);
	}

}
