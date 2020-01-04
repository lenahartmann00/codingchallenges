package lena;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixAdditionTest {

	@Test
	public void sampleTest() {
		int[][] expected = new int[][] { { 3, 4, 4 }, { 6, 4, 4 }, { 2, 2, 4 } };

		assertArrayEquals(expected,
			MatrixAddition.matrixAddition(
				new int[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 1, 1 } },
				new int[][] { { 2, 2, 1 }, { 3, 2, 3 }, { 1, 1, 3 } }));

		expected = new int[][] { { 3 } };
		assertArrayEquals(expected,
			MatrixAddition.matrixAddition(
				new int[][] { { 1 } },
				new int[][] { { 2 } }));

		expected = new int[][] { { 3, 5 }, { 3, 5 } };
		assertArrayEquals(expected,
			MatrixAddition.matrixAddition(
				new int[][] { { 1, 2 }, { 1, 2 } },
				new int[][] { { 2, 3 }, { 2, 3 } }));
	}
	@Test
	public void matrixAdditionANotQuadratic(){
		assertNull(MatrixAddition.matrixAddition(new int[][]{{1},{1,2}}, new int[][]{{2,3},{3,4}}));
	}
	@Test
	public void matrixAdditionBNotQuadratic(){
		assertNull(MatrixAddition.matrixAddition(new int[][]{{1,2},{1,2}}, new int[][]{{2,3},{3}}));
	}

	@Test
	public void matrixAdditionNotSameLength(){
		assertNull(MatrixAddition.matrixAddition(new int[][]{{1,2},{1,2}}, new int[][]{{2,3,8},{3,4,5},{1,2,3}}));
	}

	@Test
	public void matrixAdditionEmptyArray(){
		assertArrayEquals(new int[1][1], MatrixAddition.matrixAddition(new int[1][1], new int[1][1]));
	}

	@Test
	public void matrixAdditionNullValues(){
		assertNull(MatrixAddition.matrixAddition(null, null));
	}
}