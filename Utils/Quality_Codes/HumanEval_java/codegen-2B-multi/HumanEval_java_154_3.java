import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CycpatternCheck {
    /**
     * You are given 2 words. You need to return True if the second word or any of its rotations is a substring in the first word
     * cycpattern_check("abcd","abd") => False
     * cycpattern_check("hello","ell") => True
     * cycpattern_check("whassup","psus") => False
     * cycpattern_check("abab","baa") => True
     * cycpattern_check("efef","eeff") => False
     * cycpattern_check("himenss","simen") => True

     *
     * > cycpatternCheck("xyzw", "xyw")
     * false
     * > cycpatternCheck("yello", "ell")
     * true
     * > cycpatternCheck("whattup", "ptut")
     * false
     * > cycpatternCheck("efef", "fee")
     * true
     * > cycpatternCheck("abab", "aabb")
     * false
     * > cycpatternCheck("winemtt", "tinem")
     * true
     */
    public static Boolean cycpatternCheck(String a, String b) {
        ArrayList<Character> words = new ArrayList<>();
        words.addAll(Arrays.asList(a.split("")));
        for (char word1 : b.toCharArray()) {
            words.add(Character.toLowerCase(word1));
            words.add(Character.toUpperCase(word1));
        }
        ArrayList<Character> newWords = new ArrayList<>();
}
}