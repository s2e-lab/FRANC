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
        StringBuilder strbuilder = new StringBuilder();
        
        strbuilder.append("");
        
        int index = 0;
        
        for(Character c : str.toCharArray()) {
            
            if(index < num) {
                strbuilder.append(mask);
            }
            else {
                strbuilder.append(c);
            }
            
            index++;
        }
        
        return strbuilder.toString();
    }
    
    public static void main(String args[]) {
        
}
}