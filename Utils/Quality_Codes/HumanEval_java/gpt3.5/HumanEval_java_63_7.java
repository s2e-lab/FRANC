import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Fibfib {
    /**
     * The FibFib number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
     * fibfib(0) == 0
     * fibfib(1) == 0
     * fibfib(2) == 1
     * fibfib(n) == fibfib(n-1) + fibfib(n-2) + fibfib(n-3).
     * Please write a function to efficiently compute the n-th element of the fibfib number sequence.
     * >>> fibfib(1)
     * 0
     * >>> fibfib(5)
     * 4
     * >>> fibfib(8)
     * 24
     *
     * > fibfib(2)
     * 1
     * > fibfib(1)
     * 0
     * > fibfib(5)
     * 4
     * > fibfib(8)
     * 24
     * > fibfib(10)
     * 81
     * > fibfib(12)
     * 274
     * > fibfib(14)
     * 927
     */
    public static int fibfib(int n) {
	if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int fib1 = 0;
            int fib2 = 0;
            int fib3 = 1;
            int fibn = 0;
            for (int i = 3; i <= n; i++) {
                fibn = fib1 + fib2 + fib3;
                fib1 = fib2;
                fib2 = fib3;
                fib3 = fibn;
            }
            return fibn;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibfib(1)); // expected output: 0
        System.out.println(fibfib(5)); // expected output: 4
        System.out.println(fibfib(8)); // expected output: 24
    }
}