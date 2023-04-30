import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class PrimeFib {
    /**
     * * prime_fib returns n-th number that is a Fibonacci number and it's also prime.
     * >>> prime_fib(1)
     * 2
     * >>> prime_fib(2)
     * 3
     * >>> prime_fib(3)
     * 5
     * >>> prime_fib(4)
     * 13
     * >>> prime_fib(5)
     * 89
     *
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(6)
     * 233
     * > primeFib(7)
     * 1597
     * > primeFib(8)
     * 28657
     * > primeFib(9)
     * 514229
     * > primeFib(10)
     * 433494437
     */
    public static int primeFib(int n) {
        int pFib[][] = new int[n+1][11];
        pFib[0][9] = 10;

        pFib[0][1] = 1;
        pFib[0][2] = 2;
        pFib[0][3] = 3;
        pFib[0][4] = 5;
        pFib[0][5] = 6;
        pFib[0][6] = 7;
        pFib[0][7] = 8;
}
}