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
        int d = n;
        while (d > 1 && d % 2 == 0 && d % 5 == 0 && d % 7 == 0 && d % 29 == 0) {  // 5, 7, 9, 10, 23, 29
            d /= 10;                                                               // 10, 23, 29
        }
        return d == n? n : largestDivisor(n-1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
}
}