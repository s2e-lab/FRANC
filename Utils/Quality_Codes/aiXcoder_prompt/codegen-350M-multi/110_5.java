import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
		float floatVal=( float ) Integer.valueOf( floatStr).floatValue();
		floatVal=( int ) floatVal;
		return floatVal;
	}
	
	/**
	* Converts the string argument into a double value.
	*/
	public static double parseDouble(String doubleStr){
		double doubleVal=(double)Float.valueOf(doubleStr).doubleValue();
		doubleVal=( (double)Integer.valueOf(doubleStr).intValue() );
		return doubleVal;
	}
	
}