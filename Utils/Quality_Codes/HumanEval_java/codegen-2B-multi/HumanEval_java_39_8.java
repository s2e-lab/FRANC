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
        boolean[] visited = new boolean[n + 1];
        recursivePrimeFib(n, visited);
        return visited[n];
    }

    /**
     * Recursive Implementation for prime fib
     *
     * @param n index number, the prime has to be found
     * @param visited index position of a node that represents the next prime
     */
    static void recursivePrimeFib(int n, boolean visited[]) {
        if (n == 1) {
            visited[1] = true;
            return;
        }

}
}