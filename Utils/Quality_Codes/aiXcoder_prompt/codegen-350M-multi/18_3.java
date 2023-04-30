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
		int count = 0;
		byte b;
		while( (count = in.read(buf)) >= 0) {
			b = buf[count-1];
			buf[count-1] = b;
		}
		return buf;
	}
}
