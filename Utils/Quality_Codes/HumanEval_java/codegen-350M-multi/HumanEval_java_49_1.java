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
        int modp  = 1;

        if (n > 0) modp = (n & 1) * p / 2;

        if (p == 0) return modp;

        return (modp + p + (n & 1) * ((modp + n) & p) % p) % p;
    }
}

/*
  test for modp (note not that the modp(0/3, 4) == 2^o,
  because o is 0 for modp(3, o)),
  so test for O.
*/
