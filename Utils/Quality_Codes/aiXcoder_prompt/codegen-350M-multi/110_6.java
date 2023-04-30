import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
		float floatVal;
		try{
			floatVal = Float.valueOf(floatStr);
		} catch(NumberFormatException e){
			floatVal = 0;
		}
		return floatVal;
	}
	
	
	public static void main(String args[]){
		String[] argsArray = args;
		int currentParam = 0;
		String str;
		int i = 0;
		float floatVal = 0;
}
}