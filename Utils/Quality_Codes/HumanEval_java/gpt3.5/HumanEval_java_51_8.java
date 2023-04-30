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
	if(text == null || text.length() == 0) {
            return "";
        }
        else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<text.length(); i++) {
                char c = text.charAt(i);
                if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'
                && c!='A' && c!='E' && c!='I' && c!='O' && c!='U') {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }
}