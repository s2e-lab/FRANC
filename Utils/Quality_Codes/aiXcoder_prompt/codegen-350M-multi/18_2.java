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

		//System.err.println("bytes read "+len);
		int totalRead = 0;
		try{
			for (int read = 0; totalRead < len && read <= len; )
				totalRead = in.read(buffer, read, len >= read? len -read : Integer.MAX_VALUE);
		}catch(java.io.IOException e){
		}

		if (totalRead < len){
			System.out.println("Not enough bytes to fill buffer");
		}
}
}