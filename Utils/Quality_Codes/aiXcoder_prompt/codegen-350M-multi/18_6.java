import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[]  buf = new byte[len];
		int     read = in.read(buf);
		while(read > 0){
			read = in.read(buf);
		}
		return buf;
	}

	/**
	* Writes an array of bytes of data from a byte array into an input stream
	*/
	public static void writeBytes(InputStream inSource, java.io.OutputStream outDest, byte[] inArray){
            outDest.write(inArray);
		outDest.flush();
	}
}