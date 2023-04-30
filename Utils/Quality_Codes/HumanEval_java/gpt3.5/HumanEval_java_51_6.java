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
	// Function to remove vowels from given string
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'
                    && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result += ch;
            }
        }
        return result;
    }
}

/*
Testing removeVowels function with different inputs
*/