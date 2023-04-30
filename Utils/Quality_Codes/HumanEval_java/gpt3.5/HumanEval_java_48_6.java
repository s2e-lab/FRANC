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
	if (text == null || text.isEmpty()){
        return true;
    }
    text = text.toLowerCase(); //convert text to lowercase
    //Using two pointers, one points to the first character and the other points to the last character
    int leftIndex = 0;
    int rightIndex = text.length() -1;   
    while (leftIndex < rightIndex){
        if (text.charAt(leftIndex) != text.charAt(rightIndex)){
            return false;
        }
        leftIndex++;
        rightIndex--;
    }
    return true;
}
}