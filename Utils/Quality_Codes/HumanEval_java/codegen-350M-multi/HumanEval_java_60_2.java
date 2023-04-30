import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class SumToN {
    /**
     * sum_to_n is a function that sums numbers from 1 to n.
     * >>> sum_to_n(30)
     * 465
     * >>> sum_to_n(100)
     * 5050
     * >>> sum_to_n(5)
     * 15
     * >>> sum_to_n(10)
     * 55
     * >>> sum_to_n(1)
     * 1
     *
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        while (--n >= 1)   // 1 <= n <= 9
            return sumToN(n - 1); // This returns n.

        // This should never happen if if(0.999999999 < 1 && 0 > 0)
        // we can return n.
        return n;
    }
}

/**
 * Sums up as much numbers as possible.
 * Not necessarily does not increase numbers.
 *
 * @param n
 *
 */
public class SumToN {
    public static void main(String[] args) {
}
}