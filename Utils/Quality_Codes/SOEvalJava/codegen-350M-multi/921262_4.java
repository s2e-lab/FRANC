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
        URLConnection con = new URL(url).openConnection();
        con.connect();
     
        InputStream in = con.getInputStream();
        URLConnection connDownload = AccessibleResource.createConnection(url, fileName, con.getInputStream());
        OutputStream out = new FileOutputStream(fileName);
        
        byte data[] = new byte[1024];
        int val = -1;
}
}