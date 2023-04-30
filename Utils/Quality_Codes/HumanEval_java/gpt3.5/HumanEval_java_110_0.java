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
	// First, we check if lst1 is already a list of only even numbers 
        boolean allEven = lst1.stream().allMatch(num -> num % 2 == 0);
        if (allEven) {
            return "YES";
        }
        
        // Next, we remove all odd numbers from lst2
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : lst2) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        
        // Then, we sort the even numbers in descending order
        Collections.sort(evenNumbers, Collections.reverseOrder());
        
        // Lastly, we try to swap odd numbers in lst1 with even numbers from lst2
        for (int i = 0; i < lst1.size(); i++) {
            if (lst1.get(i) % 2 != 0) {
                if (evenNumbers.isEmpty()) {
                    return "NO";
                }
                int temp = lst1.get(i);
                lst1.set(i, evenNumbers.get(0));
                evenNumbers.remove(0);
                lst2.add(temp);
            }
        }
        
        // We check again if lst1 is now a list of only even numbers
        allEven = lst1.stream().allMatch(num -> num % 2 == 0);
        if (allEven) {
            return "YES";
        } else {
            return "NO";
        }
    }
}