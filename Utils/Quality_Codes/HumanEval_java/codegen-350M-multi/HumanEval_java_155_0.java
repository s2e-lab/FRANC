import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class EvenOddCount {
    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.

     *  Example:
     *     even_odd_count(-12) ==> (1, 1)
     *     even_odd_count(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3, 3]
     * > evenOddCount(-345821)
     * [3, 3]
     * > evenOddCount(-2)
     * [1, 0]
     * > evenOddCount(-45347)
     * [2, 3]
     * > evenOddCount(0)
     * [1, 0]
     */
    public static List<Integer> evenOddCount(int num) {
        List<Integer> count = new ArrayList<Integer>();
        if (num < 2) return count;
        boolean odd = num % 2 == 0;
        count.add(odd? num : num-odd);
        getEvenOddCount(odd, count, num, 0);
        return count;
    }

    public static void getEvenOddCount(boolean odd, List<Integer> count, int pos, int length) {
        Integer even = (odd? pos : -pos);
}
}