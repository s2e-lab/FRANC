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
        URL u = new URL(url);
        InputStream in = u.openStream();
        OutputStream os = new FileOutputStream(fileName);
        byte[] buf = new byte[1024];
        int read;
        while ((read = in.read(buf))!= -1) {
            os.write(buf, 0, read);
        }
        os.close();
        in.close();
        u.close();
    }
}