import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID122{
	/**
	* Returns true if all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
	*/
	public static boolean isNonNegative(long[][] in){
			if (in == null) return true;
			if (in.length < 1) return false;

			int inDimension;
			int inSize;
			
			inDimension = in.length;
			
			if (in.length < 2)
				return true;
				
			inSize = in[0].length;
			if (inSize < 2)
				return true;

			int indexIn = 0;
}
}