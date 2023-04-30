import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class ID_326390{
    /**
     * Write a function to get a string from a text file.
     * 
     * Example:
     * String str = getStringFromFile("test.txt");
     * 
     * output: "Hello World"
     */
    public static String getStringFromFile(String fileName) {
    File file=new File(fileName);
    if(!file.exists()){
        return null;
    }
    BufferedReader buff=null;
    return null;
    }
    
    public static void main(String[] argv){
    System.out.println(getStringFromFile("test.txt"));
    }
}
