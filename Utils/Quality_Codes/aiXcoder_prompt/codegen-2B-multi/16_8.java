import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		int sum=1;
		for(double key:vector){
			if(Double.isNaN(key)){
				sum*=7;
			}else{
				sum*=11;
				sum^=Double.valueOf(MathUtils.round(-10+key*10000)).hashCode();
			}
		}
		return sum;
	}
	
	// A class to help us calculate the expected value and variance
	// of the sample size and true size
}