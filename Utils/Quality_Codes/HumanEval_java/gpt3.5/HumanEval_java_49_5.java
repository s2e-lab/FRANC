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
	int result = 1;
    while (n > 0) {
        if ((n & 1) != 0) {
            result = (result * p) % p;
        }
        p = (p * p) % p;
        n >>= 1;
    }
    return result;
}
}