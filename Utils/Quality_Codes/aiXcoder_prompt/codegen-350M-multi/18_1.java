import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[] bytes = new byte[len];
		for(int i = 0; i < len; i++){
			int bytesread = in.read(bytes, i, len-i);
			if(bytesread == -1){ return bytes; }
		}
		return bytes;
	}
	
	/**
	* Reads up to len bytes of data from a byte array
	*/
	public static byte[] readBytes(byte[] bytes,int len){
		int len1 = bytes.length;
}
}