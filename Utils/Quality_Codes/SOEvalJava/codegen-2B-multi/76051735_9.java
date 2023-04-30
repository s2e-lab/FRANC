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
        if(str == null || str.isEmpty() || str.length()!= num)
            return "";
            
        StringBuilder sb = new StringBuilder();
        int start = 1;
        for(int i=0; i < str.length(); i++) {
            if(str.charAt(i) == mask)
                start++;
                
            if(start > num) {
                sb.append(mask);
                start = 1;
            }
            sb.append(str.charAt(i));
        }
        
}
}