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
	// We need to count the number of odd and even elements in lst1
// If lst1 has even number of odd elements, return "YES"
// If lst1 has odd number of odd elements, check if lst2 has enough even elements to make lst1 even, return "YES" if true
// Otherwise, return "NO"

        int oddCount = 0;
        int evenCount = 0;
        
        for (int num : lst1) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        if (oddCount % 2 == 0) {
            return "YES";
        } else {
            int evenNeeded = oddCount - evenCount;
            
            for (int num : lst2) {
                if (num % 2 == 0) {
                    evenNeeded--;
                    if (evenNeeded == 0) {
                        return "YES";
                    }
                }
            }
            
            return "NO";
        }        
    }
}

//Testing the code    