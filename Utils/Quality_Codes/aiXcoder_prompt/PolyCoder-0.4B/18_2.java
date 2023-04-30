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
			int cur = 0;
			while ( (null!= in) && (cur + len < in.length) )
				bytes[cur++] = (byte)in.read();
			return bytes;
	}

	public static int readShortFromLittleEndian(){
}
}