package lena;

import java.util.ArrayList;
import java.util.Collections;

//https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> output = new ArrayList<>();

        // 1) Filter substrings
        for (String a1 : array1) {
            for (String a2 : array2) {
                if (a2.contains(a1)) {
                    output.add(a1);
                    break;
                }
            }
        }
        // 2) Sort lexicographically
        Collections.sort(output);

        return output.toArray(new String[0]);
    }

}
