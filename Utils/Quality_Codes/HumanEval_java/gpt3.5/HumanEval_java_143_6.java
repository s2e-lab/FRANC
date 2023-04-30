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
	// First, we split the sentence into words
        String[] words = sentence.split(" ");

        // Then we loop through each word and check if its length is prime
        List<String> primeWords = new ArrayList<>();
        for (String word : words) {
            int len = word.length();
            boolean isPrime = true;
            for (int i = 2; i < len; i++) {
                if (len % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (len > 1 && isPrime) {
                primeWords.add(word);
            }
        }

        // Finally, we join the prime words to form the output string
        String output = String.join(" ", primeWords);
        return output;
    }

    public static void main(String[] args) {
        System.out.println(wordsInSentence("This is a test"));
        System.out.println(wordsInSentence("lets go for swimming"));
        System.out.println(wordsInSentence("there is no place available here"));
        System.out.println(wordsInSentence("Hi I am Hussein"));
        System.out.println(wordsInSentence("go for it"));
        System.out.println(wordsInSentence("here"));
        System.out.println(wordsInSentence("here is"));
    }
}