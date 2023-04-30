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
		int sign=-1;
		int exponent=0;
		int mantissa=(int)Math.pow(10,sign);
		if(floatStr.trim().startsWith("-")){
			sign=-1;
			exponent-=1;
			mantissa=0;
			floatStr=floatStr.substring(1).trim();
		}
}
}