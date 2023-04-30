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
        StringBuilder sb = new StringBuilder();
        int num1 = 0, num2 = 6;
        while(n > 0) {
            if((n % 10) > 0) {
                sb.append(n % 10);
                num2 -= 1;
            }
            n /= 10;
            num1 -= 1;
        }
        sb.insert(0, (char)(num2+'0'));
        sb.insert(0, (char)(num1+'0'));
        return sb.toString();
    
}
}