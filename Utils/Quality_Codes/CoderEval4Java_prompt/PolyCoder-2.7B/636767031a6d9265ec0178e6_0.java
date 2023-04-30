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
		 if(array == null){
			return null;
		}	// end two blocks
		
		
		int length = array.length;
		 // Check length >= 0, -1 < 2 ^ 31.
		
		if(length==-1){
			return null;
		}
		 
	  if(length == 0){
	      return new byte[]{};
	  }
	  if(length == 1){
	      return new byte[]{}; 
	  }
	  
}
}