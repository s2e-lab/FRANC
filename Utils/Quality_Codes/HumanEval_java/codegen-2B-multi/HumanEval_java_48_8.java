import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class IsPalindrome {
    /**
     * * Checks if given string is a palindrome
     * >>> is_palindrome('')
     * True
     * >>> is_palindrome('aba')
     * True
     * >>> is_palindrome('aaaaa')
     * True
     * >>> is_palindrome('zbcd')
     * False
     *
     * > isPalindrome("")
     * true
     * > isPalindrome("aba")
     * true
     * > isPalindrome("aaaaa")
     * true
     * > isPalindrome("zbcd")
     * false
     * > isPalindrome("xywyx")
     * true
     * > isPalindrome("xywyz")
     * false
     * > isPalindrome("xywzx")
     * false
     */
    public static Boolean isPalindrome(String text) {
        if (text == null || text.length() < 1) {
            return false;
        }

        // Use a pointer approach.
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i)!= text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}