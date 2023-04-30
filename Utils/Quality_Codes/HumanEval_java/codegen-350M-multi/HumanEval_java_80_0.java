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
        try {
            //create instance of stream
            Scanner sScan = new Scanner(s.toCharArray());

            // read until EOL
            boolean result = true;
            char c;

            // initialise scanner and get first character
            switch (sScan.next()) {
                case 'a':
                    System.out.println("I'm a happy string!");

                case 'b':
                    System.out.println("A funny string");

                case 'c':
                    int index = 0;
                    int testIndex = 0;

