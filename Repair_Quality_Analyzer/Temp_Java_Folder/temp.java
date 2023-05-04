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
        int r = random.nextInt(length - 1);
        for (int i = 0; i < r; i++) {
            result += "1";
        }
        return result.substring(0, r);
    }

}