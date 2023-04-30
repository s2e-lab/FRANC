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
        List<Integer> factor = new ArrayList<Integer>();
        if (n == 1) return factor;
        if (n < 0) throw new RuntimeException("Input not valid for factorization");
        while (n > 1) {
            if (n % 2!= 0) return factor;
            n = n / 2;
        }

        return factor;
    }

    public static void main(String[] args) {
        System.out.println(factorize(Integer.MAX_VALUE));
    }
}
