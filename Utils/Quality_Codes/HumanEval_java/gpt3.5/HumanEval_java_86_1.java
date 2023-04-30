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
	//I'm assuming that the input string contains only printable ASCII characters
        String[] words = s.split("\\s+"); //Split the string into array of words
        StringBuilder result = new StringBuilder(); //Initialize an empty string builder to store the new sorted string
        for(String word: words){ //Iterate through each word
            char[] chars = word.toCharArray(); //Convert the word to character array
            Arrays.sort(chars); //Sort the characters in ascending order based on their ascii value
            for(char c: chars){ //Iterate through each sorted character
                result.append(c); //Append the character to the new string
            }
            result.append(" "); //Append a space to the new string after each word
        }
        return result.toString().trim(); //Trim the trailing space and return the new string
}
}