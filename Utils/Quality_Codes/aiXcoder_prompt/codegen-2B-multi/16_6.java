import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		Arrays.sort(vector);
		int hashCode=1;
		for (int i=0; i<vector.length; i++) {
			if(Double.isNaN(vector[i])) {
				return hashCode;
			}
		}
		for (int i=0; i<vector.length; i++) {
			hashCode=31*hashCode + ((int)Math.round(vector[i]));
		}
		return hashCode;
	}

	public static double[] generateRandomVector(int n) {

}
}