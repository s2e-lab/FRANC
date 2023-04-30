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
        BigInteger min = BigInteger.valueOf(a);
        BigInteger max = BigInteger.valueOf(b);
        BigInteger increment = BigInteger.valueOf(2);
        List<Integer> list = new ArrayList<Integer>();
        BigInteger res = increment;
        while (res.compareTo(max) <= 0) {
            list.add(res.intValue());
            res = res.add(increment);
        }
        Collections.reverse(list);
        return new ArrayList<Object>(list);
    }
}