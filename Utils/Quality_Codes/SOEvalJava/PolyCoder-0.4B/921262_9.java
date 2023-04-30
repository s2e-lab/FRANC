import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.nio.channels.*;

class ID_921262{
    /**
     * Write a function to download a file from a URL.
     * 
     * Example:
     * downloadFile("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png", "google.png");
     * 
     * output: google.png
     */
    public static void downloadFile(String url, String fileName) throws Exception {
    	File file = new File(url + fileName);
    	if(!file.canRead()){
    		Console.WriteLine("Cannot read file from url=" + url + "\n");
    		return;
    	}
    	InputStream input = null;
    	BufferedReader byteToRead = null;
    	//Use InputStream Reader class to read data back
    	input = new BufferedInputStream(new FileInputStream(file), 100);
   
}
}