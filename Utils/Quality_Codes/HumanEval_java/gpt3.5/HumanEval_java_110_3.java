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
	// First, we need to check if lst1 already contains only even numbers. If it does, return "YES".
        boolean allEven = true;
        for (int num : lst1) {
            if (num % 2 != 0) {
                allEven = false;
                break;
            }
        }
        if (allEven) {
            return "YES";
        }
        // If lst1 contains some odd numbers, we need to check if there are even numbers in lst2
        boolean hasEven = false;
        for (int num : lst2) {
            if (num % 2 == 0) {
                hasEven = true;
                break;
            }
        }
        // If there are no even numbers in lst2, return "NO".
        if (!hasEven) {
            return "NO";
        }
        // Otherwise, we can perform the exchange of elements between lst1 and lst2
        // until lst1 contains only even numbers
        while (!allEven) {
            // Find the first odd number in lst1 and the first even number in lst2
            int oddIndex = -1;
            int evenIndex = -1;
            for (int i = 0; i < lst1.size(); i++) {
                if (lst1.get(i) % 2 != 0) {
                    oddIndex = i;
                    break;
                }
            }
            for (int i = 0; i < lst2.size(); i++) {
                if (lst2.get(i) % 2 == 0) {
                    evenIndex = i;
                    break;
                }
            }
            // If we cannot find an odd number in lst1 or an even number in lst2, return "NO".
            if (oddIndex == -1 || evenIndex == -1) {
                return "NO";
            }
            // Swap the odd number in lst1 with the even number in lst2
            int temp = lst1.get(oddIndex);
            lst1.set(oddIndex, lst2.get(evenIndex));
            lst2.set(evenIndex, temp);
            // Check if lst1 now contains only even numbers
            allEven = true;
            for (int num : lst1) {
                if (num % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
        }
        // Return "YES" if we were able to make lst1 contain only even numbers
}
}