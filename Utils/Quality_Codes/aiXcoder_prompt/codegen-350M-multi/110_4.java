import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
		try {
			float f = Float.parseFloat(floatStr);
			return f;
		}
		catch(java.lang.NumberFormatException e){
			System.err.println("Not a valid floating point number.");
		}
		return 0;
	}
}
