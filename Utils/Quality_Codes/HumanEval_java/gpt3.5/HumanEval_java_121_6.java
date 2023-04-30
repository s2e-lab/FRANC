import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Solution {
    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     * 

     * Examples
     * solution([5, 8, 7, 1]) ==> 12
     * solution([3, 3, 3, 3, 3]) ==> 9
     * solution([30, 13, 24, 321]) ==>0
     *
     * > solution([3, 3, 3, 3, 3])
     * 9
     * > solution([30, 13, 24, 321])
     * 0
     * > solution([5, 9])
     * 5
     * > solution([2, 4, 8])
     * 0
     * > solution([30, 13, 23, 32])
     * 23
     * > solution([3, 13, 2, 9])
     * 3
     */
    public static int solution(List<Integer> lst) {
	int sum = 0;
for (int i = 0; i < lst.size(); i += 2) {
    int num = lst.get(i);
    if (num % 2 == 1) {
        sum += num;
    }
}
return sum; 
} 

// Note: this solution assumes that the list is 0-indexed (i.e. the first element is at position 0) and that even positions are those with an even index (0, 2, 4, etc.).
}