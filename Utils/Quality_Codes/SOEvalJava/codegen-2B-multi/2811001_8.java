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
        // Create a XMLInputFactory with the MyXmlAdapter class
        // which does the modification.
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader;
        ArrayList<String> output = new ArrayList<String>();
        String tag;
        String attrib;
        int line = 1;
        
}
}