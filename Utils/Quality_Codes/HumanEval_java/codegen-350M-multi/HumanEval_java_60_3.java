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
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.valueOf(i + 1));
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                sum += i;
            }
            set.remove(i);
        }
        return sum;
    }
}
