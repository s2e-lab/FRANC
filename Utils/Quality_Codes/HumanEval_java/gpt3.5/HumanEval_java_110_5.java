import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Exchange {
    /**
     * In this problem, you will implement a function that takes two lists of numbers,
     * and determines whether it is possible to perform an exchange of elements
     * between them to make lst1 a list of only even numbers.
     * There is no limit on the number of exchanged elements between lst1 and lst2.
     * If it is possible to exchange elements between the lst1 and lst2 to make
     * all the elements of lst1 to be even, return "YES".
     * Otherwise, return "NO".
     * For example:
     * exchange([1, 2, 3, 4], [1, 2, 3, 4]) => "YES"
     * exchange([1, 2, 3, 4], [1, 5, 3, 4]) => "NO"
     * It is assumed that the input lists will be non-empty.
     *
     * > exchange([1, 2, 3, 4], [1, 2, 3, 4])
     * "YES"
     * > exchange([1, 2, 3, 4], [1, 5, 3, 4])
     * "NO"
     * > exchange([1, 2, 3, 4], [2, 1, 4, 3])
     * "YES"
     * > exchange([5, 7, 3], [2, 6, 4])
     * "YES"
     * > exchange([5, 7, 3], [2, 6, 3])
     * "NO"
     * > exchange([3, 2, 6, 1, 8, 9], [3, 5, 5, 1, 1, 1])
     * "NO"
     * > exchange([100, 200], [200, 200])
     * "YES"
     */
    public static String exchange(List<Integer> lst1, List<Integer> lst2) {
	//We will first check if all the elements of lst1 are even, then there is no need to perform any exchange.
//If lst1 contains odd elements, we will find the number of odd elements in lst1.
//Then, we will count the number of even elements in lst2.
//If the number of even elements in lst2 is greater than or equal to the number of odd elements in lst1, then it is possible to exchange elements between lst1 and lst2 to make lst1 only even, otherwise it is not possible.

        int countOdd = 0;
        for (int i = 0; i < lst1.size(); i++) {
            if (lst1.get(i) % 2 != 0)
                countOdd++;
        }
        if (countOdd == 0)
            return "YES";

        int countEven = 0;
        for (int i = 0; i < lst2.size(); i++) {
            if (lst2.get(i) % 2 == 0)
                countEven++;
        }
        if (countEven >= countOdd)
            return "YES";
        else
            return "NO";
    }
}