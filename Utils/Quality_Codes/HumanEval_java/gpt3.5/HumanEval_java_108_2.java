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
  int count = 0;
  for (int i = 0; i < arr.size(); i++) {
    int sum = 0;
    String numStr = Integer.toString(arr.get(i));
    boolean isNegative = false;
    for (int j = 0; j < numStr.length(); j++) {
      char digit = numStr.charAt(j);
      if (digit == '-') {
        isNegative = true;
      } else {
        int digitVal = Character.getNumericValue(digit);
        if (isNegative) {
          digitVal *= -1;
          isNegative = false;
        }
        sum += digitVal;
      }
    }
    if (sum > 0) {
      count++;
    }
  }
  return count;
}