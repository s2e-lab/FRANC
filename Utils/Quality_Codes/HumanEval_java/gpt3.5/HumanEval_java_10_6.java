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
	// start of the implementation of makePalindrome method

        String reverse = "";
        for(int i=string.length()-1;i>=0;i--)
            reverse += string.charAt(i); // reverse string

        int index = 0;
        for(int i=string.length();i>=0;i--) // find the longest palindrome postfix
            if(string.substring(0,i).equals(reverse.substring(reverse.length()-i)))
                {index = i;break;}

        return reverse.substring(0,reverse.length()-index)+string; // concatenate strings and return

// end of implementation of makePalindrome method
    }

    // main method for testing makePalindrome method
    public static void main(String[] args) {
        System.out.println(makePalindrome("")); // ""
        System.out.println(makePalindrome("x")); // "x"
        System.out.println(makePalindrome("xyz")); // "xyzyx"
        System.out.println(makePalindrome("xyx")); // "xyx"
        System.out.println(makePalindrome("jerry")); // "jerryrrej"
    }
}