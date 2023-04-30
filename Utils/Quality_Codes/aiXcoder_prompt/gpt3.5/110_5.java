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
	}catch(NumberFormatException e){
		return 0f;
	}
}

public static void main(String[] args) throws Exception{
	Scanner in = new Scanner(System.in);
	String[] input = in.nextLine().split("\\s+");

	float a = parseFloat(input[0]);
	float b = parseFloat(input[1]);

	float result = a*b;
	BigDecimal bd = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
	System.out.println(bd);
}
}