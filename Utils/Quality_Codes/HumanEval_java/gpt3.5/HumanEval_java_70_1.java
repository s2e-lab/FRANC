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
	// First, we need to sort the list in ascending order
        Collections.sort(lst);
        // Create two pointers to start from beginning and end of the list
        int i = 0;
        int j = lst.size() - 1;
        // Create a new list to store the strange sorted list
        List<Object> sortedList = new ArrayList<>();
        // Loop through the original list
        while (i <= j) {
            // Add the minimum value to the new list
            sortedList.add(lst.get(i));
            i++;
            // If there are no more items left in the list, break the loop
            if (i > j) {
                break;
            }
            // Add the maximum value to the new list
            sortedList.add(lst.get(j));
            j--;
        }
        return sortedList;
    }

    public static void main(String[] args) {
        // Testing the function with example inputs
        List<Object> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Object> lst2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
        List<Object> lst3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Object> lst4 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 1));
        List<Object> lst5 = new ArrayList<>(Arrays.asList(5, 5, 5, 5));
        List<Object> lst6 = new ArrayList<>();
        List<Object> lst7 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Object> lst8 = new ArrayList<>(Arrays.asList(0, 2, 2, 2, 5, 5, -5, -5));
        List<Object> lst9 = new ArrayList<>(Arrays.asList(111111));

        System.out.println(strangeSortList(lst1)); // [1, 4, 2, 3]
        System.out.println(strangeSortList(lst2)); // [5, 9, 6, 8, 7]
        System.out.println(strangeSortList(lst3)); // [1, 5, 2, 4, 3]
        System.out.println(strangeSortList(lst4)); //
}
}