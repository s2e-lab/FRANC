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
        int odd = num%2, even = num/2;
        List<Integer> res = new ArrayList<>(odd+even);
        for (int i=0; i<odd; i++) {
                res.add(even);
        }
        for (int i=0; i<even; i++) {
                res.add(odd);
        }
        return res;
    }

    public static void evenOddCount(List<Integer> nums) {
        evenOddCount(nums.size());
}
}