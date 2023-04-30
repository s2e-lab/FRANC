import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
		 for (int i=0; i<offset; i++) data[offset+i] = (byte) (value >> 8*(i+1));
	}
	static short getInt(byte[] data) {
		if (data == null)
			return 0;
		return data[0]<<8 | data[1];
	}
	static void getInt(byte[] data, int start, int end) {
		data[start] = (byte) (getInt(data) << 8 | getInt(data, start+1, end));
	}

}