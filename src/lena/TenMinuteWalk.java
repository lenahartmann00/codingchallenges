package lena;

// https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
public class TenMinuteWalk {

	private static final char NORTH = 'n';
	private static final char SOUTH = 's';
	private static final char WEST = 'w';
	private static final char EAST = 'e';

	private static int latitude = 0;
	private static int longitude = 0;

	public static boolean isValid(final char[] walk) {
		latitude = longitude = 0;
		if (isWalk10Minutes(walk)) {
			for (final char direction : walk) {
				makeStep(direction);
			}
			return longitude == 0 && latitude == 0;
		}
		return false;
	}

	private static boolean isWalk10Minutes(final char[] walk) {
		return walk.length == 10;
	}

	private static void makeStep(final char direction) {
		switch (direction) {
			case NORTH:
				longitude++;
				break;
			case SOUTH:
				longitude--;
				break;
			case EAST:
				latitude++;
				break;
			case WEST:
				latitude--;
				break;
			default:
				break;
		}
	}
}
