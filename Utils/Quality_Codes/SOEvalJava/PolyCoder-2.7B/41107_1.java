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
        String result = "";
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            result += Integer.toString(r.nextInt(10), 16);
        }
        return result;
    }
}