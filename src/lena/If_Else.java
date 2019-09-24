package lena;

import java.util.Scanner;

public class If_Else {

	private static final Scanner scanner = new Scanner(System.in);
	private static final String WEIRD = "Weird";
	private static final String NOT_WEIRD = "Not Weird";

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (isNumberWeird(N)) {
			System.out.print(WEIRD);
		} else {
			System.out.print(NOT_WEIRD);
		}
		scanner.close();
	}

	private static boolean isNumberWeird(final int number) {
		//Number is odd
		if (number % 2 != 0) {
			return true;

		// Number is even
		} else {
			//Range 2-5
			if (number >= 2 && number <= 5) {
				return false;
			//Range 6-20
			} else if (number >= 6 && number <= 20) {
				return true;
			//Range 20-100
			} else {
				return false;
			}
		}
	}

}
