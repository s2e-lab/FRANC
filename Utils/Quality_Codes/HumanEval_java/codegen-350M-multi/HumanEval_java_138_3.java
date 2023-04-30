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
        if(n == 0 || n == 1) return false;

        // 0 is even
        if (n == 4) return true;
        // 1 is divisible by 8, which are never as big as 1 but can be in a lot of other cases
        if (n % 8 == 0) return false;
        // 2 is divisible by 4, which are never as large as 1 but can be in a lot of other cases

        if(n == 6) return true;
        return false;
    }

}