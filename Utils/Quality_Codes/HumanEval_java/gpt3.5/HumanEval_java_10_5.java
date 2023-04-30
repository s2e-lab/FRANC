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
	if(string==null || string.length()==0){
            return "";
        }
        char[] chars = string.toCharArray();
        int i=0, j=chars.length-1;
        //find longest palindromic suffix in string
        while(i<j){
            if(chars[i]==chars[j]){
                i++;
                j--;
            }
            else{
                int k=j-1;
                while(k>i && chars[i]!=chars[k]){
                    k--;
                }
                j=k;
                k=i;
                //reverse string prefix and append to string
                StringBuilder sb = new StringBuilder();
                while(k>=0){
                    sb.append(chars[k]);
                    k--;
                }
                return sb.toString()+string;
            }
        }
        return string;
    }
}