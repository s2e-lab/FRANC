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
	if (p <= 0) {
            throw new IllegalArgumentException("p must be a positive integer");
        }
        if (n < 0) {
            n = ((n % p) + p) % p;
        }
        if (n >= p) {
            n %= p;
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        while (n > 1) {
            if ((n & 1) == 1) {
                result = (result * p) % p;
            }
            p = (p * p) % p;
            n >>= 1;
        }
        return (result * p) % p;
    }
    
    public static void main(String[] args) {
        System.out.println(modp(3, 5)); // 3
        System.out.println(modp(1101, 101)); // 2
        System.out.println(modp(0, 101)); // 1
        System.out.println(modp(3, 11)); // 8
        System.out.println(modp(100, 101)); // 1
    }
}