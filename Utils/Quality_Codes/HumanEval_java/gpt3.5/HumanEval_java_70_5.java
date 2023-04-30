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
	// First, we check if the given list is empty or not
        if(lst.isEmpty()) {
            return lst;
        }
        // If not, we create two pointers: one at the starting index and the other at the ending index
        int start = 0;
        int end = lst.size() - 1;
        // Then, we create a new list to store the strange order of elements
        List<Object> result = new ArrayList<>();
    
        while(start <= end) {
            // In each iteration, we first find the minimum element from the remaining elements
            int minIndex = start;
            for(int i=start+1; i<=end; i++) {
                if((int)lst.get(i) < (int)lst.get(minIndex)) {
                    minIndex = i;
                }
            }
            // Add the minimum element to the result list and remove it from the original list
            result.add(lst.get(minIndex));
            lst.remove(minIndex);
            // We then find the maximum element from the remaining elements
            int maxIndex = end - 1;
            for(int i=end-1; i>=start; i--) {
                if((int)lst.get(i) > (int)lst.get(maxIndex)) {
                    maxIndex = i;
                }
            }
            // Add the maximum element to the result list and remove it from the original list
            result.add(lst.get(maxIndex));
            lst.remove(maxIndex);
            
            // Update the start and end pointer
            start++;
            end = lst.size() - 1;
        }
        // Return the final result list
        return result;
    }
}