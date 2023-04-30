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
        try(Scanner scanner = new Scanner(is)) {
            scanner.useDelimiter("");
            while(scanner.hasNext()){
                sb.append(scanner.next())	;
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
}
}