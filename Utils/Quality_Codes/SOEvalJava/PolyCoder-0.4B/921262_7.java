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
        if(url==null) return;
        java.io.File file = new java.io.File(url);
        java.io.FileInputStream fis = null;
        long start_time = System.currentTimeMillis();
        File theFile = new File(url+fileName);
        FileOutputStream fos = new FileOutputStream(theFile);
}
}