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
        
        if (n == 1) return 1;
        if (n == 2) return 2;

        Queue<Integer> largestDivisorQueue = new ArrayDeque<>();
        largestDivisorQueue.add(1);
        largestDivisorQueue.add(2);

}
}