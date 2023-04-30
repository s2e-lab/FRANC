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
        if (n < 0) {
            n = -n;
            // reverse order
        }

        int count = n;

        while (count > 0) {
            int temp = count % 10;
            if (temp % 2!= 0) {
                return count;
            }
            count /= 10;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(digits(-1));
    }
}