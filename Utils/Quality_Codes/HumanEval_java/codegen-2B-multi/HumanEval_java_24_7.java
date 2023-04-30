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
        if (n == 1)
            return Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();
        int left;
        int i;
        // find the right largest divisor
        while ((left = divide_by_2(n)) > 1) {
            ++i;
            add_to_map(map, left);
        }

        Integer[] keys = map.keySet().toArray(new Integer[0]);
        Arrays.sort(keys);

}
}