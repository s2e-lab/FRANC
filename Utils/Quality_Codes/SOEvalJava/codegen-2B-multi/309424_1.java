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
        StringBuilder sb = new StringBuilder();
        try {
            int byteValue;
            while((byteValue = is.read())!= -1)
                sb.append((char)byteValue);
        } catch(IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
