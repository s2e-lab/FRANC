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
        List<Integer> res = new ArrayList<Integer>();
        if (num == 0) return res;
        for (int i = num; i > 0; i = i - 1) {
            res.add(i);
        }
        return res;
    }

    public static void main(String[] args) throws JSONException {
        System.out.println(evenOddCount(-34572));
        System.out.println(evenOddCount(76572));
        System.out.println(evenOddCount(-345823));
}
}