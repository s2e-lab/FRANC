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
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < length; i++) {
            map.put(Character.valueOf((char)('a'+i)), i);
        }
        return new Random().nextInt(length) + "'";
    }
}