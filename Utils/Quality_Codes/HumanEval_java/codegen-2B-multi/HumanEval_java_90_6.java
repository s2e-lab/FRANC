import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class NextSmallest {
    /**
     * * You are given a list of integers.
     * Write a function next_smallest() that returns the 2nd smallest element of the list.
     * Return null if there is no such element.
     * 
     * next_smallest([1, 2, 3, 4, 5]) == 2
     * next_smallest([5, 1, 4, 3, 2]) == 2
     * next_smallest([]) == None
     * next_smallest([1, 1]) == None
     *
     * > nextSmallest([1, 2, 3, 4, 5])
     * 2
     * > nextSmallest([5, 1, 4, 3, 2])
     * 2
     * > nextSmallest([])
     * null
     * > nextSmallest([1, 1])
     * null
     * > nextSmallest([1, 1, 1, 1, 0])
     * 1
     * > nextSmallest([1, 1])
     * null
     * > nextSmallest([-35, 34, 12, -45])
     * -35
     */
    public static Integer nextSmallest(List<Object> lst) {
        if (lst == null || lst.size() == 0) {
            return null;
        }
        Integer index = 0;
}
}