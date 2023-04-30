import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MakePalindrome {
    /**
     * Find the shortest palindrome that begins with a supplied string.
     * Algorithm idea is simple:
     * - Find the longest postfix of supplied string that is a palindrome.
     * - Append to the end of the string reverse of a string prefix that comes before the palindromic suffix.
     * >>> make_palindrome('')
     * ''
     * >>> make_palindrome('cat')
     * 'catac'
     * >>> make_palindrome('cata')
     * 'catac'
     *
     * > makePalindrome("")
     * ""
     * > makePalindrome("x")
     * "x"
     * > makePalindrome("xyz")
     * "xyzyx"
     * > makePalindrome("xyx")
     * "xyx"
     * > makePalindrome("jerry")
     * "jerryrrej"
     */
    public static String makePalindrome(String string) {
	// Implementing algorithm to generate shortest palindrome from given string
        if (string == null || string.isEmpty()) {
            return "";
        }
        StringBuilder palindrome = new StringBuilder(string);
        int n = string.length();
        for (int i = n - 1; i >= 0; i--) {
            if (isPalindrome(string, 0, i)) {
                break;
            } else {
                palindrome.insert(n, string.charAt(i));
            }
        }
        return palindrome.toString();

    }

    /**
     * Check if a given string is palindrome or not
     */
    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Main method to test code
     */
    public static void main(String[] args) {

        // Test cases from prompt
        System.out.println(makePalindrome("")); // Expected: ""
        System.out.println(makePalindrome("x")); // Expected: "x"
        System.out.println(makePalindrome("xyz")); // Expected: "xyzyx" 
        System.out.println(makePalindrome("xyx")); // Expected: "xyx"
        System.out.println(makePalindrome("jerry")); // Expected: "jerryrrej"

    }
}