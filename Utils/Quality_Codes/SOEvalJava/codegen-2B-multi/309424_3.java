import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class ID_309424{
    /**
     * Write a function to convert inputstream to string.
     * 
     * Example:
     * InputStream is = new ByteArrayInputStream("Hello World".getBytes());
     * String str = inputStreamToString(is);
     * 
     * output: "Hello World"
     */
    public static String inputStreamToString(InputStream is) {
        StringBuilder ret = new StringBuilder();
        int b = 0;
        try
        {
            while( (b = is.read())!= -1)
            {
                ret.append((char)b); 
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return ret.toString();    
    }
    
    // https://github.com/CaliRe/DP-Solutions/blob/master/solutions/ID_309424
}