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
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        Boolean is_palindrome = true;
        while (left < right) {
            if ((((chars[left] < chr) && (chr < chars[right])) || (chars[left] > chr && chars[right] < chr))) {
                is_palindrome = false;
                break;
            }
            left++;
            right--;
        }
}
}