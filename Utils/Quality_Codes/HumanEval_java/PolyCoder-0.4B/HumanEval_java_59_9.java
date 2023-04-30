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

        // This is a "prime", but it is not a prime. The problem is that this can have only
        // happens in the first place while scanning digits from 2 up to 5 is a prime.
        // We want to be able to reach 13 in this case (the prime digits, not an arbitrary one): 3,
        // 29, 27, 31, 35, 29, 31, 63, 29, 63... which are all 6. Try it with
    
}
}