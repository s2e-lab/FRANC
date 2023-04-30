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
	//First, we need to handle the edge case when the input list is empty
        if (lst.isEmpty()) {
            return lst;
        }
        
// We can create two lists to store minimum and maximum numbers alternatively
        List<Object> minList = new ArrayList<Object>();
        List<Object> maxList = new ArrayList<Object>();
        
        // We can sort the original list and alternate adding the smallest and largest
        // numbers to the minList and maxList respectively
        Collections.sort(lst);
        while (!lst.isEmpty()) {
            minList.add(lst.get(0));
            lst.remove(0);
            if (!lst.isEmpty()) {
                maxList.add(lst.get(lst.size()-1));
                lst.remove(lst.size()-1);
            }
        }
        // We can now combine the minList and maxList to create the strange sorted list
        List<Object> sortedList = new ArrayList<Object>();
        for (int i = 0; i < minList.size(); i++) {
            sortedList.add(minList.get(i));
            if (i < maxList.size()) {
                sortedList.add(maxList.get(i));
            }
        }
        return sortedList;
    }
}