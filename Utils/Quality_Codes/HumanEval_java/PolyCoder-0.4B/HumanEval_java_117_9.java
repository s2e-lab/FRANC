import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class SelectWords {
    /**
     * Given a string s and a natural number n, you have been tasked to implement 
     * a function that returns a list of all words from string s that contain exactly 
     * n consonants, in order these words appear in the string s.
     * If the string s is empty then the function should return an empty list.
     * Note: you may assume the input string contains only letters and spaces.
     * Examples:
     * select_words("Mary had a little lamb", 4) ==> ["little"]
     * select_words("Mary had a little lamb", 3) ==> ["Mary", "lamb"]
     * select_words("simple white space", 2) ==> []
     * select_words("Hello world", 4) ==> ["world"]
     * select_words("Uncle sam", 3) ==> ["Uncle"]
     *
     * > selectWords("Mary had a little lamb", 4)
     * ["little"]
     * > selectWords("Mary had a little lamb", 3)
     * ["Mary", "lamb"]
     * > selectWords("simple white space", 2)
     * []
     * > selectWords("Hello world", 4)
     * ["world"]
     * > selectWords("Uncle sam", 3)
     * ["Uncle"]
     * > selectWords("", 4)
     * []
     * > selectWords("a b c d e f", 1)
     * ["b", "c", "d", "f"]
     */
    public static List<Object> selectWords(String s, int n) {
        return selectWords(s, n, 1, false);
    }

    public static List<Object> selectWords(String s, int n, int startpos, boolean startonly) {
        return selectWords(s, new String[0], startpos, startonly);
    }

    private static List<Object> selectWords(String[] origstr, List<Pair<String, Integer>> wordIndexes, int offset, boolean startonly) {
      
}
}