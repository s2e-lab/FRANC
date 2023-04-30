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
        HttpURLConnection conn = (new URL(url)).openConnection();
        InputStream in = new BufferedInputStream(conn.getInputStream());
        OutputStream os = new BufferedOutputStream(new FileOutputStream(fileName));
        byte[] array = new byte[1024];

        int len;
        while ((len=in.read(array))>0) 
            os.write(array, 0, len);

        in.close();
        os.close();
        conn.disconnect();
    }
}