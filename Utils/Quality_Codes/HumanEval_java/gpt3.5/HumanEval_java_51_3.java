import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RemoveVowels {
    /**
     * * remove_vowels is a function that takes string and returns string without vowels.
     * >>> remove_vowels('')
     * ''
     * >>> remove_vowels("abcdef\nghijklm")
     * 'bcdf\nghjklm'
     * >>> remove_vowels('abcdef')
     * 'bcdf'
     * >>> remove_vowels('aaaaa')
     * ''
     * >>> remove_vowels('aaBAA')
     * 'B'
     * >>> remove_vowels('zbcd')
     * 'zbcd'
     *
     * > removeVowels("")
     * ""
     * > removeVowels("abcdef\nghijklm")
     * "bcdf\nghjklm"
     * > removeVowels("fedcba")
     * "fdcb"
     * > removeVowels("eeeee")
     * ""
     * > removeVowels("acBAA")
     * "cB"
     * > removeVowels("EcBOO")
     * "cB"
     * > removeVowels("ybcd")
     * "ybcd"
     */
    public static String removeVowels(String text) {
	if (text == null || text.equals("")) { // check if string is empty or null 
            return "";
        }
        String vowels = "aeiouAEIOU"; // initialize variable with all vowels
        StringBuilder result = new StringBuilder(); // create a new StringBuilder object
        for (int i = 0; i < text.length(); i++) { // loop through characters of the string
            if (vowels.indexOf(text.charAt(i)) == -1) { // if character is not a vowel
                result.append(text.charAt(i)); // append it to the result
            }
        }
        return result.toString(); // convert StringBuilder to String and return it
    }
}