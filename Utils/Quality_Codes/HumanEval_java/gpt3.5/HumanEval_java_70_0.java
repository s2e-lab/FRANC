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
	//First, we should remove any non-integer elements from the list
        List<Integer> nums = new ArrayList<Integer>();
        for (Object num : lst) {
            if (num instanceof Integer) {
                nums.add((Integer) num);
            }
        }
        
//Then, we can sort the list in ascending order and use two pointers to iterate from both ends
//and build a new list in strange order
        Collections.sort(nums);
        List<Integer> result = new ArrayList<Integer>();
        int left = 0;
        int right = nums.size() - 1;
        boolean isLeft = true;
        while (left <= right) {
            if (isLeft) {
                result.add(nums.get(left));
                left++;
            } else {
                result.add(nums.get(right));
                right--;
            }
            isLeft = !isLeft;
        }
        
//Finally, we can add any non-integer elements back to the list in their original positions
        List<Object> finalResult = new ArrayList<Object>();
        int index = 0;
        for (Object obj : lst) {
            if (obj instanceof Integer) {
                finalResult.add(result.get(index));
                index++;
            } else {
                finalResult.add(obj);
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        List<Object> test1 = Arrays.asList(1, 2, 3, 4);
        System.out.println(strangeSortList(test1)); //[1, 4, 2, 3]

        List<Object> test2 = Arrays.asList(5, 6, 7, 8, 9);
        System.out.println(strangeSortList(test2)); //[5, 9, 6, 8, 7]

        List<Object> test3 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(strangeSortList(test3)); //[1, 5, 2, 4, 3]

        List<Object> test4 = Arrays.asList(5, 6, 7, 8, 9, 1);
        System.out.println(strangeSortList(test4)); //[1, 9, 5, 8, 6, 7]

        List<Object> test5 = Arrays.asList(5, 5, 5, 5);
        System.out.println(strangeSortList(test5)); //[5, 5
}
}