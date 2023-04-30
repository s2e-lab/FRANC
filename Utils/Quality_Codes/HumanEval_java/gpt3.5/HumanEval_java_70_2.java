import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StrangeSortList {
    /**
     * * Given list of integers, return list in strange order.
     * Strange sorting, is when you start with the minimum value,
     * then maximum of the remaining integers, then minimum and so on.

     * Examples:
     * strange_sort_list([1, 2, 3, 4]) == [1, 4, 2, 3]
     * strange_sort_list([5, 5, 5, 5]) == [5, 5, 5, 5]
     * strange_sort_list([]) == []
     *
     * > strangeSortList([1, 2, 3, 4])
     * [1, 4, 2, 3]
     * > strangeSortList([5, 6, 7, 8, 9])
     * [5, 9, 6, 8, 7]
     * > strangeSortList([1, 2, 3, 4, 5])
     * [1, 5, 2, 4, 3]
     * > strangeSortList([5, 6, 7, 8, 9, 1])
     * [1, 9, 5, 8, 6, 7]
     * > strangeSortList([5, 5, 5, 5])
     * [5, 5, 5, 5]
     * > strangeSortList([])
     * []
     * > strangeSortList([1, 2, 3, 4, 5, 6, 7, 8])
     * [1, 8, 2, 7, 3, 6, 4, 5]
     * > strangeSortList([0, 2, 2, 2, 5, 5, -5, -5])
     * [-5, 5, -5, 5, 0, 2, 2, 2]
     * > strangeSortList([111111])
     * [111111]
     */
    public static List<Object> strangeSortList(List<Object> lst) {
	// Start by converting the list to an array for easier manipulation
        Integer[] arr = new Integer[lst.size()];
        arr = lst.toArray(arr);

// Sort the array to get the minimum value
        Arrays.sort(arr);

// Create two pointers, one at the first index and one at the last
        int left = 0;
        int right = arr.length - 1;

// Create a new array to hold the sorted values
        Integer[] sortedArr = new Integer[arr.length];

// Iterate through the array, adding the minimum and maximum values alternatively to the sorted array
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sortedArr[i] = arr[left++];
            } else {
                sortedArr[i] = arr[right--];
            }
        }

// Convert the sorted array back to a list and return it
        List<Object> sortedList = Arrays.asList(sortedArr);
        return sortedList;
    }
}