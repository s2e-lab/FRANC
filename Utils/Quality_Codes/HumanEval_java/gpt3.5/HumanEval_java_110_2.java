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
	// Initializing two counters, one for even numbers in lst1 and one for odd numbers in lst2
        int evenCount = 0;
        int oddCount = 0;

        // Checking each element in lst1 to see if it is even
        for(int i=0; i<lst1.size(); i++){
            if(lst1.get(i)%2 == 0){
                evenCount++;
            }
        }

        // Checking each element in lst2 to see if it is odd
        for(int i=0; i<lst2.size(); i++){
            if(lst2.get(i)%2 != 0){
                oddCount++;
            }
        }

        // If lst1 has all even numbers or lst2 has all odd numbers, return "YES"
        if(evenCount == lst1.size() || oddCount == lst2.size()){
            return "YES";
        }

        // Otherwise, return "NO"
        return "NO";
    }
}