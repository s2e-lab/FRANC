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
	// We can use String's split() method to split the sentence into words
// Then, we can sort each word's characters and join them back to form the new word
// We will keep track of the original order of words using a list
// Finally, we will join the ordered words using spaces and return the string

        if(s==null || s.length()==0) return "";
        
        String[] words = s.split(" ");
        List<String> orderedWords = new ArrayList<>();
        
        for(String word: words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            orderedWords.add(new String(chars));
        }
        
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(String word: orderedWords) {
            sb.append(word);
            if(i<words.length-1) {
                sb.append(" ");
            }
            i++;
        }
        
        return sb.toString();
    }

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