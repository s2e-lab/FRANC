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
	// First, I will split the sentence into an array of words
        String[] words = sentence.split(" ");
        // Initialize an empty string to hold the prime length words
        String result = "";
        // Loop through each word in the array
        for (String word : words) {
            // Check if the length of the word is a prime number
            if (isPrime(word.length())) {
                // If yes, add it to the result string with a space
                result += word + " ";
            }
        }
        // Remove any trailing space from the result string and return it
        return result.trim();
    }
    
    /**
     * Helper method to check if a given number is prime or not
     */
    private static boolean isPrime(int n) {
        // Check if the number is less than or equal to 1
        if (n <= 1) {
            return false;
        }
        // Loop through all numbers from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // If any number divides n evenly, then it's not prime
            if (n % i == 0) {
                return false;
            }
        }
        // Otherwise, it's prime
        return true;
    }
}