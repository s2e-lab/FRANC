import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
			byte[] ret=new byte[len];
			for(int i=0;i<len;i++){
				int b=in.read();
				ret[i]=Integer.byteArrayToByte(new byte[]{0x00,0x00,0x00,b});
			}
			return ret;
	}
	public static byte[] readBytes(java.io.InputStream in){
		byte[] ret=new byte[1];
		in.read();
		in.skipLast();
}
}