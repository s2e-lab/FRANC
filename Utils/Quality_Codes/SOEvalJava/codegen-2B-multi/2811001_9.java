import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import javax.xml.*;

class ID_2811001{
    /**
     * Write a function to read an XML file and return a list of all the tags in the file.
     * 
     * Example:
     * getTags("test.xml");
     * 
     * output:
     * [html, head, tittle, body, h1, p, a]
     */
    public static ArrayList<String> getTags(String fileName) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine())!= null)
            sb.append(line);
        br.close();
        
        ArrayList<String> lines = new ArrayList<String>();
        String tag_name = null;
        Pattern p1 = Pattern.compile("\\s+");
        Matcher m1 = p1.matcher(sb.toString());
}
}