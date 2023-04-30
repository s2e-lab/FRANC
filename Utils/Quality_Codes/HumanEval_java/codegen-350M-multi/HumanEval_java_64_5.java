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
        int length = 0;
        int v = s.charAt(0);
        if (v == 'y') {
            length++;
            v = s.charAt(1);
        }
        if (v == 'e' || v == 'i') {
            length++;
            v = s.charAt(2);
        }
        if (v == 'u') {
            length++;
        }
        v = 0;
        while (v <= 'z') {
            v++;
        }
        return length;
    }
}