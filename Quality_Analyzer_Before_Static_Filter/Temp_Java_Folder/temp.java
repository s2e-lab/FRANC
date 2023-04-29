import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class GenerateIntegers {
    /**
     * * Given two positive integers a and b, return the even digits between a
     * and b, in ascending order.

     * For example:
     * generate_integers(2, 8) => [2, 4, 6, 8]
     * generate_integers(8, 2) => [2, 4, 6, 8]
     * generate_integers(10, 14) => []
     *
     * > generateIntegers(2, 10)
     * [2, 4, 6, 8]
     * > generateIntegers(10, 2)
     * [2, 4, 6, 8]
     * > generateIntegers(132, 2)
     * [2, 4, 6, 8]
     * > generateIntegers(17, 89)
     * []
     */
    public static List<Object> generateIntegers(int a, int b) {
	List<Integer> evenDigits = new ArrayList<>();
for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
    String str = Integer.toString(i);
    for (int j = 0; j < str.length(); j++) {
        if (Character.isDigit(str.charAt(j)) && (str.charAt(j) - '0') % 2 == 0) {
            evenDigits.add(str.charAt(j) - '0');
        }
    }
}
Collections.sort(evenDigits);
return new ArrayList<Object>(evenDigits);
}
}