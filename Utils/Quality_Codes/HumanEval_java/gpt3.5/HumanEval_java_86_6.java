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
	if(s == null || s.length()==0) return "";
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0; i<words.length; i++){
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            res.append(new String(chars)).append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}