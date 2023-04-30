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
        File f = new File(fileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String result = "";
            while (br.ready()) {
                result += br.readLine() + " ";
            }
            br.close();
            return result;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

}
}