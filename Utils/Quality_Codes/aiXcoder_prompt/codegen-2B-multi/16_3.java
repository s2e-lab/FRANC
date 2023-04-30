import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		int h = 1025894146;
		for (double anElement : vector) h = h ^ ((h << 5) + (h >> 3) + (int) (anElement * 113));
		return h;
	}



	/**
	* Get a string representation of the real vector. All NaN values should be printed as 'NaN' and all positive numbers as x_i, where i = 0 to n-1.
	*/

	public static String realVectorToString(double[] vector){
		int index = 0;
}
}