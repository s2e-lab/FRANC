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
        try (
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                PrintWriter out = new PrintWriter(System.out)) {
            String t;
            while ((t = br.readLine())!= null) {
                out.println(t);
                
            }
            return t;
        } catch(Exception e){
            return null;
        }
    }
}

//Input:
//test.txt
//test
//11.11
//6.6666
//Hello World
//
//