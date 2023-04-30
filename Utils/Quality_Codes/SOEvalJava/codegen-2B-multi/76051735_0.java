import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

class ID_76051735{
    /**
     * 
     * Write a function to mask a string up to the given number of characters with a mask character.
     * If the string is less than the given number of characters, it should be fully masked.
     * 
     * Example:
     * String masked = mask("1234567890", 5, '*');
     * 
     * output: "*****67890"
     */
    public static String mask(String str, int num, char mask) {
        if (str == null || str.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(mask);
        }
        return sb.deleteCharAt(str.length()).append(str).toString();
    }
    // this solution is too slow
    // time:O(n^2),space:O(2)
    public static String mask(String str, int num){
}
}