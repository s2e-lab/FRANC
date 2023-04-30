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
	if (text == null || text.length() == 0) {
            return "";
        }
        
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args){
        //testing the function
        System.out.println(removeVowels(""));
        System.out.println(removeVowels("abcdef\nghijklm"));
        System.out.println(removeVowels("fedcba"));
        System.out.println(removeVowels("eeeee"));
        System.out.println(removeVowels("acBAA"));
        System.out.println(removeVowels("EcBOO"));
        System.out.println(removeVowels("ybcd"));
    }
}