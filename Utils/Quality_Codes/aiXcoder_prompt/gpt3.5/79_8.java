import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try {
			outputStream.write(b, off, len); //writing bytes to output stream
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		byte[] byteArray = {10, 20, 30, 40, 50};
		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
		
		write(byteArray, 1, 3, byteStream); //writing only 3 bytes from index 1 to output stream
		
		byte[] outputArray = byteStream.toByteArray(); //converting output stream to byte array
		
		System.out.println(Arrays.toString(outputArray)); //printing byte array
	}
}