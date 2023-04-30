import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class IsPrime {
    /**
     * Return true if a given number is prime, and false otherwise.
     * >>> is_prime(6)
     * False
     * >>> is_prime(101)
     * True
     * >>> is_prime(11)
     * True
     * >>> is_prime(13441)
     * True
     * >>> is_prime(61)
     * True
     * >>> is_prime(4)
     * False
     * >>> is_prime(1)
     * False
     *
     * > isPrime(6)
     * false
     * > isPrime(101)
     * true
     * > isPrime(11)
     * true
     * > isPrime(13441)
     * true
     * > isPrime(61)
     * true
     * > isPrime(4)
     * false
     * > isPrime(1)
     * false
     * > isPrime(5)
     * true
     * > isPrime(11)
     * true
     * > isPrime(17)
     * true
     * > isPrime(85)
     * false
     * > isPrime(77)
     * false
     * > isPrime(255379)
     * false
     */
    public static Boolean isPrime(int n) {
        if (n < 0) {
            return false;
        }
        if (n % 2 == 0) {
            return true;
        }

        int factor = Math.pow(2, n%2);
        Integer num = Integer.valueOf(n/factor);

      
}
}