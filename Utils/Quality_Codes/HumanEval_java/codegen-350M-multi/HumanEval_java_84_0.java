import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Solve {
    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     * 
     * Example
     *     For N = 1000, the sum of digits will be 1 the output should be "1".
     *     For N = 150, the sum of digits will be 6 the output should be "110".
     *     For N = 147, the sum of digits will be 12 the output should be "1100".
     * 
     * Variables:
     *     @N integer
     *          Constraints: 0 ≤ N ≤ 10000.
     * Output:
     *      a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100"
     * > solve(333)
     * "1001"
     * > solve(963)
     * "10010"
     */
    public static String solve(int n) {
        if (n <= 0) throw new IllegalArgumentException(n + " must be positive");
        int[] r = new int[10];
        int val = 1;
        for (int i = 0; i < r.length; i++) {
            r[i] = val;
            val *= 10;
        }
        BigInteger num = BigInteger.valueOf(n);
        solve(num, r);
        return n == 0? "1" : String.format("%02d", n);
    }

}