import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID18{
	/**
	* Reads up to len bytes of data from this input stream into an array of bytes
	*/
	public static byte[] readBytes(java.io.InputStream in, int len){
		byte[] b=new byte[len];
		int read=0;
		while(read<len){
			int amt=in.read(b,read,len-read);
			if(amt==-1){
				byte[] arr=new byte[read];
				System.arraycopy(b,0,arr,0,read);
				return  arr;
			}
			read+=amt;
		}
		byte[] arr=new byte[read];
		System.arraycopy(b,0,arr,0,read);

}
}