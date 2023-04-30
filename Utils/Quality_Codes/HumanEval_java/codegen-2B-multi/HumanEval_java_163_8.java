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
        // write your code here
        List<Object> list = new ArrayList<Object>();
        if (a < b) {
            int cur = 1;
            while (cur <= b) {
                list.add(cur);
                cur *= 10;
            }
            Collections.reverse(list);
            return list;
        }
        return new ArrayList();
    }

    private static List<Integer> convert(List<Object> list) {
        List<Integer> result = new ArrayList<Integer>();
}
}