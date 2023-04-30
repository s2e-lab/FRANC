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
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) chars[i] = (char) (Math.random() + 1);
        for (int i = 0; i < length; i++) sb.append(chars[i]);
        return sb.toString();
    }
}