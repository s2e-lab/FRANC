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
        int max = 0;
        int count = 0;
        
        // if n is prime
        count = isPrimeDigit(n);
        
        for (int d = 2; count > 0; d++) {
            int temp = 0;
            if (n % d == 0) {
                temp = largestDivisor(d);
                if (temp > max) {
                    max = temp;
                }
            }
            count = count - 1;     // -1 is because prime
            
        }
        return max;
    
}
}