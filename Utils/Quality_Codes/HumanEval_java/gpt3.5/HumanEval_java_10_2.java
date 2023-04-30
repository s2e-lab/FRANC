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
	String reversed_string = new StringBuilder(string).reverse().toString();
        if (string.length() == 0 || string.equals(reversed_string)) {
            return string;
        }
        int palindrome_end_index = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            if (is_palindrome(string.substring(0, i + 1))) {
                palindrome_end_index = i;
                break;
            }
        }
        String prefix = string.substring(palindrome_end_index + 1);
        String reverse_prefix = new StringBuilder(prefix).reverse().toString();
        return reverse_prefix + string;
    }
    
     /**
     * Check if a string is a palindrome.
     */
    private static boolean is_palindrome(String string) {
        String reversed_string = new StringBuilder(string).reverse().toString();
        return string.equals(reversed_string);
    }
}