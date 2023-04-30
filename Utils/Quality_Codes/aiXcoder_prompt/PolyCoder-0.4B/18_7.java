import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
			byte[] buffer = new byte[len];
			byte[] buffer2 = new byte[len];
			byte[] buff = new byte[2];
		
			int n = 0;
			while((n=in.read(buffer)) >= 0) {
			
				buff[n] = (byte) (buffer[n] & 0xff);
			}
			
}
}