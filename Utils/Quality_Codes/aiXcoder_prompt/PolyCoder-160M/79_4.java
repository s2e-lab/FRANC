import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			while(len>0){
				if(off>=b.length) return;
				if(outputStream == null){
					outputStream=new OutputStreamWriter();
				}
				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
				outputStreamWriter.write(b, off, len);
				len -= b.length;
				outputStreamWriter.flush();
			}
		}
	
}