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
	public static int solution(List<Integer> lst) {
    int sum = 0;
    for (int i = 0; i < lst.size(); i += 2) {
        if (lst.get(i) % 2 != 0) {
            sum += lst.get(i);
        }
    }
    return sum;
} 

//Explanation: The method takes in a list of integers and returns an integer. We initialize a variable called sum to store the sum of odd integers. We loop through the list starting at index 0 and incrementing by 2 to only get the even positions. We then check if the integer at that position is odd and add it to the sum variable if it is. Finally, we return the sum variable.