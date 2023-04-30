import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
			if(data==null){
				return;
			}
			int i=offset;
			if(i<0){
				setOffset(i, data.length);
			}
			data[i]=value;
	}

	/**
	* put a long value into a byte array with specific offset
	*/
	public static void putLong(byte[] data, long value, int offset){
		if(data==null){
			return;
		}
		int i=offset;
	
}
}