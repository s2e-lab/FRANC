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
        int maxDivisor = 1;
        long quotient = 1;
        for (long q = 1; q <= n; q++) {
            quotient = (quotient * q) / n;
            maxDivisor = Math.min(maxDivisor, Math.max(quotient, MAX_VALUE));
        }
}
}