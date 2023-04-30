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
        if (length<0) throw new IllegalArgumentException();
        int strLen=randomStringLength(length);
        // initialize the random string 
        String str=Util.newString(strLen);
        
        // fill random strings until length is satisfied 
}
}