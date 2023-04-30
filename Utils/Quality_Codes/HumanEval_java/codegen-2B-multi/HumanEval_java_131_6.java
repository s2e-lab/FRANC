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
        if (n <= 0) return 0;
        char[] arr = String.valueOf(n).toCharArray();
        int len = arr.length;
        int k = len - 1;
        int count = 0;
        while (k >= 0 && arr[k] == '0') {
            k--;
        }
        while (k >= 0) {
            if (Integer.parseInt(String.valueOf(arr, k + 1, len - k - 1)) % 2 > 0)  count++;
            k--;
        }
}
}