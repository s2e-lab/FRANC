import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[] bytes;
		try{
			bytes = new byte[len];
			in.read(bytes,0,bytes.length);
		} catch(IOException e){
			throw new RuntimeException("Cannot read from input stream.", e);
		}
		return bytes;
	}
	/**
	* Writes out at most len bytes of data from an array of bytes
	*/
	public void writeBytes(java.io.OutputStream out, byte[] bytes, int off, int len){
}
}