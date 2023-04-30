import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LargestPrimeFactor {
    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     * >>> largest_prime_factor(13195)
     * 29
     * >>> largest_prime_factor(2048)
     * 2
     *
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        assert n > 0;
        int res = 1;
        while (n == 1) {
            n = n << 1;
            res = res * n;
        }
        int a = 1;
        int b = 1;
}
}