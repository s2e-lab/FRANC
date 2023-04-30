import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID6{
	/**
	* put a short value into a byte array with specific offset
	*/
	public static void putShort(byte[] data, short value, int offset){
			if(data!=null){
				for(int i=offset,j=offset+1;i<data.length;i++,j++){
					data[j] = (byte)((value>>8)&0xFF);
				}
			}
	}

    public static void putShort(short 	data, int offset, short v) 	{
}
}