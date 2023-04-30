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
        if (str == null || str.length() < num) {
            return "";
        }
        if (str.length() >= num) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str.length()+1);
        sb.append(mask);

        int maskStart = 0;
        int numMasked = 0;
}
}