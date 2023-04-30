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
	// Remove leading/trailing spaces
        sentence = sentence.trim();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through each word to check if its length is a prime number
        for (String word : words) {
            if (isPrime(word.length())) {
                result.append(word).append(" ");
            }
        }

        // Trim the trailing space and return the result
        return result.toString().trim();
    }

    /**
     * Helper method to check if a number is a prime number
     */
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}