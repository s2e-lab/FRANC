import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
		int total;

		try{
			while((len > 0) && (total = in.read(8)) > 0){
				out.write(len - total);
				out.write(len & 0xFF);
				len = 0;
			}
		}
		catch(java.io.IOException e){
		}

		return out.toByteArray();
	}

}