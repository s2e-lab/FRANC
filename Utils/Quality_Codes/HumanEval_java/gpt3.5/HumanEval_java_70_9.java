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
	// First we need to check if the list is empty or not
        if (lst.isEmpty()) {
            return lst;
        }
        
        // We need to use a priority queue to help sort the list in a strange order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // We add all the elements of the list into the priority queue
        for (Object obj : lst) {
            pq.add((int) obj);
        }
        
        // We need to create a new list to store the sorted elements
        List<Object> result = new ArrayList<>();
        
        // We alternate between popping the minimum and maximum elements from the priority queue
        boolean isMin = true;
        while (!pq.isEmpty()) {
            if (isMin) {
                result.add(pq.poll());
            } else {
                result.add(0, pq.poll());
            }
            isMin = !isMin;
        }
        
        return result;
    }
}