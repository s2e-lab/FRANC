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
        Reader reader = new InputStreamReader(is);
        try {
            return new BufferedReader(reader).lines().reduce("", (a, b) -> a + b).trim();
        } catch (Exception e) {
            return null;
        }
    }
    
	public static void main(String[] args) throws IOException {
}
}