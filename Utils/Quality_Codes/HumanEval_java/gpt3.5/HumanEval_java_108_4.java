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
	//First, we convert the list of objects to a list of integers.
        List<Integer> intList = new ArrayList<>();
        for (Object obj : arr) {
            intList.add((int) obj);
        }
//Then we check each element of the list to see if it has a sum of digits greater than zero.
        int count = 0;
        for (int num : intList) {
            if (num == 0) {
                continue;
            }
            int sum = 0;
            String numString = String.valueOf(num);
            for (int i = 0; i < numString.length(); i++) {
                if (i == 0 && (numString.charAt(i) == '-' || numString.charAt(i) == '+')) {
                    sum -= Integer.parseInt(String.valueOf(numString.charAt(i + 1)));
                    i++;
                } else {
                    sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
                }
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }
}