import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WordsInSentence {
    /**
     * * You are given a string representing a sentence,
     * the sentence contains some words separated by a space,
     * and you have to return a string that contains the words from the original sentence,
     * whose lengths are prime numbers,
     * the order of the words in the new string should be the same as the original one.

     * Example 1:
     *     Input: sentence = "This is a test"
     *     Output: "is"

     * Example 2:
     *     Input: sentence = "lets go for swimming"
     *     Output: "go for"

     * Constraints:
     *     * 1 <= len(sentence) <= 100
     *     * sentence contains only letters
     *
     * > wordsInSentence("This is a test")
     * "is"
     * > wordsInSentence("lets go for swimming")
     * "go for"
     * > wordsInSentence("there is no place available here")
     * "there is no place"
     * > wordsInSentence("Hi I am Hussein")
     * "Hi am Hussein"
     * > wordsInSentence("go for it")
     * "go for it"
     * > wordsInSentence("here")
     * ""
     * > wordsInSentence("here is")
     * "is"
     */
    public static String wordsInSentence(String sentence) {
	// Start by splitting the sentence into individual words using String.split()
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        
        // Iterate over each word and check if its length is a prime number
        for (int i = 0; i < words.length; i++) {
            if (isPrime(words[i].length())) {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        
        // Trim the end of the resulting string to remove any extra space
        String result = sb.toString().trim();
        
        return result;
    }
    
    // Helper method to check if a given integer is a prime number
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}