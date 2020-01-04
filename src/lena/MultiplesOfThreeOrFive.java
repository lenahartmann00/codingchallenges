package lena;

import java.util.HashSet;

/**
 * https://www.codewars.com/kata/514b92a657cdc65150000006/train/java
 */
public class MultiplesOfThreeOrFive {

	public int solution(final int number) {
		final HashSet<Integer> addedMultiples = new HashSet<>();
		final int[] factors = {3, 5};

		int sum = 0;
		for (final int factor : factors) {
			for (int i = factor; i < number; i += factor) {
				if (addedMultiples.add(i)) {
					sum += i;
				}
			}
		}

		return sum;
	}

	/*
		Other implementations I had in mind and why i chose the implementation above over them:
		1) Simple BruteForce
		for (int i = 0; i < number; i ++) {
			if(i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		-> even though it has a high readability it is not very efficient

		2) "Clever" solution
		int threeMultiple = 3;
		int fiveMultiple = 5;

		while (threeMultiple < number || fiveMultiple < number) {
			if (threeMultiple < fiveMultiple) {
				sum += threeMultiple;
				threeMultiple += 3;
			} else if (fiveMultiple < threeMultiple) {
				sum += fiveMultiple;
				fiveMultiple += 5;
			} else {
				sum += fiveMultiple;
				fiveMultiple += 5;
				threeMultiple += 3;
			}
		}
		-> it is efficient and has a low space complexity, but the code is quite large and not really
		nice to read

		3) "Balanced" solution
		I chose the implementation above since, in my opinion, it has the best balance between
		performance and readability. The time complexity is the same as in 2) (therefore better as in
		solution 1) and the code is much shorter than in 2).
		A contra point is that by using the HashSet the space complexity higher. But since only one
		HashSet is used and it is a local variable, I think it is manageable.

	 */


}
