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
	// We will use dynamic programming to efficiently compute the n-th element of the fibfib number sequence.

        int[] fib = new int[Math.max(3, n+1)];
        fib[0] = 0; // fibfib(0) == 0
        fib[1] = 0; // fibfib(1) == 0
        fib[2] = 1; // fibfib(2) == 1

        for(int i=3; i<=n; i++){
            fib[i] = fib[i-1] + fib[i-2] + fib[i-3]; // fibfib(n) == fibfib(n-1) + fibfib(n-2) + fibfib(n-3)
        }

        return fib[n]; // Return the n-th element of the fibfib number sequence
    }

    public static void main(String[] args) {
        System.out.println(fibfib(1)); // Expected output 0
        System.out.println(fibfib(5)); // Expected output 4
        System.out.println(fibfib(8)); // Expected output 24
        System.out.println(fibfib(2)); // Expected output 1
        System.out.println(fibfib(1)); // Expected output 0
        System.out.println(fibfib(5)); // Expected output 4
        System.out.println(fibfib(8)); // Expected output 24
        System.out.println(fibfib(10)); // Expected output 81
        System.out.println(fibfib(12)); // Expected output 274
        System.out.println(fibfib(14)); // Expected output 927
        
    }
}