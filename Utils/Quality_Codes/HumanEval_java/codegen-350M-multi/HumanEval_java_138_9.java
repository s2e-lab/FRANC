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
        Integer[] numbers;
        try {
            numbers = new Integer[4];
            numbers[0] = Integer.valueOf(0);
            numbers[1] = Integer.valueOf(1);
            numbers[2] = Integer.valueOf(1);
            numbers[3] = Integer.valueOf(1);
        }
        catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
        numerator.sum = new TreeSet<Integer>();

}
}