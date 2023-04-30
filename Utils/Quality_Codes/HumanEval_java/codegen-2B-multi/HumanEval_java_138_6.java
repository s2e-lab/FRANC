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
        if (n % 2 == 0) {
            return false;
        }

        int sum = 0;
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                if (k + n / 2 > n) {
                    return false;
                }
                sum += k + n / 2 - k;
            } else {
                sum += k;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) throws IOException {

}
}