import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID101{
	/**
	* Create a copy of the Integer array.
	*/
	public static int[] copy(int[] arr){
			if (arr==null) 			return null;
			int[] newArr=new int[arr.length];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			return newArr;
	}

	/** Converts a short value to a byte array. */
	public static byte[] toByteArray(short s){
		byte[] out = new byte[2];

		out[0] = (byte) s;
		out[1] = (byte) (s >>> 8);
		
}
}