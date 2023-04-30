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
	//Start of code
        if (text.length() == 0 || text.length() == 1) { // If string is empty or single character
            return true; // Return true for palindrome
        } else {
            char first = text.charAt(0); // Assigning first character to variable
            char last = text.charAt(text.length() - 1); // Assigning last character to variable
            if (first == last) { // If first and last character are same
                return isPalindrome(text.substring(1, text.length() - 1)); // Recursively call the function for the remaining substring
            } else {
                return false; // If characters are different, it's not a palindrome
            }
        }
    }
}
//End of code