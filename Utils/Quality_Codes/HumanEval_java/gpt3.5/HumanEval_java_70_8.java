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
	//We will first sort the list in ascending order
        Collections.sort(lst);
        //We take two pointers, one at the start and one at the end of the list
        int start = 0;
        int end = lst.size() - 1;
        List<Object> result = new ArrayList<>();

        while (start <= end) {
            //We add the element at start pointer to our result list
            result.add(lst.get(start)); 
            //If there are no more elements to process, we break out of the loop
            if (start == end) { 
                break;
            }
            //We add the element at end pointer to our result list
            result.add(lst.get(end)); 
            //We move the two pointers one step towards each other
            start++;                
            end--;
        }
        return result;
    }

    public static void main(String[] args) {
        //Example usage
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);

        System.out.println(strangeSortList(lst));
        //Output: [1, 4, 2, 3]
    }
}