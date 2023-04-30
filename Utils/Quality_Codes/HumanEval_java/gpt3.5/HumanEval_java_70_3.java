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
	// Implementing the strangeSortList function
        List<Object> sortedList = new ArrayList<Object>();
        int n = lst.size();
        if (n == 0) { // if list is empty
            return sortedList;
        }
        if (n == 1) { // if list has only one element
            sortedList.add(lst.get(0));
            return sortedList;
        }
        // Sorting the list in ascending order
        Collections.sort(lst);

        int mid = (n - 1) / 2;
        sortedList.add(lst.get(0));
        sortedList.add(lst.get(n - 1));
        for (int i = 1, j = n - 2; i <= mid && j > mid; i++, j--) {
            sortedList.add(lst.get(j));
            sortedList.add(lst.get(i));
        }
        // If n is odd, add the middle element to the end of the list
        if (n % 2 == 1) {
            sortedList.add(lst.get(mid));
        }
        return sortedList;
    }
}