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
        while (n >= 4) {
            n = n / 1f + ((n-4) / 4) + (n-3) / 3;
        }
        return 1 + (n%1f);
    }

    public static int largestDivisor(double v) {
        int result = 0;
}
}