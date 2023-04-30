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
        Object[] params = {url};
        run(params, System.out, System.err);
    }
	
    public static void downloadTo(String url, String fileName) throws Exception {
        URL u = new URL(url);
        InputStream stream = u.openStream();

        File dest = new File(fileName);
        dest.deleteOnExit();
		
        FileOutputStream fout = new FileOutputStream(dest);
        int len;
        byte[] buffer = new byte[1024];

}
}