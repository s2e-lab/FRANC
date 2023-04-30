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
	// First, we need to check if lst1 is already composed of only even numbers
        boolean allEven = true;
        for (int num : lst1) {
            if (num % 2 != 0) {
                allEven = false;
                break; // no need to keep checking
            }
        }
        if (allEven) {
            return "YES";
        }
        
        // If not, we need to check if there are odd numbers in lst2 that can be swapped
        List<Integer> oddIndices = new ArrayList<>();
        for (int i = 0; i < lst2.size(); i++) {
            if (lst2.get(i) % 2 != 0) {
                oddIndices.add(i);
            }
        }
        
        // If there are no odd numbers in lst2, we can't make lst1 all even
        if (oddIndices.isEmpty()) {
            return "NO";
        }
        
        // We will greedily swap odd numbers from lst2 to lst1 until lst1 is all even
        for (int i = 0; i < lst1.size() && !allEven; i++) {
            if (lst1.get(i) % 2 != 0) {
                // Try to find an odd number in lst2 to swap with
                boolean swapped = false;
                for (int j = 0; j < oddIndices.size(); j++) {
                    int index = oddIndices.get(j);
                    if (lst2.get(index) % 2 == 0) {
                        // Swap lst1[i] and lst2[index]
                        int temp = lst1.get(i);
                        lst1.set(i, lst2.get(index));
                        lst2.set(index, temp);
                        swapped = true;
                        oddIndices.remove(j); // we used this odd number already
                        break; // no need to keep searching in lst2
                    }
                }
                if (!swapped) {
                    // We couldn't find an odd number to swap with, so lst1 can't be all even
                    return "NO";
                } else {
                    // Check if lst1 is now all even
                    allEven = true;
                    for (int num : lst1) {
                        if (num % 2 != 0) {
                            allEven = false;
                            break; // no need to keep checking
                        }
                    }
                }
            }
        }
        
        // If we made it here, lst1 is
}
}