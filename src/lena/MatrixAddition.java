package lena;

/**
 * https://www.codewars.com/kata/matrix-addition/train/java
 */
public class MatrixAddition {

	public static int[][] matrixAddition(int[][] a, int[][] b) {
		if (!canBeSummedUp(a, b)) {
			return new int[0][0];
		}
		final int[][] sumMatrix = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				sumMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return sumMatrix;
	}

	private static boolean canBeSummedUp(final int[][] a, final int[][] b) {
		return a != null && b != null && isQuadratic(a) && isQuadratic(b) && a.length == b.length;
	}

	private static boolean isQuadratic(final int[][] matix) {
		final int columnLength = matix.length;
		for (final int[] row : matix) {
			if (row.length != columnLength) {
				return false;
			}
		}
		return true;
	}

}
