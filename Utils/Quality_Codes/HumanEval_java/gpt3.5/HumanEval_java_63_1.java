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
	// We can solve this problem using dynamic programming to avoid redundant calculations.
// We create an array to store the values of previous results.
// Then we use a loop to calculate the values of the fibfib sequence until reaching the desired index n.
// At each index i, we add the values of the three previous indices.

        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int[] fibfibArray = new int[n+1];
        fibfibArray[0] = 0;
        fibfibArray[1] = 0;
        fibfibArray[2] = 1;
        for (int i = 3; i <= n; i++) {
            fibfibArray[i] = fibfibArray[i-1] + fibfibArray[i-2] + fibfibArray[i-3];
        }
        return fibfibArray[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("fibfib(" + n + ") = " + fibfib(n));
    }
}