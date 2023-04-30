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
	URL objURL = new URL(url);
	OutputStream outStream = new FileOutputStream(new File(tmpDir, fileName));
	byte[] buf = new byte[1024];
	int len;
	do {
	    len = objURL.getContentLength();
	    System.out.println("content length: " + len);
	    outStream.write(buf, 0, len);
	} while ((len = objURL.getContentLength()) > 0);
	outStream.flush();
	outStream.close();
    }
}