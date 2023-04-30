import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Fib {
    /**
     * Return n-th Fibonacci number.
     * >>> fib(10)
     * 55
     * >>> fib(1)
     * 1
     * >>> fib(8)
     * 21
     *
     * > fib(10)
     * 55
     * > fib(1)
     * 1
     * > fib(8)
     * 21
     * > fib(11)
     * 89
     * > fib(12)
     * 144
     */
    public static int fib(int n) {
        int a = 1, i = 0;
        while (n>0) {
            i++;
            n >>= 1;
        }
        a = a + n;
}
}