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
	if (p == 1) {
     return 0;
 }
 int result = 1;
 n = n % p;
 while (n > 0) {
     if ((n % 2) == 1) {
         result = (result * n) % p;
     }
     n = n * n;
     n = n / 2;
     n = n % p;
 }
 return result;
}
}