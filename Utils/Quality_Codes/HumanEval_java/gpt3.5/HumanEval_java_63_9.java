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
	// We can compute the fibfib sequence using memoization to avoid recalculating the same values multiple times.
// We define a hashmap to store the previously computed values.

        HashMap<Integer, Integer> memo = new HashMap<>();

// We add the base cases to the memo hashmap.

        memo.put(0, 0);
        memo.put(1, 0);
        memo.put(2, 1);

// We compute the n-th value using memoization.

        return fibfibHelper(n, memo);
    }

    private static int fibfibHelper(int n, HashMap<Integer, Integer> memo) {

        // Check if we have already computed the n-th value before.

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute the n-th value using the recursive formula.

        int fib = fibfibHelper(n-1, memo) + fibfibHelper(n-2, memo) + fibfibHelper(n-3, memo);

        // Add the value to the memo hashmap.

        memo.put(n, fib);

        // Return the value.

        return fib;
    }

    public static void main(String[] args) {

        // Test the function with some sample inputs.

        System.out.println(fibfib(1)); // expected output: 0
        System.out.println(fibfib(2)); // expected output: 1
        System.out.println(fibfib(5)); // expected output: 4
        System.out.println(fibfib(8)); // expected output: 24
        System.out.println(fibfib(10)); // expected output: 81
        System.out.println(fibfib(12)); // expected output: 274
        System.out.println(fibfib(14)); // expected output: 927
    }
}