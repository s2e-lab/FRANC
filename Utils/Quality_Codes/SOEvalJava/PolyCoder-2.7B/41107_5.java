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
        int[] string = new int[length];
        for (int i = 0; i < length; i++) {
            string[i] = (int) (Math.random() * (length - 1));
        }
        StringBuffer stringBuffer = new StringBuffer();
}
}