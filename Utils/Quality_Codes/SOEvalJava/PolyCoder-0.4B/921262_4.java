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
        URL urlo = new URL(url);
        URLConnection yc = urlo.openConnection();
        // Create the connection
        // You would call yc.setRequestProperty("Connection", "Keep-Alive") or yc.setRequestProperty("Proxy-Connection", "Keep-Alive");
        // and you could call yc.getConnection().readFile().

        // The FileHandle for the connection will be created and
}
}