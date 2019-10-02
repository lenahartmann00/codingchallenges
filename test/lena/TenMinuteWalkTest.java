package lena;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


class TenMinuteWalkTest {

	@Test
	void isValid() {
		assertTrue(TenMinuteWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
		assertFalse(TenMinuteWalk.isValid(new char[] {'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
		assertFalse(TenMinuteWalk.isValid(new char[] {'w'}));
		assertFalse(TenMinuteWalk.isValid(new char[] {'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
	}
	/*
	[n]
[n, s]
[n, s, n, s, n, s, n, s, n, s, n, s]
[n, s, e, w, n, s, e, w, n, s, e, w, n, s, e, w]
[n, s, n, s, n, s, n, s, n, n]
[e, e, e, w, n, s, n, s, e, w]
[n, e, n, e, n, e, n, e, n, e]
[n, w, n, w, n, w, n, w, n, w]
[s, e, s, e, s, e, s, e, s, e]
[s, w, s, w, s, w, s, w, s, w]
[n, s, n, s, n, s, n, s, n, s]
	 */

	@Test
	void isValid2() {
		assertFalse(TenMinuteWalk.isValid(new char[] {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 'n'}));
		assertFalse(TenMinuteWalk.isValid(new char[] {'e', 'e', 'e', 'w', 'n', 's', 'n', 's', 'e', 'w'}));
		assertFalse(TenMinuteWalk.isValid(new char[] {'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e'}));
		assertTrue(TenMinuteWalk.isValid(new char[] {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));

	}
}