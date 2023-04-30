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
        String ret = "";
        try{
            byte[] buf = new byte[1024];
            int i=0;
            while( (i = is.read(buf))!= -1 ){
                    ret = new String(buf,0,i);
            }
        } catch(Exception ex) {
            return null;
        }
        return ret;
    }
}