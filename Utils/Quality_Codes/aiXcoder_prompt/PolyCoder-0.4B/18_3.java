import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		 int n = 0;
		 ByteArrayOutputStream baos = new ByteArrayOutputStream(len);
		 try{
			  while (n == 0){
				 byte[] t;
				 do
					t = baos.toByteArray();
				 while (n == 0);
				 n--;
				 baos.close();
			  }
			  return baos.toByteArray();
		 }
		 catch(IOException ex){
			  ex.printStackTrace();
			  return null;
		 }
	 }
	
}