import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Factorize {
    /**
     * Return list of prime factors of given integer in the order from smallest to largest.
     * Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
     * Input number should be equal to the product of all factors
     * >>> factorize(8)
     * [2, 2, 2]
     * >>> factorize(25)
     * [5, 5]
     * >>> factorize(70)
     * [2, 5, 7]
     *
     * > factorize(2)
     * [2]
     * > factorize(4)
     * [2, 2]
     * > factorize(8)
     * [2, 2, 2]
     * > factorize(57)
     * [3, 19]
     * > factorize(3249)
     * [3, 3, 19, 19]
     * > factorize(185193)
     * [3, 3, 3, 19, 19, 19]
     * > factorize(20577)
     * [3, 19, 19, 19]
     * > factorize(18)
     * [2, 3, 3]
     */
    public static List<Integer> factorize(int n) {
        if (n == 0) {
            return Collections.emptyList();
        } else if (n == 1) {
            return Collections.singletonList((int)1);
        } else if (n > 1) {
            List<Integer> ret = new LinkedList<Integer>();
            int n2 = n/2;
            List<Integer> pre = ret;
            for (int i = 2; i < n2; i++) {
                pre = ret;
                for (int j = 1; j < i; j++) {
                    