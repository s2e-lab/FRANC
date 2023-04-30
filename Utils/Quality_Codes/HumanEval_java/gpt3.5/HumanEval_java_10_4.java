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
	if(string == null || string.length()==0){
            return "";
        }
        StringBuilder result = new StringBuilder(string);
        String reversedPrefix = new StringBuilder(string).reverse().toString();
        int len = string.length();
        for(int i=0;i<len;i++){
            String suffix = string.substring(i);
            String reversedSuffix = new StringBuilder(suffix).reverse().toString();
            if(suffix.equals(reversedSuffix)){
                result.append(reversedPrefix.substring(0,i));
                break;
            }
        }
        return result.toString();
    }
}