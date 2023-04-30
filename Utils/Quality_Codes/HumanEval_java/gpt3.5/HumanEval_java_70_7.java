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
	//First, we need to sort the list in ascending order
        Collections.sort(lst);
        //Then, we need to create two new lists: one for even indexed values and one for odd indexed values
        List<Object> oddList = new ArrayList<Object>();
        List<Object> evenList = new ArrayList<Object>();
        for(int i=0; i<lst.size(); i++){
            if(i%2 == 0){
                evenList.add(lst.get(i));
            } else {
                oddList.add(lst.get(i));
            }
        }
        //Then, we need to reverse the oddList
        Collections.reverse(oddList);
        //Finally, we need to merge the two lists back, alternating between values from even and odd lists
        List<Object> result = new ArrayList<Object>();
        int i = 0;
        while(i < evenList.size() && i < oddList.size()){
            result.add(evenList.get(i));
            result.add(oddList.get(i));
            i++;
        }
        //If there are any remaining values in evenList, add them to the result
        while(i < evenList.size()){
            result.add(evenList.get(i));
            i++;
        }
        //If there are any remaining values in oddList, add them to the result
        while(i < oddList.size()){
            result.add(oddList.get(i));
            i++;
        }
        return result;
    }
}