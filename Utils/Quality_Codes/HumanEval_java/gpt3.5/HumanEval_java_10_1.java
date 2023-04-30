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
	//Check if the input string is empty or contains only a single character
        if(string.isEmpty() || string.length() == 1) {
            return string;
        }
        
        StringBuilder palindromeBuilder = new StringBuilder(string);
        //loop through the string and check each character if it creates a palindrome
        for(int i = string.length() - 1; i >= 0; i--) {
            if(isPalindrome(string, i)) {
                //append the reverse of the prefix before the palindromic suffix to the string
                palindromeBuilder.append(reverseString(string.substring(0,i)));
                break;
            }
        }
        return palindromeBuilder.toString();
    }
    
    //method to check if a substring is a palindrome
    private static boolean isPalindrome(String string, int end) {
        int start = 0;
        while(start < end) {
            if(string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    //method to reverse a string
    private static String reverseString(String string) {
        StringBuilder reverse = new StringBuilder(string);
        return reverse.reverse().toString();
    }
    
    public static void main(String[] args) {
        System.out.println(makePalindrome(""));
        System.out.println(makePalindrome("x"));
        System.out.println(makePalindrome("xyz"));
        System.out.println(makePalindrome("xyx"));
        System.out.println(makePalindrome("jerry"));
    }
}