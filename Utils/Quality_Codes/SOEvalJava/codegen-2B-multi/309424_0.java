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
        StringBuffer sb = new StringBuffer();
        String line;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine())!= null) {
                sb.append(line);
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method
}
}