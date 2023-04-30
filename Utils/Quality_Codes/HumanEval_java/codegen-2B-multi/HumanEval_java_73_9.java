import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class SmallestChange {
    /**
     * * Given an array arr of integers, find the minimum number of elements that
     * need to be changed to make the array palindromic. A palindromic array is an array that
     * is read the same backwards and forwards. In one change, you can change one element to any other element.

     * For example:
     * smallest_change([1,2,3,5,4,7,9,6]) == 4
     * smallest_change([1, 2, 3, 4, 3, 2, 2]) == 1
     * smallest_change([1, 2, 3, 2, 1]) == 0
     *
     * > smallestChange([1, 2, 3, 5, 4, 7, 9, 6])
     * 4
     * > smallestChange([1, 2, 3, 4, 3, 2, 2])
     * 1
     * > smallestChange([1, 4, 2])
     * 1
     * > smallestChange([1, 4, 4, 2])
     * 1
     * > smallestChange([1, 2, 3, 2, 1])
     * 0
     * > smallestChange([3, 1, 1, 3])
     * 0
     * > smallestChange([1])
     * 0
     * > smallestChange([0, 1])
     * 1
     */
    public static int smallestChange(List<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return 0;
        }

        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.addAll(arr);

        int length = stack.size();
        int result = 1;
}
}