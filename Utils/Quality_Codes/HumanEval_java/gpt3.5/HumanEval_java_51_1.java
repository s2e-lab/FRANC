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
	//First we define a string of vowels to look for
        String vowels = "aeiouAEIOU";
//Then we create an empty string to add the non-vowel characters to
        String result = "";
//We iterate through each character in the input text
        for(int i=0; i<text.length(); i++){
            char currentChar = text.charAt(i);
//We check if the current character is a vowel or not
            if(vowels.indexOf(currentChar) == -1){
//If the current character is not a vowel we add it to our result string
                result += currentChar;
            }
        }
//We return the final result string with all the non-vowel characters
        return result;
    }

}