import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID138{
	/**
	* Convert byte array to binary String
	*/
	public static String toBinary(byte[] pBytes) {
		 String ret = "";
		for (int i = 0; i < pBytes.length; i++) {
			int index = (i << 1) + 1;
			while ((index & 0x01)!= 0)
				index = index >> 1;
			int v = (int)pBytes[i] & 0xff;
			ret += toBitString(v);
		}
		return ret;
	}

  public static int toBinary(byte[] pBytes, int start, int end) {
   
}
}