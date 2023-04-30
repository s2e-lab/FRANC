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
        //create two arrays, to store a few prime factors in the output
        int[] p = new int[10000];
        int[] r = new int[10000];

        //the nth factorization
        p[r.length] = 1;

        //for the first prime, 1
        for (int i=0; i < r.length; i++)
            r[i] = 1;

        //for the next prime, 1
        r[r.length] = p[1];

        //next prime, 2
}
}