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
	// Ensure that n is positive
        n = ((n % p) + p) % p;
        
        // If p is even
        if(p % 2 == 0){
            // Compute (n^2)^(p/2) mod p
            int sqr = modp((n * n) % p, p / 2);
            return sqr;
        }
        // If p is odd
        else{
            // Compute (n^(p-1)) mod p
            int pow = modp(n, p - 1);
            
            // Return (n * (n^(p-1))) mod p
            return (n * pow) % p;
        }
    }
}