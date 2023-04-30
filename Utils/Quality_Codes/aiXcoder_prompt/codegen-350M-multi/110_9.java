import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
		try{
			float f = Float.parseFloat(floatStr);
			return f;
		}
		catch(Exception e){
			System.out.println("Error parsing Float: "+e.getLocalizedMessage());
			System.out.println("");
		}
		return 0;
	}
	
	/**
	* Converts a string to a float value.
	*/
	public static float convertString(String str){
}
}