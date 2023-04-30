import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ByLength {
    /**
     * * Given an array of integers, sort the integers that are between 1 and 9 inclusive,
     * reverse the resulting array, and then replace each digit by its corresponding name from
     * "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".

     * For example:
     *   arr = [2, 1, 1, 4, 5, 8, 2, 3]   
     *         -> sort arr -> [1, 1, 2, 2, 3, 4, 5, 8] 
     *         -> reverse arr -> [8, 5, 4, 3, 2, 2, 1, 1]
     *   return ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
     * 
     *   If the array is empty, return an empty array:
     *   arr = []
     *   return []
     * 
     *   If the array has any strange number ignore it:
     *   arr = [1, -1 , 55] 
     *         -> sort arr -> [-1, 1, 55]
     *         -> reverse arr -> [55, 1, -1]
     *   return = ['One']
     *
     * > byLength([2, 1, 1, 4, 5, 8, 2, 3])
     * ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
     * > byLength([])
     * []
     * > byLength([1, -1, 55])
     * ["One"]
     * > byLength([1, -1, 3, 2])
     * ["Three", "Two", "One"]
     * > byLength([9, 4, 8])
     * ["Nine", "Eight", "Four"]
     */
    public static List<Object> byLength(List<Object> arr) {
        if (arr.isEmpty()) {
            return arr;
        }
        boolean swapped = true;
        for (int i = 0; i!= arr.size(); i++) {
            if (i == 0) {
                swapped = false;
            } else if (swapped) {
                Integer lastNum = (Integer)arr.get(arr.size() - 1);
                if (i <= lastNum) {
                    swapped = false;
                    swap(arr, i - 1, i);
                }
            }
        }
}
}