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
	// implementing the function to extract the words with prime length
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            int len = word.length();
            if (isPrime(len)) {
                sb.append(word).append(" ");
            }
        }
        // removing the last space character
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    // helper function to check for prime numbers
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // main function to test the solution
    public static void main(String[] args) {
        System.out.println(wordsInSentence("This is a test")); // expected output: "is"
        System.out.println(wordsInSentence("lets go for swimming")); // expected output: "go for"
        System.out.println(wordsInSentence("there is no place available here")); // expected output: "there is no place"
        System.out.println(wordsInSentence("Hi I am Hussein")); // expected output: "Hi am Hussein"
        System.out.println(wordsInSentence("go for it")); // expected output: "go for it"
        System.out.println(wordsInSentence("here")); // expected output: ""
        System.out.println(wordsInSentence("here is")); // expected output: "is"
    }
}