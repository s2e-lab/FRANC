import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		double[] dupVector = (double[]) vector.clone();
		Arrays.sort(dupVector);
		
		int code = 0;
		for(Double aDouble : dupVector)
			if(aDouble.isNaN()) code += 0; 
			else code ^= aDouble.hashCode();
		
		return code;
	}

	public static void main(String[] args) throws java.lang.Exception{
		//String testString = "100.0,200.0,300.0,500.0,700.0,
}
}