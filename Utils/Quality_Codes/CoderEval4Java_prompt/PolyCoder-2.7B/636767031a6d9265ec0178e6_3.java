import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtils{
	/** 
	 * <p>Converts an array of object Bytes to primitives.</p> <p>This method returns <code>null</code> for a <code>null</code> input array.</p>
	 * @param array  a <code>Byte</code> array, may be <code>null</code>
	 * @return a <code>byte</code> array, <code>null</code> if null array input
	 * @throws NullPointerException if array content is <code>null</code>
	 */
	
	public static byte[] toPrimitive(final Byte[] array){
		 if (array == null) return null;
	    final int length = array.length;
	    final byte[] out = new byte[length];
	    for (int i = 0; i<length; i++){
	        out[i] = array[i].byteValue();
	    }
	    return out;
	}

  static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

}