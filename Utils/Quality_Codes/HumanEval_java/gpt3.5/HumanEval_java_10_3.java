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
	if (string == null || string.length() <= 1) {
            return string;
        }

        int len = string.length();
        int i = 0;

        // Find the longest palindrome suffix and save its length
        for (int j = len - 1; j >= 0; j--) {
            if (isPalindrome(string, i, j)) {
                i = j + 1;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        // Append the reverse of the prefix before the palindrome suffix
        sb.append(string.substring(i)).reverse().append(string);

        return sb.toString();
    }

    /**
     * Check if the supplied string is a palindrome.
     */
    private static boolean isPalindrome(String string, int start, int end) {
        while (start < end) {
            if (string.charAt(start++) != string.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}