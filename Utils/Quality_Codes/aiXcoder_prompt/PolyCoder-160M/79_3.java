import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			write(b, off, len);
			outputStream.write(b, off, len);
	}
	
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len){
			encodeByte(b[off], off, len);
			write(b, off, len);
			write(b, off, len);
			//System.out.println(b.toString());
	}
	
}