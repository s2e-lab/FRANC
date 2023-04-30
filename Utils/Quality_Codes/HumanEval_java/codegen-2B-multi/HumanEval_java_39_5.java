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
        if (n <= 1) {
            return n;
        }else {
            return primeFib(n-2) + primeFib(n-1);
        }
    }
    /**
     * Test
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO: 4, 2
        int n = Integer.parseInt(args[0]);
}
}