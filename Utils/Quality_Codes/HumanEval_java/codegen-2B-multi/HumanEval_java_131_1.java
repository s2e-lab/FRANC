import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Digits {
    /**
     * Given a positive integer n, return the product of the odd digits.
     * Return 0 if all digits are even.
     * For example:
     * digits(1)  == 1
     * digits(4)  == 0
     * digits(235) == 15
     *
     * > digits(5)
     * 5
     * > digits(54)
     * 5
     * > digits(120)
     * 1
     * > digits(5014)
     * 5
     * > digits(98765)
     * 315
     * > digits(5576543)
     * 2625
     * > digits(2468)
     * 0
     */
    public static int digits(int n) {
        int count = n;
        int product = 1;
        if (n <= 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE) {
            return 0;
        }
        for (int p = 2; p <= n; p *= 2) {
            if (n % p) {
                product *= (count % p) % 10;
                count /= p;
            }
        }
        return Integer.remainder((long) product * (-1));
    }

}