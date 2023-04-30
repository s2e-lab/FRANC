import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
			byte[] out = new byte[len];
			int n, offset = 0;
			n = in.read(out, 0, len);
			while (n>0)
			{
				offset += n;
				if (offset==len)
					break;
				n = in.read(out, offset, len-offset);
			}
			in.close();
			return out;
	}
	
}