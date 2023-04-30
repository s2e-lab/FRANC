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
	// We can solve this problem using dynamic programming approach
// We create an array to store precomputed values of fibfib(n)
// Then, we iteratively compute fibfib(n) using previously computed values

        int[] fibfibArray = new int[Math.max(3, n + 1)]; // Initialize array to store precomputed values
        fibfibArray[0] = 0; // First two values are predetermined
        fibfibArray[1] = 0;
        fibfibArray[2] = 1;

        for(int i = 3; i <= n; i++){ // Calculate values iteratively
            fibfibArray[i] = fibfibArray[i-1] + fibfibArray[i-2] + fibfibArray[i-3];
        }
        
        return fibfibArray[n]; // Return the nth value of fibfib sequence
    }
    
    public static void main(String[] args) {
        System.out.println(fibfib(1)); // Expected output: 0
        System.out.println(fibfib(5)); // Expected output: 4
        System.out.println(fibfib(8)); // Expected output: 24
    }
}