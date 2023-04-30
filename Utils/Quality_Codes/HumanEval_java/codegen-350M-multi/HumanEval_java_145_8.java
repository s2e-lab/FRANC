import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class OrderByPoints {
    /**
     * * Write a function which sorts the given list of integers
     * in ascending order according to the sum of their digits.
     * Note: if there are several items with similar sum of their digits,
     * order them based on their index in original list.

     * For example:
     * >>> order_by_points([1, 11, -1, -11, -12]) == [-1, -11, 1, -12, 11]
     * >>> order_by_points([]) == []
     *
     * > orderByPoints([1, 11, -1, -11, -12])
     * [-1, -11, 1, -12, 11]
     * > orderByPoints([1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46])
     * [0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457]
     * > orderByPoints([])
     * []
     * > orderByPoints([1, -11, -32, 43, 54, -98, 2, -3])
     * [-3, -32, -98, -11, 1, 2, 43, 54]
     * > orderByPoints([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
     * [1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9]
     * > orderByPoints([0, 6, 6, -76, -21, 23, 4])
     * [-76, -21, 0, 4, 23, 6, 6]
     */
    public static List<Object> orderByPoints(List<Object> nums) {
        List<Object> sumEven = new ArrayList();
        List<Object> totalIndex = new ArrayList();

        for (int i = 0; i < nums.size(); i++) {
            if (Math.floor(Math.abs(getPercentage(nums.get(i))) / 100 * nums.size()) == 1) totalIndex.add(i);
            else {
                sumEven.add(nums.get(i));
                totalIndex.add(0);
            }
        }
}
}