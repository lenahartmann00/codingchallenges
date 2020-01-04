package lena;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplesOfThreeOrFiveTest {

	@Test
	public void solution() {
		assertEquals(23, new MultiplesOfThreeOrFive().solution(10));
		final int expected = 3 + 5 + 6 + 9 + 10 + 12 + 15 + 18 + 20;
		assertEquals(expected, new MultiplesOfThreeOrFive().solution(21));
	}
}