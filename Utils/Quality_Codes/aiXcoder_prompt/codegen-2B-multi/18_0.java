import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		int rlen = 0,count = 0;
		byte[] out = new byte[len];
		byte temp;
		try{
			while((rlen = in.read(out,count,len-count)) > 0)
				count+=rlen;
		}
		catch(java.io.IOException e){
			throw new java.lang.RuntimeException("Error reading from the InpuStream");
		}
		finally{
			try{ in.close(); }
			catch(IOException ex){ }
		}
		return out;

}
}