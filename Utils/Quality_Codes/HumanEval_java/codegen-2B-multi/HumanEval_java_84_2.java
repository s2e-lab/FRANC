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
        String res = "";
        while (n > 0) {
            int digit = n % 10;
            res += digit;
            n /= 10;
        }
        res = res.substring(0, Math.min(res.length(), 9));
        
        // for i, digit, count in enumerate(res):
        //     if i % 10 == 0:
        //         res[i] = "0" + res[i]
        //     else:
        //         if i < 10:
        //             count += 1
}
}