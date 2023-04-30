import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class IsEqualToSumEven {
    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
     * Example
     * is_equal_to_sum_even(4) == False
     * is_equal_to_sum_even(6) == False
     * is_equal_to_sum_even(8) == True
     *
     * > isEqualToSumEven(4)
     * false
     * > isEqualToSumEven(6)
     * false
     * > isEqualToSumEven(8)
     * true
     * > isEqualToSumEven(10)
     * true
     * > isEqualToSumEven(11)
     * false
     * > isEqualToSumEven(12)
     * true
     * > isEqualToSumEven(13)
     * false
     * > isEqualToSumEven(16)
     * true
     */
    public static Boolean isEqualToSumEven(int n) {
        if (n <= 0) {
            return false;
        }
        // check 1 and 2 as two numbers and divide by 2 in case of odd
        if (n <= 4) {
            if (n > 1) {
                return (n == 1 && n % 2 == 0)
                        || (n == 2)
                        || (n == 3 && n % 2 == 1);
            } else {
                return true;
            }
        }
        // check odd numbers until n >= 6
        BigInteger num = BigInteger.ZERO;
        
}
}