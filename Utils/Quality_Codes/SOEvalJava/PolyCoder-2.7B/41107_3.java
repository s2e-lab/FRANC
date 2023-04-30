import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class ID_41107{
    /**
     * Write a program to create a random alphanumeric string of a given length.
     * 
     * Example:
     * randomString(10);
     * 
     * output: 2aBb3cDd4e
     */
    public static String randomString(int length) {
        StringBuffer stringBuffer = new StringBuffer();
        while (stringBuffer.length() < length) {
            stringBuffer.append(genRandomWord());
        }
        return stringBuffer.toString();
    }
    
}