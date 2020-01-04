package lena;

/**
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 */
public class SimplePigLatin {

	/**
	 * Moves the first letter of each word to the end of it, then adds "ay" to the end of the word.
	 * Leaves punctuation marks untouched.
	 */
	public static String pigIt(final String str) {
		// Write code here
		final StringBuilder result = new StringBuilder();
		final char[] array = str.toCharArray();

		char firstLetter = ' ';
		for (final char character : array) {
			if (firstLetter == ' ' && Character.isLetter(character)) {
				firstLetter = character;
			} else {
				if (!Character.isLetter(character) && firstLetter != ' ') {
					result.append(firstLetter).append("ay");
					firstLetter = ' ';
				}

				result.append(character);
			}
		}
		if (firstLetter != ' ') {
			result.append(firstLetter).append("ay");
		}

		return result.toString();
	}

}
