import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class AntiShuffle {
    /**
     * * Write a function that takes a string and returns an ordered version of it.
     * Ordered version of string, is a string where all words (separated by space)
     * are replaced by a new word where all the characters arranged in
     * ascending order based on ascii value.
     * Note: You should keep the order of words and blank spaces in the sentence.

     * For example:
     * anti_shuffle('Hi') returns 'Hi'
     * anti_shuffle('hello') returns 'ehllo'
     * anti_shuffle('Hello World!!!') returns 'Hello !!!Wdlor'
     *
     * > antiShuffle("Hi")
     * "Hi"
     * > antiShuffle("hello")
     * "ehllo"
     * > antiShuffle("number")
     * "bemnru"
     * > antiShuffle("abcd")
     * "abcd"
     * > antiShuffle("Hello World!!!")
     * "Hello !!!Wdlor"
     * > antiShuffle("")
     * ""
     * > antiShuffle("Hi. My name is Mister Robot. How are you?")
     * ".Hi My aemn is Meirst .Rboot How aer ?ouy"
     */
    public static String antiShuffle(String s) {
	// First, we split the string into individual words
        String[] words = s.split("\\s");

        // We will store the sorted characters of each word in this StringBuilder
        StringBuilder sb = new StringBuilder();

        // For each word in the array
        for (String word : words) {
            // Convert the word to a character array
            char[] chars = word.toCharArray();
            // Sort the characters in ascending order based on ascii value
            Arrays.sort(chars);
            // Append the sorted characters to the StringBuilder with a space after the word
            sb.append(new String(chars)).append(" ");
        }

        // Convert the StringBuilder to a string and remove the trailing space
        return sb.toString().trim();
    }

    // Main function for testing
    public static void main(String[] args) {
        System.out.println(antiShuffle("Hi"));
        System.out.println(antiShuffle("hello"));
        System.out.println(antiShuffle("number"));
        System.out.println(antiShuffle("abcd"));
        System.out.println(antiShuffle("Hello World!!!"));
        System.out.println(antiShuffle(""));
        System.out.println(antiShuffle("Hi. My name is Mister Robot. How are you?"));
    }
}