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
	// First, we need to check if lst1 already contains only even numbers
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
        
        // If not, we need to check if we can exchange elements between lst1 and lst2 to make lst1 have only even numbers
        boolean canExchange = false;
        for (int i = 0; i < lst1.size(); i++) {
            int num1 = lst1.get(i);
            if (num1 % 2 != 0) {
                for (int j = 0; j < lst2.size(); j++) {
                    int num2 = lst2.get(j);
                    if (num2 % 2 == 0) {
                        lst1.set(i, num2);
                        lst2.set(j, num1);
                        allEven = true;
                        for (int num : lst1) {
                            if (num % 2 != 0) {
                                allEven = false;
                                break;
                            }
                        }
                        if (allEven) {
                            canExchange = true;
                            break;
                        } else {
                            lst1.set(i, num1);
                            lst2.set(j, num2);
                        }
                    }
                }
                if (canExchange) {
                    break;
                }
            }
        }
        if (canExchange) {
            return "YES";
        } else {
            return "NO";
        }
    }

    /**
     * Helper function to read input from a string and return a list of integers
     */
    public static List<Integer> parseInput(String input) {
        List<Integer> lst = new ArrayList<>();
        String[] parts = input.split(" ");
        for (String part : parts) {
            lst.add(Integer.parseInt(part));
        }
        return lst;
    }
}
