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
        Scanner scanner = null;
        try{
            scanner = new Scanner(new File(fileName));
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()){
                sb.append(scanner.nextLine());
            }

            scanner.close();
            return sb.toString();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
            return null;
        }
    }
}