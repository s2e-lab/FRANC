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
	// Let's split the sentence into individual words first
        String[] words = sentence.split(" ");
        // Let's create an empty string to hold the result
        String result = "";
        // Now, let's iterate through each word and check if its length is a prime number
        for(String word : words) {
            if(isPrime(word.length())) {
                // If the length of the word is a prime number, we append it to the result string along with a space
                result += word + " ";
            }
        }
        // Let's remove the extra white space at the end of the string and return the result
        return result.trim();
    }

    // This helper function checks if a given number is a prime number or not
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main function to test the code
    public static void main(String[] args) {
        String sentence1 = "This is a test";
        String sentence2 = "lets go for swimming";
        String sentence3 = "there is no place available here";
        String sentence4 = "Hi I am Hussein";
        String sentence5 = "go for it";
        String sentence6 = "here";
        String sentence7 = "here is";

        System.out.println(wordsInSentence(sentence1)); // Output: is
        System.out.println(wordsInSentence(sentence2)); // Output: go for
        System.out.println(wordsInSentence(sentence3)); // Output: there is no place
        System.out.println(wordsInSentence(sentence4)); // Output: Hi am Hussein
        System.out.println(wordsInSentence(sentence5)); // Output: go for it
        System.out.println(wordsInSentence(sentence6)); // Output: 
        System.out.println(wordsInSentence(sentence7)); // Output: is
    }
}