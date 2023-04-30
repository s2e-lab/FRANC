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
        boolean isEqualToSumEven = false;

        for (int i = 0; i < 4; i++) {
            if (isEqualTo(n)) {
                return isEqualToSumEven;
            }
        }

        return isEqualToSumEven;
    }

    int sumEvenNumber(Integer firstNumber, Integer secondNumber) {
        int result = 0;

}
}