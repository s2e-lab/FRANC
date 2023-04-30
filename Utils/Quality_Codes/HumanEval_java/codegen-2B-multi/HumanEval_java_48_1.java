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
        String text2 = text.toLowerCase();
        StringBuilder reversed = new StringBuilder(text2);
        for(int i = text.length() - 1; i >= 0; i--){
            int index = i + 1;
            reversed.setCharAt(index, text.charAt(i));
        }
        // Reverse the string
        return (text.compareTo(reversed.toString()) == 0)? true : false;
    }

}