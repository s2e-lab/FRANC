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
	if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2 % p;
        } else if (n % 2 == 0) {
            int temp = modp(n / 2, p);
            return (temp * temp) % p;
        } else {
            int temp = modp((n - 1) / 2, p);
            return (2 * temp * temp) % p;
        }
    }

    public static void main(String[] args) {
        System.out.println(modp(3, 5));
        System.out.println(modp(1101, 101));
        System.out.println(modp(0, 101));
        System.out.println(modp(3, 11));
        System.out.println(modp(100, 101));
    }
}