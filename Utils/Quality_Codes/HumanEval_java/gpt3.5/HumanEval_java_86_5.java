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
	// First, split the string into an array of words
        String[] words = s.split(" ");
// Create a new array to hold the ordered words
        String[] orderedWords = new String[words.length];
// Loop through each word in the array
        for (int i = 0; i < words.length; i++) {
// Split the current word into an array of characters
            char[] chars = words[i].toCharArray();
// Sort the array of characters in ascending order
            Arrays.sort(chars);
// Combine the sorted characters into a new string
            String sortedWord = new String(chars);
// Add the sorted word to the orderedWords array
            orderedWords[i] = sortedWord;
        }
// Combine the ordered words array into a string, keeping the original spaces
        String orderedString = String.join(" ", orderedWords);
// Return the ordered string
        return orderedString;
    }
}