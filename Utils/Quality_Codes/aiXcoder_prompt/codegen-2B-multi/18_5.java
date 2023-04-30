import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[] data = new byte[len];
		int offset = 0;
		while (offset <= (len - 1)){
			if (offset + 1 > data.length){
				data = new byte[Math.max(len, 2 * data.length)];
			}
			int t = in.read(data, offset, (len - offset));
			if (t == -1){
				break;
			}
			offset += t;
		}
}
}