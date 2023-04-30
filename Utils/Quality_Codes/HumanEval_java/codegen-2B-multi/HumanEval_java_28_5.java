import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Concatenate {
    /**
     * Concatenate list of strings into a single string
     * >>> concatenate([])
     * ''
     * >>> concatenate(['a', 'b', 'c'])
     * 'abc'
     *
     * > concatenate([])
     * ""
     * > concatenate(["x", "y", "z"])
     * "xyz"
     * > concatenate(["x", "y", "z", "w", "k"])
     * "xyzwk"
     */
    public static String concatenate(List<Object> strings) {
        String concatenated = "";
        for (Object o:strings){
            concatenated += o.toString();
        }
        return concatenated;
    }
    //********************** Test Cases **********************
    
    // @return "ab12cd4ef"
    public static String getTestCase1(){
        return concatenate(Arrays.asList("a","b","c","d","e","f")).toUpperCase();
    }
    
    // @return ""
}