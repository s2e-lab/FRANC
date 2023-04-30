import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Modp {
    /**
     * Return 2^n modulo p (be aware of numerics).
     * >>> modp(3, 5)
     * 3
     * >>> modp(1101, 101)
     * 2
     * >>> modp(0, 101)
     * 1
     * >>> modp(3, 11)
     * 8
     * >>> modp(100, 101)
     * 1
     *
     * > modp(3, 5)
     * 3
     * > modp(1101, 101)
     * 2
     * > modp(0, 101)
     * 1
     * > modp(3, 11)
     * 8
     * > modp(100, 101)
     * 1
     * > modp(30, 5)
     * 4
     * > modp(31, 5)
     * 3
     */
    public static int modp(int n, int p) {
	// Edge case: if p is less than or equal to 1, return -1 as it is invalid input
        if (p <= 1) {
            return -1;
        }
        
        int result = 1;
        n %= p;
        
        // Using binary exponentiation to calculate 2^n modulo p
        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * 2) % p;
            }
            n >>= 1;
            result = (result * result) % p;
        }
        
        return result;
    }
}

/**
 * Test case to verify the solution
 */