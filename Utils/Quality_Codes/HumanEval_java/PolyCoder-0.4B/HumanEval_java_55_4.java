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
        int[][] array = new int[n + 2][n + 2];

        for(int i = 0; i < array.length; i++) {
            array[i] = new int[]{i, i + 1, i + 2};
        }

        return fib(array) - 1;
    }

    public static int fib(int[][] array) {
    
}
}