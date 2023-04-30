import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
		switch (floatStr.charAt(0)){
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			return Float.parseFloat(floatStr);
		}

		if (null == floatStr || floatStr.length() == 0){
			return 0f;
		}
}
}