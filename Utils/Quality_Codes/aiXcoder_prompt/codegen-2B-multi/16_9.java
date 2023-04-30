import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		long l;
		
		boolean n;
		int i;
		l = 0L;
		n = false;
		for (i=0; i<vector.length; i++){
			if (Double.isNaN(vector[i])){
				n = true;
			} else {
				n = false;
				if (n){
					l = l+i;
				}
			}						// end if
		}				// end for		
}
}