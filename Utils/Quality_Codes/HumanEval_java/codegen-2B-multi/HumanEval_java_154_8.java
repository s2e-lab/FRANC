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
        HashSet hashSet = new HashSet();
        if (a.length() == 0 && b.length() == 0) {
            hashSet.add(""); // Empty String
        }
        if (a.length() == 0) {
            for (char c : b.toCharArray()) {
                if (!hashSet.contains(String.valueOf(c))) {
                    hashSet.add(String.valueOf(c));
                }
            }
        } else {
            hashSet.add(a);
        }
}
}