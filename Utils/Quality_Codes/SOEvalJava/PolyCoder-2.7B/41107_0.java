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
        int letters = length / 26;
        StringBuilder res = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < letters; i++) {
            String str = Integer.toString(r.nextInt(26));
            putFirstChar(str, res, length);
        }

    
}
}