import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class VowelsCount {
    /**
     * Write a function vowels_count which takes a string representing
     * a word as input and returns the number of vowels in the string.
     * Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
     * vowel, but only when it is at the end of the given word.

     * Example:
     * >>> vowels_count("abcde")
     * 2
     * >>> vowels_count("ACEDY")
     * 3
     *
     * > vowelsCount("abcde")
     * 2
     * > vowelsCount("Alone")
     * 3
     * > vowelsCount("key")
     * 2
     * > vowelsCount("bye")
     * 1
     * > vowelsCount("keY")
     * 2
     * > vowelsCount("bYe")
     * 1
     * > vowelsCount("ACEDY")
     * 3
     */
    public static int vowelsCount(String s) {
        boolean[][] table = vowelsTable();
        Set<Character> vowels = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += vowels.contains(s.charAt(i))? 1 : 0;
            if (vowels.contains(s.charAt(i))) {
                vowels.add(s.charAt(i));
            }
        }
}
}