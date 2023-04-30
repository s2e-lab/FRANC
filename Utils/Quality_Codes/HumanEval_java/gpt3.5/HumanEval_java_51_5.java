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
	StringBuilder result = new StringBuilder(); // initialize a StringBuilder to store the non-vowel characters
        for(int i=0; i<text.length(); i++) { // loop through the string
            char ch = text.charAt(i); // get the character at index i
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                // if the character is a vowel, continue the loop without adding it to the result
                continue;
            }
            result.append(ch); // add the character to the result StringBuilder if it's not a vowel
        }
        return result.toString(); // convert the StringBuilder to a string and return it as the result
    }
}