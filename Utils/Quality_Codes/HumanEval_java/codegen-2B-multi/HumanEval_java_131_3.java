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
        int len = n % 10;
        if (len == 0) len = n / 10;
        int ret = 0;
        for (int i = 0; i < len; i++) {
            ret = (ret * 10) + (n % 10);
            n = n / 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 9, 5, 1, 7, 1};
}
}