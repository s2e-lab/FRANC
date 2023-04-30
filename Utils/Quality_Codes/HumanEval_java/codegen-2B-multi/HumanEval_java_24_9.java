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
        final BigInteger biN = BigInteger.valueOf(n), biMax = biN;
        while (biMax.mod(BigInteger.TEN).equals(biN))
            biMax = biMax.divide(BigInteger.TEN);

        return biMax.intValue();
    }

    /**
     * Find the largest divisor of a number and make it the divisor of all other numbers within the same
     * amount of digits
     */
    public static int largestDivisorOfAnyDigit(int n) {

}
}