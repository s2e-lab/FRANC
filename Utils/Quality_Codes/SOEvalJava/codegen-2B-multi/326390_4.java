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
        try {
            BufferedReader r = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder sb = new StringBuilder();
            while((line = r.readLine())!=null) {
              sb.append(line);
              sb.append("\n");
            }
            
            return sb.toString();            
          }catch(IOException e) {
                e.printStackTrace();
          }
        return null;
    }
}