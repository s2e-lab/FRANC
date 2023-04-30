import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			//System.out.println();
			int total=0;
			if (off>limit) {
				total=limit;
				off=limit-1;
			}
			outputStream.write(b, 0, off, total);
			limit+=len;
			for (int i=off; i<off+len; i++){
				outputStream.write(b[i]);
			}
			off+=len;
}
}