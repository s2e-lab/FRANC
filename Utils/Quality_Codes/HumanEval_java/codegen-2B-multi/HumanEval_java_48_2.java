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
        if (text == null) return false;
        boolean isPalindrome = true;
        int begin = 0;
        int end = text.length() - 1;
        while (end > begin) {
            if (text.charAt(begin)!= text.charAt(end)) {
                isPalindrome =!isPalindrome;
                break;
            }
            begin++;
            end--;
        }
        return isPalindrome;
    }
}