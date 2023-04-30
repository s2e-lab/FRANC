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
        int ret = 1;
        while (n > 0) {
            n--;
            ret = ret * 10 + n;
        }
        return ret;
    }

    public static void main(String[] args) {
        Fib fib = new Fib(3);
}
}