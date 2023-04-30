import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
		float val = 0;
		String numStr = floatStr.toLowerCase();
		switch(numStr){
		case "hundred":
			val = 100;
			break;
		case "thousand":
			val = 1000;
			break;
		case "million":
			val = 1000000;
			break;
		case "billion":
			val = 100000000;
			break;
		default:
			throw new Error();
		}
		return val;
	}

}