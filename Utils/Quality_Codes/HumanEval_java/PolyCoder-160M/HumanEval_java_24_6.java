import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LargestDivisor {
    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     * >>> largest_divisor(15)
     * 5
     *
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        if (null == n) return 15;
        if (n > n >>> 8) return 15;
        if (java.lang.Double.doubleToLongBits(n) >= 2147483648L) return 15;
}
}