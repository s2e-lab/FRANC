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
        int count;
        int factor;
        int res;

        count = 0;
        factor = 1;
        do {
            if (n >= 0) {
                if (n % 10 == 0) {
                    count = count + 1;
                } else {
                    res = count;
                    count = 0;
                    return res;
                }

                factor = factor * 10;
            }
            n = n / 10;

        } while (count <= 0);

        res = count;
        count = 0;
        return res;
}
}