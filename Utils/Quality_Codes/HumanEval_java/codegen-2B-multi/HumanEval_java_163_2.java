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
        List<Object> result = new LinkedList<Object>();

        a = a > b? a : b;
        result.addAll(generateIntegersPart(a, b, 1));
        result.addAll(generateIntegersPart(a, b, 2));

        return result;
    }
    // 去掉后面的少1（与毫无相等），还原，重复深度
}