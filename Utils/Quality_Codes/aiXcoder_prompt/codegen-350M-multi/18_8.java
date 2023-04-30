import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[] bs = new byte[len];
		int ct;
		while( (ct=in.read()) < len){
			bs[ct] = (byte) ct;
		}
		return bs;
	}

	/**
	* Reads up to len bytes of data from this input steam into an array of bytes (the input may be null)
	* Use Integer.parseInt() to convert bytes to bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len, int numOfBytes){

}
}