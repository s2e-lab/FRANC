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
		int total=0;
		for(int i=0;i<len;i++){
			int b = in.read();
			if( b<0 ) break;
			bytes[total] = (byte)b;
			total++;
		}				
		return bytes;
	}
}











