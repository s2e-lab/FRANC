import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[] buf1 = new byte[len];
		try{
			for(int counter1 = 0; counter1 < len; counter1++){
				buf1[counter1] = (byte) (in.read() & 0xff);
			}
			in.close();
		}
		catch(java.io.IOException IOException1){
		}
		return buf1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
}
}