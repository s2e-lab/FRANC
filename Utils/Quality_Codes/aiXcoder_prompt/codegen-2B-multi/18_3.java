import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		
		byte[] b;
		
		if(len<2)
			b = new byte[len];
		else
			b = new byte[2*len];
		b[0] = -1;
		
}
}