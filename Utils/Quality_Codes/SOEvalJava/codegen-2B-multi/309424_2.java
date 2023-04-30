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
        System.out.println("Hello World");
        Scanner sc = new Scanner(is);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a; i++){
            sb.append(i);
        }
         
        return sb.toString();
    }
}
