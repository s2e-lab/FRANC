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
	// Implement the algorithm for computing 2^n modulo p
// The algorithm uses modular arithmetic properties to compute the result efficiently
// Start with a base case for n = 0. Since any number raised to the power of 0 is equal to 1,
// the result of 2^0 modulo p is 1.

        if (n == 0) {
            return 1;
        }

// For all other values of n, the result can be computed using recursive calls to modp() with
// n/2 as the argument. If n is even, then the result is simply the square of modp(n/2, p)
// modulo p. If n is odd, then the result is the product of 2 modulo p and modp(n-1, p).

        int result = modp(n/2, p);
        result = (result * result) % p;
        if (n % 2 == 1) {
            result = (result * 2) % p;
        }
        return result;
    }

    public static void main(String[] args) {

// Test the modp() function using the provided test cases
        System.out.println(modp(3, 5)); // Expected output: 3
        System.out.println(modp(1101, 101)); // Expected output: 2
        System.out.println(modp(0, 101)); // Expected output: 1
        System.out.println(modp(3, 11)); // Expected output: 8
        System.out.println(modp(100, 101)); // Expected output: 1
    }
}