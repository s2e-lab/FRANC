import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class IsHappy {
    /**
     * You are given a string s.
     * Your task is to check if the string is happy or not.
     * A string is happy if its length is at least 3 and every 3 consecutive letters are distinct
     * For example:
     * is_happy(a) => False
     * is_happy(aa) => False
     * is_happy(abcd) => True
     * is_happy(aabb) => False
     * is_happy(adb) => True
     * is_happy(xyy) => False
     *
     * > isHappy("a")
     * false
     * > isHappy("aa")
     * false
     * > isHappy("abcd")
     * true
     * > isHappy("aabb")
     * false
     * > isHappy("adb")
     * true
     * > isHappy("xyy")
     * false
     * > isHappy("iopaxpoi")
     * true
     * > isHappy("iopaxioi")
     * false
     */
    public static Boolean isHappy(String s) {
        return checkNumWords(s) && checkString(s);
    }

    /**
     * returns the number of words in s.
      */
    private static boolean checkHashMap(HashMap<Character, Boolean> hashMap) {
        HashSet<Character> set = new HashSet<>();
        Character c;
        for(String string : hashMap.keySet()){
            c = (Character)string;
            set.add(c);
        }
        return set.size();
    }

}