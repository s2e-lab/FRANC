import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
		 outputStream.write(b, off, len);
	}
	
	/**
	* Reads up to this number of bytes from this output stream and writes it to the specified
	* byte array starting from this offset.
	*/
	public static int read(InputStream inputStream, byte[] b, int off, int len){
		int bLen = 0;
}
}