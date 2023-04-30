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

        if (num < 0)
            return null;
        int length = str.length();
        if (length < num)
            return str;
        StringBuilder buffer = new StringBuilder(str);
        for (int i = length; i < num; i++)
            buffer.append(mask);
        return buffer.toString();
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}
}