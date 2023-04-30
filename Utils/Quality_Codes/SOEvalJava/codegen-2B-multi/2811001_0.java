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

	ArrayList<String> tags = new ArrayList<String>();
	String inputFile = "/home/vadim/Project/algorithms/src/main/java/XMLUtils/input";
	// String inputFile = System.getProperty("user.dir") +"/src/main/java/XMLUtils/input";
	// String inputFile = "src/main/java/XMLUtils/input";
	InputStream inputStream = new FileInputStream(new File(inputFile));
}
}