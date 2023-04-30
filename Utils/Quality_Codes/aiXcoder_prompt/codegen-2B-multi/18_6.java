import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[] buf = new byte[len];
		while(len>0) {
			int c1 = in.read();
			while(c1!=0){
				buf[len-=1] = (byte) c1;
				c1 = in.read();
			}
		}
		return buf;
	}


	public static void main(String[] args){
}
}