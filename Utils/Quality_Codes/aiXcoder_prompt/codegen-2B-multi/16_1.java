import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		int hash = 0;
		
		
		for (double x : vector) {
			if (Double.isNaN(x))
				return hash;
			
			int tmp = ((int)Math.floor(x)) * 37 + 0x7FFFFFFF; // 0x7FFFFFFF * 2^32 / Math.abs(x) = 0x80000000 + Math.abs(x)
			final int sign = x<0? -1 : 1;
			hash ^= tmp * sign;
		}
		
		return hash;
	
}
}