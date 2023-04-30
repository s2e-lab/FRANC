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
        URL url1 = new URL(url);
        URLConnection conn = url1.openConnection();
        conn.connect();
        InputStream in = conn.getInputStream();
        FileOutputStream fos = new FileOutputStream(fileName);
        IOUtils.copy(in, fos);
        in.close();
        fos.close();
        URLConnection c1=url1.openConnection();
        String c1result="Connection refused -"+connectionStatus(c1);
        in= getInputStream(c1);
        
}
}