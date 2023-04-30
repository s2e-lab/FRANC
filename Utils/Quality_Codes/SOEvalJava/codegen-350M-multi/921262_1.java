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
        URL urlObj = new URL(url);
        URLConnection conn = urlObj.openConnection();  
        conn.setUseCaches(false);  
        conn.addRequestProperty("Accept-Encoding", "gzip, deflate");
        InputStream i = conn.getInputStream();  
        FileOutputStream f = new FileOutputStream(fileName);  
        byte[] b;  
}
}