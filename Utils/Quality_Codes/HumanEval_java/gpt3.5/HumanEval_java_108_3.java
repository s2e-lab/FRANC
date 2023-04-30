import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CountNums {
    /**
     * * Write a function count_nums which takes an array of integers and returns
     * the number of elements which has a sum of digits > 0.
     * If a number is negative, then its first signed digit will be negative:
     * e.g. -123 has signed digits -1, 2, and 3.
     * >>> count_nums([]) == 0
     * >>> count_nums([-1, 11, -11]) == 1
     * >>> count_nums([1, 1, 2]) == 3
     *
     * > countNums([])
     * 0
     * > countNums([-1, -2, 0])
     * 0
     * > countNums([1, 1, 2, -2, 3, 4, 5])
     * 6
     * > countNums([1, 6, 9, -6, 0, 1, 5])
     * 5
     * > countNums([1, 100, 98, -7, 1, -1])
     * 4
     * > countNums([12, 23, 34, -45, -56, 0])
     * 5
     * > countNums([0, 1])
     * 1
     * > countNums([1])
     * 1
     */
    public static int countNums(List<Object> arr) {
	public static int countNums(List<Integer> arr) {
        int count = 0; // initialize count
        for (int i = 0; i < arr.size(); i++) { // loop through the array
            int num = arr.get(i); // get the number at the current index
            int sum = 0; // initialize the sum of digits
            while (num != 0) { // loop through the digits of the number
                int digit = num % 10; // get the last digit
                if (num < 0 && sum == 0) { // if the number is negative, subtract the digit from the sum
                    sum -= digit;
                } else {
                    sum += digit; // add the digit to the sum
                }
                num /= 10; // remove the last digit
            }
            if (sum != 0) { // if the sum of digits is not zero, increment the count
                count++;
            }
        }
        return count; // return the count
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, -2, 3, 4, 5));
        System.out.println(countNums(arr)); // should print 6
    }
}