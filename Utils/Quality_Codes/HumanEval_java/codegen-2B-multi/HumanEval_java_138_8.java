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
        int sum = 0;
        int size = 1;
        int i = 1;

        while (n > sum) {
            if (i % 2!= 0) {
                size++;
            }
            sum = sum + i;
            i = i + 1;
        }

        if (size == 4 && sum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
}
}