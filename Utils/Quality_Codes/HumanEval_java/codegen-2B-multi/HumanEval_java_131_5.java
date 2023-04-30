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
        if (n < 10) return n;
        int d = 0, d1 = 0, t = 0, s = 0;

        // The answer when n is a even integer will have to be divided by 2.
        while (n!= 0) {
            t = n % 10;
            s += t == 0? 0 : t;
            n /= 10;
        }

        while (s / 2!= 0) {
            s = s / 2;
            d++;
        }

        d1 = d / 2;
}
}