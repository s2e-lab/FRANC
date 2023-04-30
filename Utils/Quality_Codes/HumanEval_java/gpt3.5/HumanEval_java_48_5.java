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
	if (text.length() == 0 || text.length() == 1) { // An empty string or a string with only one character is a palindrome
            return true;
        }
        else {
            int i = 0;
            int j = text.length() - 1;
            while (i < j) {
                if (text.charAt(i) != text.charAt(j)) { // If the characters at both ends of the string are not equal, then the string is not a palindrome
                    return false;
                }
                i++;
                j--;
            }
            return true; // If the characters are equal for all pairs, then the string is a palindrome
        }
    }

    public static void main(String[] args) throws IOException {
        String text = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        text = br.readLine();
        if (isPalindrome(text)) {
            System.out.println("'" + text + "' is a palindrome");
        }
        else {
            System.out.println("'" + text + "' is not a palindrome");
        }
    }
}