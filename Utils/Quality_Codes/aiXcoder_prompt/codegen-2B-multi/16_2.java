import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		long[] array = { 17 * doubleToLongBits(vector[0]), 17 * doubleToLongBits(vector[1]), 0 };
		return (int) (Double.doubleToLongBits(doubleToLongBits(vector[2]) * Math.cos(Double.doubleToLongBits(vector[3]))) + array.hashCode());
	}
	
	// Hash for all NaN
	public static int hashCode(double[] vector, int off, int len){
}
}