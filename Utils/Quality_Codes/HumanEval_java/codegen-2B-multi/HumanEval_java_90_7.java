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
        if (lst == null || lst.size() < 2)
            return null;

        // if the 3 largest values are 0, 1,... the smallest two are not
        // so we can just take the first value in the list
        if ( lst.stream().mapToInt(value -> (Integer)value).allMatch(integer -> integer <= 1) )
            return (Integer)lst.get(0); // assume the first value is the smallest value in list

        // otherwise the next smallest is the second smallest value;
}
}