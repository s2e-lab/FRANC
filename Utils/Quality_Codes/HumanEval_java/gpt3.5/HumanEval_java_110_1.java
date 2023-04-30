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
	// To solve this problem, we need to check if we can swap elements between lst1 and lst2 to make lst1 have only even numbers

// First, we count the number of even numbers in lst1
int count = 0;
for (int num : lst1) {
    if (num % 2 == 0) {
        count++;
    }
}

// Next, we count the number of odd numbers in lst2
int oddCount = 0;
for (int num : lst2) {
    if (num % 2 == 1) {
        oddCount++;
    }
}

// If the number of odd numbers in lst2 is greater than or equal to the number of missing even numbers in lst1
// then we can perform an exchange and lst1 will only contain even numbers
if (oddCount >= lst1.size() - count) {
    return "YES";
}

// Otherwise, an exchange is not possible
return "NO";
}
}