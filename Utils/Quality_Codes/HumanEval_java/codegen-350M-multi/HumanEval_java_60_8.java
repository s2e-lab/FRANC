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
        int sum = 0;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return Math.min(sum, 1);
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += sumToN(i);
            }

        } else {
            throw new Exception("Invalid Number");
        }
        return sum;
    }
}

// https://www.geeksforgeeks.org/sum-to-n