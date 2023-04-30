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
	// First, we need to count the number of odd integers in lst1
int oddCount = 0;
for (int i = 0; i < lst1.size(); i++) {
    if (lst1.get(i) % 2 != 0) {
        oddCount++;
    }
}

// If lst1 already contains only even numbers or lst2 has no odd numbers, return "YES"
if (oddCount == 0 || lst2.stream().noneMatch(n -> n % 2 != 0)) {
    return "YES";
}

// Otherwise, we need to find odd integers in lst1 to swap with even numbers in lst2
for (int i = 0; i < lst1.size(); i++) {
    if (lst1.get(i) % 2 != 0) {
        for (int j = 0; j < lst2.size(); j++) {
            if (lst2.get(j) % 2 == 0) {
                // Swap odd element in lst1 with even element in lst2
                int temp = lst1.get(i);
                lst1.set(i, lst2.get(j));
                lst2.set(j, temp);
                oddCount--;
                break;
            }
        }
    }
    // If all odd elements in lst1 have been swapped, return "YES"
    if (oddCount == 0) {
        return "YES";
    }
}

// If all iterations have completed and there are still odd elements in lst1, return "NO"
return "NO";
}
}