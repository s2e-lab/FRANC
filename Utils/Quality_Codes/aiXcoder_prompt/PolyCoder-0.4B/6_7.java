import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
			for(int i = offset; i < offset + 2; i++){
				int c = data[i];
				if(c > 0xff){
					c -= 0x100;
				}

				c = (c & 0xff) + ((value ^ (c >> 8)) & 0xff);
				data[i] = (byte)c;
			}
		}

	/**
	* put a byte value into a short array
	*/
}