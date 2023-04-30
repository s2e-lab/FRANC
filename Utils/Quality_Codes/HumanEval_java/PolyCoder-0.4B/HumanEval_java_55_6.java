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
        if (n >= 3 && n <= 10) {
            return (n - 1) / 3 + 1;
        } else if (n >= 11 && n <= 12) {
            return (n - 2) * 3 + 1;
        } else if (n > 24) {
            return n - 30;
        }
}
}