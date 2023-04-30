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
	if (string == null || string.isEmpty()) {
        return "";
    }

    int left = 0;
    int right = string.length() - 1;
    int end = right;

    // Find the longest palindromic suffix
    while (left < right) {
        if (string.charAt(left) == string.charAt(right)) {
            left++;
            right--;
        } else {
            left = 0;
            end--;
            right = end;
        }
    }

    // Append to the end of the string reverse of a string prefix that comes before the palindromic suffix
    StringBuilder sb = new StringBuilder(string);
    for (int i = end - 1; i >= 0; i--) {
        sb.append(string.charAt(i));
    }

    return sb.toString();
}
}