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
        if (n < 0)
        return -1;

        int[] result = new int[n];
        int divisor = 0;

        int smallestCount = 0;
        int smallestCountPlus1 = -2147483648;
        int largestCountMinus1Plus10 = 2147483647;
        int largestCountMinus1Plus100 = -2147483648;
}
}