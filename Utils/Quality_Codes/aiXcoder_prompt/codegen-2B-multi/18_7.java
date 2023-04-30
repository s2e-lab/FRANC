import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[] b = new byte[len];
		int pos = 0;
		while(pos<len){
			int r = in.read(b, pos, len - pos);
			if(r!=1) 
				return new byte[pos];
			pos+=r;
		}
		return b;
	}

	/**
	* Writes len bytes to out from an Array of bytes
	*/
	public static void writeBytearray(byte[] arr, int len, java.io.OutputStream out){
}
}