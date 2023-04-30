import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
		float f = 0;
		try {
			f = Float.parseFloat(floatStr);
		} 
		catch ( Exception e ) {
			throw new IllegalArgumentException("Invalid float argument");
		} 
		
		return f;
	} // end method getFloat

	/**
	* Converts the string argument into a double value.
	*/
	public static double parseDouble(String doubleStr){
		double d = 0;
}
}