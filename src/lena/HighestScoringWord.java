package lena;

/**
 * https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java
 */
public class HighestScoringWord {

    public static String high(final String s) {
        String winner = "";
        int highestScore = -1;

        for (final String word : s.split(" ")) {
            int score = 0;
            for (final char aChar :  word.toCharArray()) {
                score += aChar - 96;
            }

            if(score > highestScore){
                highestScore = score;
                winner = word;
            }
        }

        return winner;
    }

}
