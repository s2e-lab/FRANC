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
		StringBuilder sb=new StringBuilder();
		sb.append(string);
		String reversedString=sb.reverse().toString();
		int n=string.length();
		for(int i=0;i<n;i++){
			if(string.substring(0,n-i).equals(reversedString.substring(i))){
				return reversedString.substring(0,i)+string;
			}
		}
		return "";
    }
}